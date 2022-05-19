package com.example.coadingtest;

public class ParkingLot {
    public static void main(String[] args) {
    	ParkingLot ps=new ParkingLot();
        int [] slot=new int[3];
        int [] emptySlot=new int[3];
        int [] fullSlot=new int[3];
        ps.parkVehicle(1,slot);
        ps.parkVehicle(2,slot);
        ps.parkVehicle(3,slot);
        ps.removeVehicle(2,slot);
        ps.removeVehicle(3,slot);
        ps.parkVehicle(4,slot);

    }
     void parkVehicle(int vehicleId,int [] slot) {
         if (isAllSlotFull(slot)) {
             int parkingSlot = findNearestEmptySlot(slot);
             slot[parkingSlot] = vehicleId;
             System.out.println("vehicle " + vehicleId + " is parked in slot :" + ++parkingSlot);
         } else {
             System.out.println("All slot is full." +"vehicle " + vehicleId+ " can not be parked ");
         }

     }
    void removeVehicle(int vehicleId,int [] slot)
    {
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == vehicleId) {
                slot[i]=0;
                System.out.println("vehicle " + vehicleId + " is removed from slot :" + ++i);
            }
        }
    }
    int findNearestEmptySlot(int [] slot)
    {
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    boolean isAllSlotFull(int [] slot) {
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == 0) {
                return true;
            }
        }
        return false;
    }
    int freeSlot(int [] slot)
    {
        int freeSlot = 0;
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == 0) {
                freeSlot++;
            }
        }
        return freeSlot;
    }

}
