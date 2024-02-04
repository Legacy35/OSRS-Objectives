package org.legacy.data;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.client.game.ItemManager;

import javax.annotation.Nullable;
import javax.inject.Inject;


public class BankData {
    @Inject
    private ItemManager itemManager;
    @Inject
    private Client client;
    @Getter
    private long totalValue;
    private long bankValue;
    private long equipmentValue;
    private long InventoryValue;
    private long seedVault;
    private long group_storage;
    private long group_storage_inv;

    public BankData() {
        this.updateValues();
    }
    private void resetValues(){
        totalValue = 0;
        bankValue = 0;
        equipmentValue = 0;
        InventoryValue = 0;
        seedVault = 0;
        group_storage = 0;
        group_storage_inv = 0;
    }
    private void updateValues() {
        resetValues();
        bankValue += this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.BANK));
        equipmentValue += this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.EQUIPMENT));
        InventoryValue += this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.INVENTORY));
        seedVault += this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.SEED_VAULT));
        group_storage += this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.GROUP_STORAGE));
        group_storage_inv += this.calculateTotalValueOfItems(this.getItemsFromAStorage(InventoryID.GROUP_STORAGE_INV));
        totalValue = bankValue + equipmentValue + InventoryValue + seedVault + group_storage + group_storage_inv;
    }
    private Item[] getItemsFromAStorage(InventoryID inventory) {
        ItemContainer itemContainer = this.client.getItemContainer(inventory);
        return itemContainer == null ? null : itemContainer.getItems();
    }
    long calculateTotalValueOfItems(@Nullable Item[] items) {
        if (items == null) {
            return 0;
        } else {
            long value = 0L;

            for(int i = 0; i < items.length; ++i) {
                Item item = items[i];
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

    public int hashCode() {
        return 59 + (int)(this.getTotalValue() >>> 32 ^ this.getTotalValue());
    }

    public String toString() {
        long var10000 = this.getTotalValue();
        return "BankData(gePrice=" + var10000 + ")";
    }
}
