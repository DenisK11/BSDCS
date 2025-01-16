package FinalProject;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection_Controller2 {

    public static void main (String []args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "PedestrianController";
        pn.SetName("PedestrianController");
        pn.NetworkPort = 1084;

        DataString p16 = new DataString();
        p16.SetName("p16");
        p16.SetValue("red");
        pn.ConstantPlaceList.add(p16);

        DataString p19 = new DataString();
        p19.SetName("p19");
        p19.SetValue("red");
        pn.ConstantPlaceList.add(p19);

        DataString p24 = new DataString();
        p24.SetName("p24");
        p24.SetValue("red");
        pn.ConstantPlaceList.add(p24);

        DataString p30 = new DataString();
        p30.SetName("p0");
        p30.SetValue("red");
        pn.ConstantPlaceList.add(p30);

        DataString red = new DataString();
        red.SetName("red");
        red.SetValue("red");
        pn.ConstantPlaceList.add(red);

        DataString green = new DataString();
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString yellow = new DataString();
        yellow.SetName("yellow");
        yellow.SetValue("yellow");
        pn.ConstantPlaceList.add(yellow);

        DataString p12 = new DataString();
        p12.SetName("p12");
        pn.PlaceList.add(p12);

        DataString p13 = new DataString();
        p13.SetName("p13");
        pn.PlaceList.add(p13);

        DataString p14 = new DataString();
        p14.SetName("p14");
        pn.PlaceList.add(p14);

        DataString p15 = new DataString();
        p15.SetName("p15");
        pn.PlaceList.add(p15);

        DataString p18 = new DataString();
        p18.SetName("p18");
        pn.PlaceList.add(p18);

        DataString p20 = new DataString();
        p20.SetName("p20");
        pn.PlaceList.add(p20);

        DataString p22 = new DataString();
        p22.SetName("p22");
        pn.PlaceList.add(p22);

        DataString p23 = new DataString();
        p23.SetName("p23");
        pn.PlaceList.add(p23);

        DataString p25 = new DataString();
        p25.SetName("p25");
        pn.PlaceList.add(p25);

        DataString p26 = new DataString();
        p26.SetName("p26");
        pn.PlaceList.add(p26);

        DataString p27 = new DataString();
        p27.SetName("p27");
        pn.PlaceList.add(p27);

        DataString p28 = new DataString();
        p28.SetName("p28");
        pn.PlaceList.add(p28);

        DataString p29 = new DataString();
        p29.SetName("p29");
        pn.PlaceList.add(p29);

        DataTransfer p17 = new DataTransfer();
        p17.SetName("p17");
        p17.Value = new TransferOperation("localhost", "1080" , "P_TL1");
        pn.PlaceList.add(p17);

        DataTransfer p32 = new DataTransfer();
        p32.SetName("p32");
        p32.Value = new TransferOperation("localhost", "1080" , "P_TL2");
        pn.PlaceList.add(p32);

        DataTransfer p33 = new DataTransfer();
        p33.SetName("p33");
        p33.Value = new TransferOperation("localhost", "1080" , "P_TL3");
        pn.PlaceList.add(p33);

        DataTransfer p34 = new DataTransfer();
        p34.SetName("p34");
        p34.Value = new TransferOperation("localhost", "1080" , "P_TL4");
        pn.PlaceList.add(p34);

        DataInteger Five = new DataInteger();
        Five.SetName("Five");
        Five.SetValue(5);
        pn.ConstantPlaceList.add(Five);

        DataInteger Ten = new DataInteger();
        Ten.SetName("Ten");
        Ten.SetValue(10);
        pn.ConstantPlaceList.add(Ten);

        //----------------------------T9------------------------------------
        PetriTransition t9 = new PetriTransition(pn);
        t9.TransitionName = "T9";
        t9.InputPlaceName.add("p15");
        t9.InputPlaceName.add("p16");

        Condition T9Ct1 = new Condition(t9, "p15", TransitionCondition.NotNull);
        Condition T9Ct2 = new Condition(t9, "p16", TransitionCondition.IsNull);
        T9Ct1.SetNextCondition(LogicConnector.AND, T9Ct2);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition= T9Ct1;
        grdT9.Activations.add(new Activation(t9, "p12", TransitionOperation.Move, "p13"));
        grdT9.Activations.add(new Activation(t9, "Five", TransitionOperation.DynamicDelay,""));
        t9.GuardMappingList.add(grdT9);

        Condition T9Ct1_1 = new Condition(t9, "p15", TransitionCondition.NotNull);
        Condition T9Ct2_1 = new Condition(t9, "p16", TransitionCondition.NotNull);
        T9Ct1_1.SetNextCondition(LogicConnector.AND, T9Ct2_1);

        GuardMapping grdT9_2 = new GuardMapping();
        grdT9_2.condition= T9Ct1;
        grdT9_2.Activations.add(new Activation(t9, "p12", TransitionOperation.Move, "p13"));
        grdT9_2.Activations.add(new Activation(t9, "Ten", TransitionOperation.DynamicDelay,""));
        t9.GuardMappingList.add(grdT9_2);

        t9.Delay = 0;
        pn.Transitions.add(t9);

        //----------------------------T10------------------------------------
        PetriTransition t10 = new PetriTransition(pn);
        t10.TransitionName = "T10";
        t10.InputPlaceName.add("p18");
        t10.InputPlaceName.add("p19");

        Condition T10Ct1 = new Condition(t10, "p18", TransitionCondition.NotNull);
        Condition T10Ct2 = new Condition(t10, "p19", TransitionCondition.NotNull);
        T10Ct1.SetNextCondition(LogicConnector.AND, T10Ct2);

        Condition T10Ct1_1 = new Condition(t10, "p18", TransitionCondition.NotNull);
        Condition T10Ct2_1 = new Condition(t10, "p19", TransitionCondition.IsNull);
        T10Ct1_1.SetNextCondition(LogicConnector.AND, T10Ct2_1);

        GuardMapping grdT10_1 = new GuardMapping();
        grdT10_1.condition= T10Ct1_1;
        grdT10_1.Activations.add(new Activation(t10, "p14", TransitionOperation.Move, "p20"));
        grdT10_1.Activations.add(new Activation(t10, "Five", TransitionOperation.DynamicDelay,""));
        t10.GuardMappingList.add(grdT10_1);


        GuardMapping grdT10 = new GuardMapping();
        grdT10.condition= T10Ct1;
        grdT10.Activations.add(new Activation(t10, "p14", TransitionOperation.Move, "p20"));
        grdT10.Activations.add(new Activation(t10, "Ten", TransitionOperation.DynamicDelay,""));
        t10.GuardMappingList.add(grdT10);

        t10.Delay = 0;
        pn.Transitions.add(t10);

        //----------------------------T13------------------------------------
        PetriTransition t13 = new PetriTransition(pn);
        t13.TransitionName = "T13";
        t13.InputPlaceName.add("p23");
        t13.InputPlaceName.add("p25");

        Condition T13Ct1 = new Condition(t13, "p23", TransitionCondition.NotNull);
        Condition T13Ct2 = new Condition(t13, "p25", TransitionCondition.NotNull);
        T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

        Condition T13Ct1_1 = new Condition(t13, "p23", TransitionCondition.NotNull);
        Condition T13Ct1_2 = new Condition(t13, "p25", TransitionCondition.IsNull);
        T13Ct1_1.SetNextCondition(LogicConnector.AND, T13Ct1_2);

        GuardMapping grdT13_1 = new GuardMapping();
        grdT13_1.condition= T13Ct1_1;
        grdT13_1.Activations.add(new Activation(t13, "p22", TransitionOperation.Move, "p25"));
        grdT13_1.Activations.add(new Activation(t13, "Five", TransitionOperation.DynamicDelay,""));
        t13.GuardMappingList.add(grdT13_1);

        GuardMapping grdT13 = new GuardMapping();
        grdT13.condition= T13Ct1;
        grdT13.Activations.add(new Activation(t13, "p22", TransitionOperation.Move, "p25"));
        grdT13.Activations.add(new Activation(t13, "Five", TransitionOperation.DynamicDelay,""));
        t10.GuardMappingList.add(grdT13);

        t13.Delay = 0;
        pn.Transitions.add(t13);

        //----------------------------T18------------------------------------
        PetriTransition t18 = new PetriTransition(pn);
        t18.TransitionName = "T18";
        t18.InputPlaceName.add("p29");
        t18.InputPlaceName.add("p30");

        Condition T18Ct1 = new Condition(t18, "p29", TransitionCondition.NotNull);
        Condition T18Ct2 = new Condition(t18, "p30", TransitionCondition.NotNull);
        T18Ct1.SetNextCondition(LogicConnector.AND, T18Ct2);

        Condition T18Ct1_1 = new Condition(t18, "p29", TransitionCondition.NotNull);
        Condition T18Ct1_2 = new Condition(t18, "p30", TransitionCondition.IsNull);
        T18Ct1_1.SetNextCondition(LogicConnector.AND, T18Ct1_2);

        GuardMapping grdT18_1 = new GuardMapping();
        grdT18_1.condition= T18Ct1_1;
        grdT18_1.Activations.add(new Activation(t18, "p26", TransitionOperation.Move, "p27"));
        grdT18_1.Activations.add(new Activation(t18, "Ten", TransitionOperation.DynamicDelay,""));
        t18.GuardMappingList.add(grdT18_1);

        GuardMapping grdT18 = new GuardMapping();
        grdT18.condition= T18Ct1;
        grdT18.Activations.add(new Activation(t18, "p26", TransitionOperation.Move, "p27"));
        grdT18.Activations.add(new Activation(t18, "Five", TransitionOperation.DynamicDelay,""));
        t18.GuardMappingList.add(grdT18);

        t18.Delay = 0;
        pn.Transitions.add(t18);

        //----------------------------T6------------------------------------
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "T6";
        t6.InputPlaceName.add("p12");


        Condition T6Ct1 = new Condition(t6, "p12", TransitionCondition.NotNull);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition= T6Ct1;
        grdT6.Activations.add(new Activation(t6, "p12", TransitionOperation.Move, "p13"));
        grdT6.Activations.add(new Activation(t6, "p12", TransitionOperation.Move, "p15"));
        grdT6.Activations.add(new Activation(t6, "green", TransitionOperation.Move, "p17"));

        t6.GuardMappingList.add(grdT6);

        t6.Delay = 5;
        pn.Transitions.add(t6);

        //----------------------------T7------------------------------------
        PetriTransition t7 = new PetriTransition(pn);
        t7.TransitionName = "T7";
        t7.InputPlaceName.add("p13");


        Condition T7Ct1 = new Condition(t7, "p13", TransitionCondition.NotNull);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition= T7Ct1;
        grdT7.Activations.add(new Activation(t7, "p13", TransitionOperation.Move, "p14"));
        grdT7.Activations.add(new Activation(t7, "yellow", TransitionOperation.SendOverNetwork, "p17"));

        t7.GuardMappingList.add(grdT7);

        t7.Delay = 5;
        pn.Transitions.add(t7);


        //----------------------------T8------------------------------------
        PetriTransition t8 = new PetriTransition(pn);
        t8.TransitionName = "T8";
        t8.InputPlaceName.add("p14");

        Condition T8Ct1 = new Condition(t8, "p14", TransitionCondition.NotNull);

        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition= T8Ct1;
        grdT8.Activations.add(new Activation(t8, "p14", TransitionOperation.Move, "p18"));
        grdT8.Activations.add(new Activation(t8, "p14", TransitionOperation.Move, "p20"));
        grdT8.Activations.add(new Activation(t8, "red", TransitionOperation.SendOverNetwork, "p17"));
        grdT8.Activations.add(new Activation(t8, "green", TransitionOperation.SendOverNetwork, "p32"));

        t8.GuardMappingList.add(grdT8);

        t8.Delay = 5;
        pn.Transitions.add(t8);


        //----------------------------T11------------------------------------
        PetriTransition t11 = new PetriTransition(pn);
        t11.TransitionName = "T11";
        t11.InputPlaceName.add("p20");


        Condition T11Ct1 = new Condition(t11, "p20", TransitionCondition.NotNull);

        GuardMapping grdT11 = new GuardMapping();
        grdT11.condition= T11Ct1;
        grdT11.Activations.add(new Activation(t11, "p20", TransitionOperation.Move, "p22"));
        grdT11.Activations.add(new Activation(t11, "yellow", TransitionOperation.SendOverNetwork, "p327"));

        t11.GuardMappingList.add(grdT11);

        t11.Delay = 5;
        pn.Transitions.add(t11);

        //----------------------------T12------------------------------------
        PetriTransition t12 = new PetriTransition(pn);
        t12.TransitionName = "T12";
        t12.InputPlaceName.add("p22");


        Condition T12Ct1 = new Condition(t12, "p22", TransitionCondition.NotNull);

        GuardMapping grdT12 = new GuardMapping();
        grdT12.condition= T12Ct1;
        grdT12.Activations.add(new Activation(t12, "p22", TransitionOperation.Move, "p23"));
        grdT12.Activations.add(new Activation(t12, "p22", TransitionOperation.Move, "p25"));
        grdT12.Activations.add(new Activation(t12, "red", TransitionOperation.SendOverNetwork, "p32"));
        grdT12.Activations.add(new Activation(t12, "green", TransitionOperation.SendOverNetwork, "p33"));

        t12.GuardMappingList.add(grdT12);

        t12.Delay = 5;
        pn.Transitions.add(t12);

        //----------------------------T14------------------------------------
        PetriTransition t14 = new PetriTransition(pn);
        t14.TransitionName = "T11";
        t14.InputPlaceName.add("p22");


        Condition T14Ct1 = new Condition(t14, "p22", TransitionCondition.NotNull);

        GuardMapping grdT14 = new GuardMapping();
        grdT14.condition= T14Ct1;
        grdT14.Activations.add(new Activation(t14, "p25", TransitionOperation.Move, "p26"));
        grdT14.Activations.add(new Activation(t14, "yellow", TransitionOperation.SendOverNetwork, "p33"));

        t14.GuardMappingList.add(grdT14);

        t14.Delay = 5;
        pn.Transitions.add(t14);

        //----------------------------T15------------------------------------
        PetriTransition t15 = new PetriTransition(pn);
        t15.TransitionName = "T15";
        t15.InputPlaceName.add("p26");


        Condition T15Ct1 = new Condition(t15, "p26", TransitionCondition.NotNull);

        GuardMapping grdT15 = new GuardMapping();
        grdT15.condition= T15Ct1;
        grdT15.Activations.add(new Activation(t15, "p26", TransitionOperation.Move, "p27"));
        grdT15.Activations.add(new Activation(t15, "p26", TransitionOperation.Move, "p29"));
        grdT15.Activations.add(new Activation(t15, "red", TransitionOperation.SendOverNetwork, "p33"));
        grdT15.Activations.add(new Activation(t15, "green", TransitionOperation.SendOverNetwork, "p34"));

        t15.GuardMappingList.add(grdT15);

        t15.Delay = 5;
        pn.Transitions.add(t15);

        //----------------------------T16------------------------------------
        PetriTransition t16 = new PetriTransition(pn);
        t16.TransitionName = "T16";
        t16.InputPlaceName.add("p27");


        Condition T16Ct1 = new Condition(t16, "p27", TransitionCondition.NotNull);

        GuardMapping grdT16 = new GuardMapping();
        grdT16.condition= T16Ct1;
        grdT16.Activations.add(new Activation(t16, "p27", TransitionOperation.Move, "p28"));
        grdT16.Activations.add(new Activation(t16, "yellow", TransitionOperation.SendOverNetwork, "p34"));

        t16.GuardMappingList.add(grdT16);

        t16.Delay = 5;
        pn.Transitions.add(t16);

        //----------------------------T17------------------------------------
        PetriTransition t17 = new PetriTransition(pn);
        t17.TransitionName = "T16";
        t17.InputPlaceName.add("p28");


        Condition T17Ct1 = new Condition(t17, "p28", TransitionCondition.NotNull);

        GuardMapping grdT17 = new GuardMapping();
        grdT17.condition= T17Ct1;
        grdT17.Activations.add(new Activation(t17, "p28", TransitionOperation.Move, "p12"));
        grdT17.Activations.add(new Activation(t17, "red", TransitionOperation.SendOverNetwork, "p34"));

        t17.GuardMappingList.add(grdT17);

        t17.Delay = 5;
        pn.Transitions.add(t17);


        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Controller started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
