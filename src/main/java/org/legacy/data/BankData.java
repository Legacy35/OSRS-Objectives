package org.legacy.data;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.*;
import net.runelite.client.game.ItemManager;
import org.legacy.core.ObjectivesConfig;
import org.legacy.core.ObjectivesPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.legacy.data.Data;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class BankData extends Data{
    @Inject
    private ItemManager itemManager;
    @Inject
    private Client client;
    @Inject
    private ObjectivesConfig config;
    @Getter @Setter
    private long totalValue;
    @Getter
    private long bankValue;
    @Getter
    private long equipmentValue;
    @Getter
    private long InventoryValue;
    @Getter
    private long seedVault;
    @Getter
    private long groupStorage;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public BankData() {
    }
    public void resetValues(){
        totalValue = 0;
        bankValue = config.PlayerBankValue();
        equipmentValue = config.PlayerEquipmentValue();
        InventoryValue = config.PlayerInventoryValue();
        seedVault = config.PlayerSeedVaultValue();
        groupStorage = config.PlayerGroupStorageValue();
    }
    public void updateValues() {
        resetValues();
        log.trace("Updating Player Value");
        bankValue = this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.BANK), bankValue);
        equipmentValue = this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.EQUIPMENT), equipmentValue);
        InventoryValue = this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.INVENTORY), InventoryValue);
        seedVault = this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.SEED_VAULT), seedVault);
        groupStorage = this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.GROUP_STORAGE), groupStorage);
        totalValue = bankValue + equipmentValue + InventoryValue + seedVault + groupStorage;
        log.trace("Bank Value Value: "+bankValue+" , Equipment Value: "+equipmentValue+" , Inventory Value: "+InventoryValue+" , Seed Value: "+seedVault+ " , Group Storage Value: "+groupStorage + " , Total Value: "+totalValue);
        config.PlayerBankValue(bankValue);
        config.PlayerEquipmentValue(equipmentValue);
        config.PlayerInventoryValue(InventoryValue);
        config.PlayerSeedVaultValue(seedVault);
        config.PlayerGroupStorageValue(groupStorage);
    }

    @Override
    public String serializedData() {
        return "BankData(gePrice=" + this.getTotalValue() + ")";
    }

    private Item[] getItemsFromAStorage(InventoryID inventory){
        ItemContainer itemContainer = this.client.getItemContainer(inventory);
        if (itemContainer == null){
            return null;
        }
        log.trace("Checking Inventory: "+inventory);
        return itemContainer == null ? null : itemContainer.getItems();
    }
    long calculateTotalValueOfItems(@Nullable Item[] items, long prevValue) {
        if (items == null) {
            return prevValue;
        } else {
            long value = 0L;

            for (Item item : items) {
                int qty = item.getQuantity();
                int id = item.getId();
                if (id > 0 && qty != 0) {
                    value += (long)this.itemManager.getItemPrice(id) * (long)qty;
                }
            }
            return value;
        }
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof org.legacy.data.BankData)) {
            return false;
        } else {
            org.legacy.data.BankData other = (org.legacy.data.BankData)o;
            return this.getTotalValue() == other.getTotalValue();
        }
    }

}
