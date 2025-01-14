package FinalProject;

import Components.*;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Pedestrian_and_TrafficLight_Controller2 {

	public static void main (String []args) {
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "PedestrianController";
		pn.SetName("PedestrianController");
		pn.NetworkPort = 1085;

		DataString p1 = new DataString();
		p1.SetName("p1");
		p1.SetValue("red");
		pn.ConstantPlaceList.add(p1);

		DataString p0 = new DataString();
		p0.SetName("p0");
		p0.SetValue("red");
		pn.ConstantPlaceList.add(p0);

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

		DataString p2 = new DataString();
		p2.SetName("p2");
		pn.PlaceList.add(p2);

		DataString p3 = new DataString();
		p3.SetName("p3");
		pn.PlaceList.add(p3);

		DataString p4 = new DataString();
		p4.SetName("p4");
		pn.PlaceList.add(p4);

		DataString p5 = new DataString();
		p5.SetName("p5");
		pn.PlaceList.add(p5);

		DataString p6 = new DataString();
		p6.SetName("p6");
		pn.PlaceList.add(p6);

		DataTransfer p10 = new DataTransfer();
		p10.SetName("p10");
		p10.Value = new TransferOperation("localhost", "1080" , "P_TL1");
		pn.PlaceList.add(p10);

		DataTransfer p7 = new DataTransfer();
		p7.SetName("p7");
		p7.Value = new TransferOperation("localhost", "1080" , "P_TL2");
		pn.PlaceList.add(p7);

		DataTransfer p8 = new DataTransfer();
		p8.SetName("p8");
		p8.Value = new TransferOperation("localhost", "1080" , "P_TL3");
		pn.PlaceList.add(p8);

		DataTransfer p9 = new DataTransfer();
		p9.SetName("p9");
		p9.Value = new TransferOperation("localhost", "1080" , "P_TL4");
		pn.PlaceList.add(p9);

		DataTransfer p11 = new DataTransfer();
		p11.SetName("p11");
		p11.Value = new TransferOperation("localhost", "1080" , "P_TL5");
		pn.PlaceList.add(p11);

		//----------------------------T0------------------------------------
		PetriTransition t0 = new PetriTransition(pn);
		t0.TransitionName = "T0";
		t0.InputPlaceName.add("p0");
		t0.InputPlaceName.add("p1");
		t0.InputPlaceName.add("p6");


		Condition T0Ct1 = new Condition(t0, "p0", TransitionCondition.NotNull);
		Condition T0Ct2 = new Condition(t0, "p1", TransitionCondition.NotNull);
		Condition T0Ct3 = new Condition(t0, "p6", TransitionCondition.NotNull);
		T0Ct1.SetNextCondition(LogicConnector.AND, T0Ct2);
		T0Ct1.SetNextCondition(LogicConnector.AND, T0Ct3);

		GuardMapping grdT0 = new GuardMapping();
		grdT0.condition= T0Ct1;
		grdT0.Activations.add(new Activation(t0, "p1", TransitionOperation.Move, "p2"));
		grdT0.Activations.add(new Activation(t0, "yellow", TransitionOperation.SendOverNetwork, "p7"));
		grdT0.Activations.add(new Activation(t0, "yellow", TransitionOperation.SendOverNetwork, "p8"));
		t0.GuardMappingList.add(grdT0);

		t0.Delay = 0;
		pn.Transitions.add(t0);

		//----------------------------T1------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T1";
		t1.InputPlaceName.add("p2");


		Condition T1Ct1 = new Condition(t1, "p2", TransitionCondition.NotNull);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "p2", TransitionOperation.Move, "p3"));
		grdT1.Activations.add(new Activation(t1, "red", TransitionOperation.SendOverNetwork, "p7"));
		grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "p10"));
		grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "p11"));
		grdT1.Activations.add(new Activation(t1, "red", TransitionOperation.SendOverNetwork, "p8"));

		t1.GuardMappingList.add(grdT1);

		t1.Delay = 5;
		pn.Transitions.add(t1);

		//----------------------------T2------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T2";
		t2.InputPlaceName.add("p3");


		Condition T2Ct1 = new Condition(t2, "p2", TransitionCondition.NotNull);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition= T2Ct1;
		grdT2.Activations.add(new Activation(t2, "p3", TransitionOperation.Move, "p4"));
		grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "p10"));
		grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "p11"));

		t2.GuardMappingList.add(grdT2);

		t2.Delay = 5;
		pn.Transitions.add(t2);


		//----------------------------T3------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T3";
		t3.InputPlaceName.add("p4");

		Condition T3Ct1 = new Condition(t3, "p4", TransitionCondition.NotNull);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition= T3Ct1;
		grdT3.Activations.add(new Activation(t3, "p4", TransitionOperation.Move, "p5"));
		grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "p10"));
		grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "p11"));
		grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "p7"));
		grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "p8"));

		t3.GuardMappingList.add(grdT3);

		t3.Delay = 5;
		pn.Transitions.add(t3);


		//----------------------------T4------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T4";
		t4.InputPlaceName.add("p5");


		Condition T4Ct1 = new Condition(t4, "p5", TransitionCondition.NotNull);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition= T4Ct1;
		grdT4.Activations.add(new Activation(t4, "p5", TransitionOperation.Move, "p6"));

		t4.GuardMappingList.add(grdT4);

		t4.Delay = 5;
		pn.Transitions.add(t4);

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
