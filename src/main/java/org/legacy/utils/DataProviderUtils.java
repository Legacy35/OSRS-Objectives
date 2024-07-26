package org.legacy.utils;

import net.runelite.api.Client;
import org.legacy.core.ObjectivesPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DataProviderUtils {
    @Inject
    private Client client;
    private static final Logger log = LoggerFactory.getLogger(ObjectivesPlugin.class);
    public boolean checkCompletionOfVarBitOrVarp(String type, int varBitValue, int offsetOrValue) {
        if(type.equals("player")){
            return lookUpVarPlayerValue(varBitValue,offsetOrValue);
        }else if(type.equals("bits")){
            return lookUpVarBitValue(varBitValue,offsetOrValue);
        }
        else{
            log.error("Attempted to lookup an invalid data stream  of type: "+type);
            return false;
        }
    }
    public boolean lookUpVarBitValue(int varBit, int Value) {
        return client.getVarbitValue(varBit)==Value;
    }
    public boolean lookUpVarPlayerValue(int varpValue, int offset) {
        return isBitSetLittleEndian(varpValue,offset);
    }
    public static boolean isBitSetBigEndian(int number, int bitPosition) {
        return ((number >> (31 - bitPosition)) & 1) != 0;
    }
    public static boolean isBitSetLittleEndian(int number, int bitPosition) {
        //return ((number >> bitPosition) & 1) != 0;
       // String binaryNumber= String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0');
       // log.info("Number: "+number+", Binary: "+binaryNumber+" , bitPosition: "+bitPosition +" , Value: "+ ((number & (1 << bitPosition)) != 0));
        return ((number & (1 << bitPosition)) != 0);
    }
    public int getVarpValue(int VarpIndex) {
        return client.getVarpValue(VarpIndex);
    }
    public static String encodeString(String originalString) {
        try {
            return URLEncoder.encode(originalString, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            // Handle encoding exception
            log.error(""+e);
            return null;
        }
    }
}
