package FinalProject;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataInteger;
import DataObjects.DataString;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection {
	public static void main(String[] args) {

		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Lanes Intersection";

		pn.NetworkPort = 1080;

		// -------------------------------------------------------------------
		// -------------------------------Lane1--------------------------------
		// --------------------------------------------------------------------

		DataCar p1 = new DataCar();
		p1.SetName("P_C0");
		pn.PlaceList.add(p1);

		DataCarQueue p2 = new DataCarQueue();
		p2.Value.Size = 3;
		p2.SetName("P_C1");
		pn.PlaceList.add(p2);

		DataString p3 = new DataString();
		p3.SetName("P_C2");
		pn.PlaceList.add(p3);

		DataString p14 = new DataString();
		p14.SetName("P14");
		pn.PlaceList.add(p14);

		DataString p114 = new DataString();
		p114.SetName("P114");
		pn.PlaceList.add(p114);

		// -------------------------------------------------------------------
		// -------------------------------Lane2--------------------------------
		// --------------------------------------------------------------------

		DataCar p_T0 = new DataCar();
		p_T0.SetName("P_T0");
		pn.PlaceList.add(p_T0);

		DataCarQueue p_T1 = new DataCarQueue();
		p_T1.Value.Size = 3;
		p_T1.SetName("P_T1");
		pn.PlaceList.add(p_T1);

		DataString p_T2 = new DataString();
		p_T2.SetName("P_T2");
		pn.PlaceList.add(p_T2);

		// -------------------------------------------------------------------
		// -------------------------------Lane3--------------------------------
		// --------------------------------------------------------------------

		DataCar p_T5 = new DataCar();
		p_T5.SetName("P_T5");
		pn.PlaceList.add(p_T5);

		DataCarQueue p_T4 = new DataCarQueue();
		p_T4.Value.Size = 3;
		p_T4.SetName("P_T4");
		pn.PlaceList.add(p_T4);

		DataString p_T3 = new DataString();
		p_T3.SetName("P_T3");
		pn.PlaceList.add(p_T3);

		DataString p115 = new DataString();
		p115.SetName("P115");
		pn.PlaceList.add(p115);

		// -------------------------------------------------------------------
		// -------------------------------Lane4--------------------------------
		// --------------------------------------------------------------------

		DataCar p_C5 = new DataCar();
		p_C5.SetName("P_C5");
		pn.PlaceList.add(p_C5);

		DataCarQueue p_C4 = new DataCarQueue();
		p_C4.Value.Size = 3;
		p_C4.SetName("P_C4");
		pn.PlaceList.add(p_C4);

		DataString p_C3 = new DataString();
		p_C3.SetName("P_C3");
		pn.PlaceList.add(p_C3);

		// -------------------------------------------------------------------
		// -------------------------------Lane5 - Left--------------------------------
		// --------------------------------------------------------------------

		DataCar p_16 = new DataCar();
		p_16.SetName("P_16");
		pn.PlaceList.add(p_16);

		DataCarQueue p_17 = new DataCarQueue();
		p_17.Value.Size = 3;
		p_17.SetName("P_17");
		pn.PlaceList.add(p_17);

		DataCarQueue p_18 = new DataCarQueue();
		p_18.Value.Size = 3;
		p_18.SetName("P_18");
		pn.PlaceList.add(p_18);

		DataCarQueue p_157 = new DataCarQueue();
		p_157.Value.Size = 3;
		p_157.SetName("P_157");
		pn.PlaceList.add(p_157);

		DataString p_29 = new DataString();
		p_29.SetName("P_29");
		pn.PlaceList.add(p_29);

		DataString p_23 = new DataString();
		p_23.SetName("P_23");
		pn.PlaceList.add(p_23);

		DataString p_21 = new DataString();
		p_21.SetName("P_21");
		pn.PlaceList.add(p_21);

		DataString p_20 = new DataString();
		p_20.SetName("P_20");
		pn.PlaceList.add(p_20);

		DataString p_19 = new DataString();
		p_19.SetName("P_19");
		pn.PlaceList.add(p_19);

		// -------------------------------------------------------------------
		// -------------------------------Lane6 - Left--------------------------------
		// --------------------------------------------------------------------

		DataCar p_28 = new DataCar();
		p_28.SetName("P_28");
		pn.PlaceList.add(p_28);

		DataCarQueue p_27 = new DataCarQueue();
		p_27.Value.Size = 3;
		p_27.SetName("P_27");
		pn.PlaceList.add(p_27);

		DataCarQueue p_26 = new DataCarQueue();
		p_26.Value.Size = 3;
		p_26.SetName("P_26");
		pn.PlaceList.add(p_26);

		DataCarQueue p_30 = new DataCarQueue();
		p_30.Value.Size = 3;
		p_30.SetName("P_30");
		pn.PlaceList.add(p_30);

		DataString p_160 = new DataString();
		p_160.SetName("P_160");
		pn.PlaceList.add(p_160);

		DataString p_22 = new DataString();
		p_22.SetName("P_22");
		pn.PlaceList.add(p_22);

		DataString p_24 = new DataString();
		p_24.SetName("P_24");
		pn.PlaceList.add(p_24);

		DataString p_25 = new DataString();
		p_25.SetName("P_25");
		pn.PlaceList.add(p_25);

		DataString p_116 = new DataString();
		p_116.SetName("P_116");
		pn.PlaceList.add(p_116);

		DataInteger Five = new DataInteger();
		Five.SetName("Five");
		Five.SetValue(5);
		pn.ConstantPlaceList.add(Five);

		// -------------------------------------------------------------------
		// -------------------------------Lane7 - Right--------------------------------
		// --------------------------------------------------------------------

		DataCar p_58 = new DataCar();
		p_58.SetName("P_58");
		pn.PlaceList.add(p_58);

		DataCarQueue p_59 = new DataCarQueue();
		p_59.Value.Size = 3;
		p_59.SetName("P_59");
		pn.PlaceList.add(p_59);

		DataCarQueue p_6 = new DataCarQueue();
		p_6.Value.Size = 3;
		p_6.SetName("P_6");
		pn.PlaceList.add(p_6);

		DataCarQueue p_60 = new DataCarQueue();
		p_60.Value.Size = 3;
		p_60.SetName("P_60");
		pn.PlaceList.add(p_60);

		DataCarQueue p_56 = new DataCarQueue();
		p_56.Value.Size = 3;
		p_56.SetName("P_56");
		pn.PlaceList.add(p_56);

		DataString p_117 = new DataString();
		p_117.SetName("P_117");
		pn.PlaceList.add(p_117);

		DataCar p_55 = new DataCar();
		p_55.SetName("P_55");
		pn.PlaceList.add(p_55);

		DataString p_57 = new DataString();
		p_57.SetName("P_57");
		pn.PlaceList.add(p_57);

		DataCarQueue p_156 = new DataCarQueue();
		p_156.Value.Size = 3;
		p_156.SetName("P_156");
		pn.PlaceList.add(p_156);

		// -------------------------------------------------------------------
		// -------------------------------Lane8 - Right--------------------------------
		// --------------------------------------------------------------------

		DataCar p_188 = new DataCar();
		p_188.SetName("P_118");
		pn.PlaceList.add(p_188);

		DataCarQueue p_52 = new DataCarQueue();
		p_52.Value.Size = 3;
		p_52.SetName("P_52");
		pn.PlaceList.add(p_52);

		DataCarQueue p_159 = new DataCarQueue();
		p_159.Value.Size = 3;
		p_159.SetName("P_159");
		pn.PlaceList.add(p_159);

		DataCarQueue p_49 = new DataCarQueue();
		p_49.Value.Size = 3;
		p_49.SetName("P_49");
		pn.PlaceList.add(p_49);

		DataString p_53 = new DataString();
		p_53.SetName("P_53");
		pn.PlaceList.add(p_53);

		DataCar p_54 = new DataCar();
		p_54.SetName("P_54");
		pn.PlaceList.add(p_54);

		DataString p_50 = new DataString();
		p_50.SetName("P_50");
		pn.PlaceList.add(p_50);

		DataCarQueue p_51 = new DataCarQueue();
		p_51.Value.Size = 3;
		p_51.SetName("P_51");
		pn.PlaceList.add(p_51);

		// -------------------------------------------------------------------
		// -------------------------------Lane9 - Down--------------------------------
		// --------------------------------------------------------------------

		DataCar p_119 = new DataCar();
		p_119.SetName("P_119");
		pn.PlaceList.add(p_119);

		DataCarQueue p_31 = new DataCarQueue();
		p_31.Value.Size = 3;
		p_31.SetName("P_31");
		pn.PlaceList.add(p_31);

		DataCarQueue p_148 = new DataCarQueue();
		p_148.Value.Size = 3;
		p_148.SetName("P_148");
		pn.PlaceList.add(p_148);

		DataCarQueue p_121 = new DataCarQueue();
		p_121.Value.Size = 3;
		p_121.SetName("P_121");
		pn.PlaceList.add(p_121);

		DataCarQueue p_149 = new DataCarQueue();
		p_149.Value.Size = 3;
		p_149.SetName("P_149");
		pn.PlaceList.add(p_149);

		DataCarQueue p_35 = new DataCarQueue();
		p_35.Value.Size = 3;
		p_35.SetName("P_35");
		pn.PlaceList.add(p_35);

		DataCarQueue p_158 = new DataCarQueue();
		p_158.Value.Size = 3;
		p_158.SetName("P_158");
		pn.PlaceList.add(p_158);

		DataString p_34 = new DataString();
		p_34.SetName("P_34");
		pn.PlaceList.add(p_34);

		DataCar p_144 = new DataCar();
		p_144.SetName("P_144");
		pn.PlaceList.add(p_144);

		DataString p_154 = new DataString();
		p_154.SetName("P_154");
		pn.PlaceList.add(p_154);

		DataCarQueue p_155 = new DataCarQueue();
		p_155.Value.Size = 3;
		p_155.SetName("P_155");
		pn.PlaceList.add(p_155);

		DataString p_127 = new DataString();
		p_127.SetName("P_127");
		pn.PlaceList.add(p_127);

		DataCar p_143 = new DataCar();
		p_143.SetName("P_143");
		pn.PlaceList.add(p_143);

		DataCar p_38 = new DataCar();
		p_38.SetName("P_143");
		pn.PlaceList.add(p_38);

		DataCarQueue p_162 = new DataCarQueue();
		p_162.Value.Size = 3;
		p_162.SetName("P_162");
		pn.PlaceList.add(p_162);

		DataCarQueue p_41 = new DataCarQueue();
		p_41.Value.Size = 3;
		p_41.SetName("P_41");
		pn.PlaceList.add(p_41);

		DataCarQueue p_141 = new DataCarQueue();
		p_141.Value.Size = 3;
		p_141.SetName("P_141");
		pn.PlaceList.add(p_141);

		DataCarQueue p_163 = new DataCarQueue();
		p_163.Value.Size = 3;
		p_163.SetName("P_163");
		pn.PlaceList.add(p_163);

		DataCarQueue p_150 = new DataCarQueue();
		p_150.Value.Size = 3;
		p_150.SetName("P_150");
		pn.PlaceList.add(p_150);

		DataCarQueue p_61 = new DataCarQueue();
		p_61.Value.Size = 3;
		p_61.SetName("P_61");
		pn.PlaceList.add(p_61);

		DataCarQueue p_151 = new DataCarQueue();
		p_151.Value.Size = 3;
		p_151.SetName("P_151");
		pn.PlaceList.add(p_151);

		DataString p_152 = new DataString();
		p_152.SetName("P_152");
		pn.PlaceList.add(p_152);

		DataString p_153 = new DataString();
		p_153.SetName("P_153");
		pn.PlaceList.add(p_153);

		DataString p_128 = new DataString();
		p_128.SetName("P_128");
		pn.PlaceList.add(p_128);

		DataCarQueue p_120 = new DataCarQueue();
		p_120.Value.Size = 3;
		p_120.SetName("P_120");
		pn.PlaceList.add(p_120);

		DataString p_124 = new DataString();
		p_124.SetName("P_124");
		pn.PlaceList.add(p_124);

		DataString p_68 = new DataString();
		p_68.SetName("P_68");
		pn.PlaceList.add(p_68);

		DataString p_69 = new DataString();
		p_69.SetName("P_69");
		pn.PlaceList.add(p_69);

		DataString p_70 = new DataString();
		p_70.SetName("P_70");
		pn.PlaceList.add(p_70);

		DataString p_71 = new DataString();
		p_71.SetName("P_71");
		pn.PlaceList.add(p_71);

		DataCarQueue p_63 = new DataCarQueue();
		p_63.Value.Size = 3;
		p_63.SetName("P_63");
		pn.PlaceList.add(p_63);

		DataCarQueue p_66 = new DataCarQueue();
		p_66.Value.Size = 3;
		p_66.SetName("P_66");
		pn.PlaceList.add(p_66);

		DataCar p_62 = new DataCar();
		p_62.SetName("P_62");
		pn.PlaceList.add(p_62);

		DataCar p_64 = new DataCar();
		p_64.SetName("P_64");
		pn.PlaceList.add(p_64);

		DataCar p_65 = new DataCar();
		p_65.SetName("P_65");
		pn.PlaceList.add(p_65);

		DataCar p_67 = new DataCar();
		p_67.SetName("P_67");
		pn.PlaceList.add(p_67);

		DataString p_72 = new DataString();
		p_72.SetName("P_72");
		pn.PlaceList.add(p_72);

		DataString p_73 = new DataString();
		p_73.SetName("P_73");
		pn.PlaceList.add(p_73);

		DataCarQueue p_122 = new DataCarQueue();
		p_122.Value.Size = 3;
		p_122.SetName("P_122");
		pn.PlaceList.add(p_122);

		DataCar p_76 = new DataCar();
		p_76.SetName("P_76");
		pn.PlaceList.add(p_76);

		DataCar p_77 = new DataCar();
		p_77.SetName("P_77");
		pn.PlaceList.add(p_77);

		DataCar p_78 = new DataCar();
		p_78.SetName("P_78");
		pn.PlaceList.add(p_78);

		DataString p_88 = new DataString();
		p_88.SetName("P_88");
		pn.PlaceList.add(p_88);

		DataCar p_79 = new DataCar();
		p_79.SetName("P_79");
		pn.PlaceList.add(p_79);

		DataCarQueue p_164 = new DataCarQueue();
		p_164.Value.Size = 3;
		p_164.SetName("P_164");
		pn.PlaceList.add(p_164);

		DataCar p_80 = new DataCar();
		p_80.SetName("P_80");
		pn.PlaceList.add(p_80);

		DataCarQueue p_165 = new DataCarQueue();
		p_165.Value.Size = 3;
		p_165.SetName("P_165");
		pn.PlaceList.add(p_165);

		DataCar p_81 = new DataCar();
		p_81.SetName("P_81");
		pn.PlaceList.add(p_81);

		DataCar p_84 = new DataCar();
		p_84.SetName("P_84");
		pn.PlaceList.add(p_84);

		DataCarQueue p_83 = new DataCarQueue();
		p_83.Value.Size = 3;
		p_83.SetName("P_83");
		pn.PlaceList.add(p_83);

		DataCar p_82 = new DataCar();
		p_82.SetName("P_82");
		pn.PlaceList.add(p_82);

		DataCarQueue p_126 = new DataCarQueue();
		p_126.Value.Size = 3;
		p_126.SetName("P_126");
		pn.PlaceList.add(p_126);

		DataCar p_85 = new DataCar();
		p_85.SetName("P_85");
		pn.PlaceList.add(p_85);

		DataCarQueue p_86 = new DataCarQueue();
		p_86.Value.Size = 3;
		p_86.SetName("P_86");
		pn.PlaceList.add(p_86);

		DataCar p_87 = new DataCar();
		p_87.SetName("P_87");
		pn.PlaceList.add(p_87);

		DataCar p_123 = new DataCar();
		p_123.SetName("P_123");
		pn.PlaceList.add(p_123);

		DataCarQueue p_90 = new DataCarQueue();
		p_90.Value.Size = 3;
		p_90.SetName("P_90");
		pn.PlaceList.add(p_90);

		DataCarQueue p_94 = new DataCarQueue();
		p_94.Value.Size = 3;
		p_94.SetName("P_94");
		pn.PlaceList.add(p_94);

		DataString p_89 = new DataString();
		p_89.SetName("P_89");
		pn.PlaceList.add(p_89);

		DataString p_102 = new DataString();
		p_102.SetName("P_102");
		pn.PlaceList.add(p_102);

		DataString p_130 = new DataString();
		p_130.SetName("P_130");
		pn.PlaceList.add(p_130);

		DataString p_133 = new DataString();
		p_133.SetName("P_133");
		pn.PlaceList.add(p_133);

		DataString p_131 = new DataString();
		p_131.SetName("P_131");
		pn.PlaceList.add(p_131);

		DataString p_134 = new DataString();
		p_134.SetName("P_134");
		pn.PlaceList.add(p_134);

		DataString p_103 = new DataString();
		p_103.SetName("P_103");
		pn.PlaceList.add(p_103);

		DataString p_104 = new DataString();
		p_104.SetName("P_104");
		pn.PlaceList.add(p_104);

		DataString p_105 = new DataString();
		p_105.SetName("P_105");
		pn.PlaceList.add(p_105);

		DataString p_111 = new DataString();
		p_111.SetName("P_111");
		pn.PlaceList.add(p_111);

		DataString p_112 = new DataString();
		p_112.SetName("P_112");
		pn.PlaceList.add(p_112);

		DataString p_113 = new DataString();
		p_113.SetName("P_113");
		pn.PlaceList.add(p_113);

		DataString p_140 = new DataString();
		p_140.SetName("P_140");
		pn.PlaceList.add(p_140);

		DataString p_139 = new DataString();
		p_139.SetName("P_139");
		pn.PlaceList.add(p_139);

		DataString p_138 = new DataString();
		p_138.SetName("P_138");
		pn.PlaceList.add(p_138);

		DataString p_137 = new DataString();
		p_137.SetName("P_137");
		pn.PlaceList.add(p_137);

		DataString p_147 = new DataString();
		p_147.SetName("P_147");
		pn.PlaceList.add(p_147);

		DataString p_136 = new DataString();
		p_136.SetName("P_136");
		pn.PlaceList.add(p_136);

		DataString p_146 = new DataString();
		p_146.SetName("P_146");
		pn.PlaceList.add(p_146);

		DataString p_135 = new DataString();
		p_135.SetName("P_135");
		pn.PlaceList.add(p_135);

		DataString p_145 = new DataString();
		p_145.SetName("P_145");
		pn.PlaceList.add(p_145);

		DataCarQueue p_166 = new DataCarQueue();
		p_166.SetName("P_166");
		pn.PlaceList.add(p_166);

		DataCarQueue p_91 = new DataCarQueue();
		p_91.Value.Size = 3;
		p_91.SetName("P_91");
		pn.PlaceList.add(p_91);

		DataCar p_95 = new DataCar();
		p_95.SetName("P_95");
		pn.PlaceList.add(p_95);

		DataCarQueue p_125 = new DataCarQueue();
		p_125.Value.Size = 3;
		p_125.SetName("P_125");
		pn.PlaceList.add(p_125);

		DataCar p_92 = new DataCar();
		p_92.SetName("P_92");
		pn.PlaceList.add(p_92);

		DataCarQueue p_167 = new DataCarQueue();
		p_167.Value.Size = 3;
		p_167.SetName("P_167");
		pn.PlaceList.add(p_167);

		DataCar p_96 = new DataCar();
		p_96.SetName("P_96");
		pn.PlaceList.add(p_96);

		DataCar p_97 = new DataCar();
		p_97.SetName("P_97");
		pn.PlaceList.add(p_97);

		DataCar p_93 = new DataCar();
		p_93.SetName("P_93");
		pn.PlaceList.add(p_93);

		DataCar p_98 = new DataCar();
		p_98.SetName("P_98");
		pn.PlaceList.add(p_98);

		DataCarQueue p_168 = new DataCarQueue();
		p_168.SetName("P_168");
		pn.PlaceList.add(p_168);

		DataCar p_99 = new DataCar();
		p_99.SetName("P_99");
		pn.PlaceList.add(p_99);

		DataCar p_169 = new DataCar();
		p_169.SetName("P_169");
		pn.PlaceList.add(p_169);

		DataCar p_100 = new DataCar();
		p_100.SetName("P_100");
		pn.PlaceList.add(p_100);

		DataCar p_101 = new DataCar();
		p_101.SetName("P_101");
		pn.PlaceList.add(p_101);

		// -------------------------------------------------------------------------------------------
		// --------------------------------Intersection-----------------------------------------------
		// -------------------------------------------------------------------------------------------

		DataCarQueue p15 = new DataCarQueue();
		p15.Value.Size = 12;
		p15.SetName("P_15");
		pn.PlaceList.add(p15);


		// T14_1 ------------------------------------------------
		PetriTransition T14_1 = new PetriTransition(pn);
		T14_1.TransitionName = "T14_1";
		T14_1.InputPlaceName.add("P_C2");

		Condition T14Ct1_1 = new Condition(T14_1, "P_C2", TransitionCondition.CanNotAddCars);
		Condition T14Ct1_2 = new Condition(T14_1, "P_C1", TransitionCondition.NotNull);
		T14Ct1_1.SetNextCondition(LogicConnector.AND, T14Ct1_2);

		GuardMapping grdT14_1 = new GuardMapping();
		grdT14_1.condition = T14Ct1_1;
		grdT14_1.Activations.add(new Activation(T14_1, "P_C2", TransitionOperation.SendOverNetwork, "P_Data"));
		T14_1.GuardMappingList.add(grdT14_1);

		T14_1.Delay = 0;
		pn.Transitions.add(T14_1);


		// T14 ------------------------------------------------
		PetriTransition t14 = new PetriTransition(pn);
		t14.TransitionName = "T14";
		t14.InputPlaceName.add("P_C0");

		Condition T14Ct1 = new Condition(t14, "P_C0", TransitionCondition.NotNull);

		GuardMapping grdT14 = new GuardMapping();
		grdT14.condition = T14Ct1;
		grdT14.Activations.add(new Activation(t14, "P_C0", TransitionOperation.AddElement, "P_C1"));
		t14.GuardMappingList.add(grdT14);

		t14.Delay = 0;
		pn.Transitions.add(t14);

		// T3 ------------------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T3";
		t3.InputPlaceName.add("P_C1");
		t3.InputPlaceName.add("P_14");

		Condition T3Ct1 = new Condition(t3, "P_C1", TransitionCondition.NotNull);
		Condition T3Ct2 = new Condition(t3, "P_14", TransitionCondition.NotNull);
		T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition = T3Ct1;
		grdT3.Activations.add(new Activation(t3, "P_C1", TransitionOperation.AddElement, "P_C2"));
		grdT3.Activations.add(new Activation(t3, "P_C2", TransitionOperation.Move, "P_14"));
		t3.GuardMappingList.add(grdT3);

		t3.Delay = 0;
		pn.Transitions.add(t3);

		// T10 ------------------------------------------------
		PetriTransition t10 = new PetriTransition(pn);
		t10.TransitionName = "T10";
		t10.InputPlaceName.add("P_C1");
		t10.InputPlaceName.add("P_14");

		Condition T10Ct1 = new Condition(t10, "P_C2", TransitionCondition.NotNull);

		GuardMapping grdT10 = new GuardMapping();
		grdT10.condition = T10Ct1;
		grdT10.Activations.add(new Activation(t10, "P_C2", TransitionOperation.Move, "P_15"));
		grdT10.Activations.add(new Activation(t10, "P_C2", TransitionOperation.Move, "P_114"));
		grdT10.Activations.add(new Activation(t10, "P_114", TransitionOperation.Move, "P_C2"));
		t10.GuardMappingList.add(grdT10);

		t10.Delay = 0;
		pn.Transitions.add(t10);

		// T5 ------------------------------------------------
		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T5";
		t5.InputPlaceName.add("P_T0");

		Condition T5Ct1 = new Condition(t5, "P_T0", TransitionCondition.NotNull);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition = T5Ct1;
		grdT5.Activations.add(new Activation(t5, "P_T0", TransitionOperation.AddElement, "P_T1"));
		t5.GuardMappingList.add(grdT5);

		t5.Delay = 0;
		pn.Transitions.add(t5);

		// T4 ------------------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T4";
		t4.InputPlaceName.add("P_T1");

		Condition T4Ct1 = new Condition(t4, "P_T1", TransitionCondition.NotNull);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition = T4Ct1;
		grdT4.Activations.add(new Activation(t4, "P_T1", TransitionOperation.AddElement, "P_T2"));
		t4.GuardMappingList.add(grdT4);

		t4.Delay = 0;
		pn.Transitions.add(t4);

		// T12 ------------------------------------------------
		PetriTransition t12 = new PetriTransition(pn);
		t12.TransitionName = "T12";
		t12.InputPlaceName.add("P_115");

		Condition T12Ct1 = new Condition(t12, "P115", TransitionCondition.NotNull);

		GuardMapping grdT12 = new GuardMapping();
		grdT12.condition = T12Ct1;
		grdT12.Activations.add(new Activation(t12, "P115", TransitionOperation.AddElement, "P_T3"));
		t12.GuardMappingList.add(grdT12);

		t12.Delay = 0;
		pn.Transitions.add(t12);

		// T13 ------------------------------------------------
		PetriTransition t13 = new PetriTransition(pn);
		t13.TransitionName = "T13";
		t13.InputPlaceName.add("P_115");

		Condition T13Ct1 = new Condition(t13, "P115", TransitionCondition.NotNull);

		GuardMapping grdT13 = new GuardMapping();
		grdT13.condition = T13Ct1;
		grdT13.Activations.add(new Activation(t13, "P115", TransitionOperation.AddElement, "P_C3"));
		t13.GuardMappingList.add(grdT13);

		t13.Delay = 0;
		pn.Transitions.add(t13);

		// T7 ------------------------------------------------
		PetriTransition t7 = new PetriTransition(pn);
		t7.TransitionName = "T7";
		t7.InputPlaceName.add("P_T3");

		Condition T7Ct1 = new Condition(t7, "P_T3", TransitionCondition.NotNull);

		GuardMapping grdT7 = new GuardMapping();
		grdT7.condition = T7Ct1;
		grdT7.Activations.add(new Activation(t7, "P_T3", TransitionOperation.AddElement, "P_T4"));
		t7.GuardMappingList.add(grdT7);

		t7.Delay = 0;
		pn.Transitions.add(t7);

		// T6 ------------------------------------------------
		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T6";
		t6.InputPlaceName.add("P_T4");

		Condition T6Ct1 = new Condition(t6, "P_T4", TransitionCondition.NotNull);

		GuardMapping grdT6 = new GuardMapping();
		grdT6.condition = T6Ct1;
		grdT6.Activations.add(new Activation(t6, "P_T4", TransitionOperation.AddElement, "P_T5"));
		t6.GuardMappingList.add(grdT6);

		t6.Delay = 0;
		pn.Transitions.add(t6);

		// T9 ------------------------------------------------
		PetriTransition t9 = new PetriTransition(pn);
		t9.TransitionName = "T9";
		t9.InputPlaceName.add("P_C3");

		Condition T9Ct1 = new Condition(t9, "P_C3", TransitionCondition.NotNull);

		GuardMapping grdT9 = new GuardMapping();
		grdT9.condition = T9Ct1;
		grdT9.Activations.add(new Activation(t9, "P_C3", TransitionOperation.AddElement, "P_C4"));
		t9.GuardMappingList.add(grdT9);

		t9.Delay = 0;
		pn.Transitions.add(t9);

		// T8 ------------------------------------------------
		PetriTransition t8 = new PetriTransition(pn);
		t8.TransitionName = "T8";
		t8.InputPlaceName.add("P_C4");

		Condition T8Ct1 = new Condition(t8, "P_C4", TransitionCondition.NotNull);

		GuardMapping grdT8 = new GuardMapping();
		grdT8.condition = T8Ct1;
		grdT8.Activations.add(new Activation(t8, "P_C4", TransitionOperation.AddElement, "P_C5"));
		t8.GuardMappingList.add(grdT8);

		t8.Delay = 0;
		pn.Transitions.add(t8);

		// T81 ------------------------------------------------
		PetriTransition t81 = new PetriTransition(pn);
		t81.TransitionName = "T81";
		t81.InputPlaceName.add("P_15");

		Condition T81Ct1 = new Condition(t81, "P_15", TransitionCondition.NotNull);

		GuardMapping grdT81 = new GuardMapping();
		grdT81.condition = T81Ct1;
		grdT81.Activations.add(new Activation(t81, "P_15", TransitionOperation.AddElement, "P_115"));
		t81.GuardMappingList.add(grdT81);

		t81.Delay = 0;
		pn.Transitions.add(t81);

		// T15 ------------------------------------------------
		PetriTransition t15 = new PetriTransition(pn);
		t15.TransitionName = "T15";
		t15.InputPlaceName.add("P_15");

		Condition T15Ct1 = new Condition(t15, "P_15", TransitionCondition.NotNull);

		GuardMapping grdT15 = new GuardMapping();
		grdT15.condition = T15Ct1;
		grdT15.Activations.add(new Activation(t15, "P_15", TransitionOperation.AddElement, "P_16"));
		t15.GuardMappingList.add(grdT15);

		t15.Delay = 0;
		pn.Transitions.add(t15);

		// T24 ------------------------------------------------
		PetriTransition t24 = new PetriTransition(pn);
		t24.TransitionName = "T24";
		t24.InputPlaceName.add("P_16");

		Condition T24Ct1 = new Condition(t24, "P_16", TransitionCondition.NotNull);

		GuardMapping grdT24 = new GuardMapping();
		grdT24.condition = T24Ct1;
		grdT24.Activations.add(new Activation(t24, "P_16", TransitionOperation.AddElement, "P_17"));
		grdT24.Activations.add(new Activation(t24, "P_16", TransitionOperation.AddElement, "P_21"));
		grdT24.Activations.add(new Activation(t24, "P_16", TransitionOperation.AddElement, "P_23"));
		grdT24.Activations.add(new Activation(t24, "P_23", TransitionOperation.AddElement, "P_16"));
		grdT24.Activations.add(new Activation(t24, "P_21", TransitionOperation.AddElement, "P_16"));
		t24.GuardMappingList.add(grdT24);

		t24.Delay = 0;
		pn.Transitions.add(t24);

		// T25 ------------------------------------------------
		PetriTransition t25 = new PetriTransition(pn);
		t25.TransitionName = "T25";
		t25.InputPlaceName.add("P_17");

		Condition T25Ct1 = new Condition(t25, "P_17", TransitionCondition.NotNull);

		GuardMapping grdT25 = new GuardMapping();
		grdT25.condition = T25Ct1;
		grdT25.Activations.add(new Activation(t25, "P_17", TransitionOperation.AddElement, "P_18"));
		grdT25.Activations.add(new Activation(t25, "P_17", TransitionOperation.AddElement, "P_20"));
		grdT25.Activations.add(new Activation(t25, "P_17", TransitionOperation.AddElement, "P_19"));
		grdT25.Activations.add(new Activation(t25, "P_20", TransitionOperation.AddElement, "P_17"));
		grdT25.Activations.add(new Activation(t25, "P_19", TransitionOperation.AddElement, "P_17"));
		t25.GuardMappingList.add(grdT25);

		t25.Delay = 0;
		pn.Transitions.add(t25);

		// T1001 ------------------------------------------------
		PetriTransition t1001 = new PetriTransition(pn);
		t1001.TransitionName = "T1001";
		t1001.InputPlaceName.add("P_18");

		Condition T1001Ct1 = new Condition(t1001, "P_18", TransitionCondition.NotNull);

		GuardMapping grdT1001 = new GuardMapping();
		grdT1001.condition = T1001Ct1;
		grdT1001.Activations.add(new Activation(t1001, "Five", TransitionOperation.DynamicDelay,""));
		grdT1001.Activations.add(new Activation(t1001, "P_18", TransitionOperation.AddElement, "P_157"));
		t1001.GuardMappingList.add(grdT1001);

		t1001.Delay = 0;
		pn.Transitions.add(t1001);

		// T93 ------------------------------------------------
		PetriTransition t93 = new PetriTransition(pn);
		t93.TransitionName = "T93";
		t93.InputPlaceName.add("P_157");
		t93.InputPlaceName.add("P_18");

		Condition T93Ct1 = new Condition(t93, "P_17", TransitionCondition.NotNull);
		Condition T93Ct2 = new Condition(t3, "P_157", TransitionCondition.NotNull);
		T93Ct1.SetNextCondition(LogicConnector.AND, T93Ct2);

		GuardMapping grdT93 = new GuardMapping();
		grdT93.condition = T93Ct1;
		grdT93.Activations.add(new Activation(t93, "P_18", TransitionOperation.AddElement, "P_29"));
		grdT93.Activations.add(new Activation(t93, "P_157", TransitionOperation.AddElement, "P_29"));
		t93.GuardMappingList.add(grdT93);

		t93.Delay = 0;
		pn.Transitions.add(t93);

		// T30 ------------------------------------------------
		PetriTransition t30 = new PetriTransition(pn);
		t30.TransitionName = "T30";
		t30.InputPlaceName.add("P_28");

		Condition T30Ct1 = new Condition(t30, "P_28", TransitionCondition.NotNull);

		GuardMapping grdT30 = new GuardMapping();
		grdT30.condition = T30Ct1;
		grdT30.Activations.add(new Activation(t30, "P_28", TransitionOperation.AddElement, "P_15"));
		grdT30.Activations.add(new Activation(t30, "P_28", TransitionOperation.AddElement, "P_116"));
		grdT30.Activations.add(new Activation(t30, "P_116", TransitionOperation.AddElement, "P_28"));
		grdT30.Activations.add(new Activation(t30, "P_116", TransitionOperation.AddElement, "P_15"));
		t30.GuardMappingList.add(grdT30);

		t30.Delay = 0;
		pn.Transitions.add(t30);

		// T27 ------------------------------------------------
		PetriTransition t27 = new PetriTransition(pn);
		t27.TransitionName = "T27";
		t27.InputPlaceName.add("P_27");
		t27.InputPlaceName.add("P_24");
		t27.InputPlaceName.add("P_25");

		Condition T27Ct1 = new Condition(t27, "P_27", TransitionCondition.NotNull);
		Condition T27Ct2 = new Condition(t27, "P_24", TransitionCondition.NotNull);
		Condition T27Ct3 = new Condition(t27, "P_25", TransitionCondition.NotNull);
		T27Ct1.SetNextCondition(LogicConnector.AND, T27Ct2);
		T27Ct1.SetNextCondition(LogicConnector.AND, T27Ct3);

		GuardMapping grdT27 = new GuardMapping();
		grdT27.condition = T27Ct1;
		grdT27.Activations.add(new Activation(t27, "P_27", TransitionOperation.AddElement, "P_28"));
		grdT27.Activations.add(new Activation(t27, "P_24", TransitionOperation.AddElement, "P_28"));
		grdT27.Activations.add(new Activation(t27, "P_25", TransitionOperation.AddElement, "P_28"));
		grdT27.Activations.add(new Activation(t27, "P_28", TransitionOperation.AddElement, "P_24"));
		grdT27.Activations.add(new Activation(t27, "P_28", TransitionOperation.AddElement, "P_25"));
		t27.GuardMappingList.add(grdT27);

		t27.Delay = 0;
		pn.Transitions.add(t27);

		// T26 ------------------------------------------------
		PetriTransition t26 = new PetriTransition(pn);
		t26.TransitionName = "T26";
		t26.InputPlaceName.add("P_26");
		t26.InputPlaceName.add("P_23");

		Condition T26Ct1 = new Condition(t26, "P_26", TransitionCondition.NotNull);
		Condition T26Ct2 = new Condition(t26, "P_23", TransitionCondition.NotNull);
		T26Ct1.SetNextCondition(LogicConnector.AND, T26Ct2);

		GuardMapping grdT26 = new GuardMapping();
		grdT26.condition = T26Ct1;
		grdT26.Activations.add(new Activation(t26, "P_26", TransitionOperation.AddElement, "P_27"));
		grdT26.Activations.add(new Activation(t26, "P_24", TransitionOperation.AddElement, "P_27"));
		grdT26.Activations.add(new Activation(t26, "P_27", TransitionOperation.AddElement, "P_24"));
		t26.GuardMappingList.add(grdT26);

		t26.Delay = 0;
		pn.Transitions.add(t26);

		// T96 ------------------------------------------------
		PetriTransition t96 = new PetriTransition(pn);
		t96.TransitionName = "T96";
		t96.InputPlaceName.add("P_30");

		Condition T96Ct1 = new Condition(t96, "P_30", TransitionCondition.NotNull);

		GuardMapping grdT96 = new GuardMapping();
		grdT96.condition = T96Ct1;
		grdT96.Activations.add(new Activation(t96, "Five", TransitionOperation.DynamicDelay,""));
		grdT96.Activations.add(new Activation(t96, "P_30", TransitionOperation.AddElement, "P_160"));
		t96.GuardMappingList.add(grdT96);

		t96.Delay = 0;
		pn.Transitions.add(t96);

		// T94 ------------------------------------------------
		PetriTransition t94 = new PetriTransition(pn);
		t94.TransitionName = "T94";
		t94.InputPlaceName.add("P_157");
		t94.InputPlaceName.add("P_18");

		Condition T94Ct1 = new Condition(t94, "P_17", TransitionCondition.NotNull);

		GuardMapping grdT94 = new GuardMapping();
		grdT94.condition = T94Ct1;
		grdT94.Activations.add(new Activation(t94, "P_30", TransitionOperation.AddElement, "P_26"));
		t94.GuardMappingList.add(grdT94);

		t94.Delay = 0;
		pn.Transitions.add(t94);

		// T11 ------------------------------------------------
		PetriTransition t11 = new PetriTransition(pn);
		t11.TransitionName = "T11";
		t11.InputPlaceName.add("P_114");

		Condition T11Ct1 = new Condition(t11, "P_T2", TransitionCondition.NotNull);

		GuardMapping grdT11 = new GuardMapping();
		grdT11.condition = T11Ct1;
		grdT11.Activations.add(new Activation(t11, "P_T2", TransitionOperation.AddElement, "P_114"));
		grdT11.Activations.add(new Activation(t11, "P_114", TransitionOperation.AddElement, "P_T2"));
		grdT11.Activations.add(new Activation(t11, "P_T2", TransitionOperation.AddElement, "P_15"));
		t11.GuardMappingList.add(grdT11);

		t11.Delay = 0;
		pn.Transitions.add(t11);

		// T16 ------------------------------------------------
		PetriTransition t16 = new PetriTransition(pn);
		t16.TransitionName = "T16";
		t16.InputPlaceName.add("P_58");
		t16.InputPlaceName.add("P_117");

		Condition T16Ct1 = new Condition(t16, "P_58", TransitionCondition.NotNull);
		Condition T16Ct2 = new Condition(t16, "P_117", TransitionCondition.NotNull);
		T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);

		GuardMapping grdT16 = new GuardMapping();
		grdT16.condition = T16Ct1;
		grdT16.Activations.add(new Activation(t16, "P_58", TransitionOperation.AddElement, "P_15"));
		grdT16.Activations.add(new Activation(t16, "P_117", TransitionOperation.AddElement, "P_15"));
		grdT16.Activations.add(new Activation(t16, "P_117", TransitionOperation.AddElement, "P_58"));
		grdT16.Activations.add(new Activation(t16, "P_58", TransitionOperation.AddElement, "P_117"));
		t16.GuardMappingList.add(grdT16);

		t16.Delay = 0;
		pn.Transitions.add(t16);

		// T45 ------------------------------------------------
		PetriTransition t45 = new PetriTransition(pn);
		t45.TransitionName = "T45";
		t45.InputPlaceName.add("P_59");

		Condition T45Ct1 = new Condition(t45, "P_59", TransitionCondition.NotNull);

		GuardMapping grdT45 = new GuardMapping();
		grdT45.condition = T45Ct1;
		grdT45.Activations.add(new Activation(t45, "P_59", TransitionOperation.AddElement, "P_58"));
		grdT45.Activations.add(new Activation(t45, "P_58", TransitionOperation.AddElement, "P_59"));
		t45.GuardMappingList.add(grdT45);

		t45.Delay = 0;
		pn.Transitions.add(t45);

		// T46 ------------------------------------------------
		PetriTransition t46 = new PetriTransition(pn);
		t46.TransitionName = "T46";
		t46.InputPlaceName.add("P_60");

		Condition T46Ct1 = new Condition(t46, "P_60", TransitionCondition.NotNull);

		GuardMapping grdT46 = new GuardMapping();
		grdT46.condition = T46Ct1;
		grdT46.Activations.add(new Activation(t46, "P_60", TransitionOperation.AddElement, "P_59"));
		t46.GuardMappingList.add(grdT46);

		t46.Delay = 0;
		pn.Transitions.add(t46);

		// T17 ------------------------------------------------
		PetriTransition t17 = new PetriTransition(pn);
		t17.TransitionName = "T17";
		t17.InputPlaceName.add("P_55");
		t17.InputPlaceName.add("P_117");

		Condition T17Ct1 = new Condition(t17, "P_55", TransitionCondition.NotNull);
		Condition T17Ct2 = new Condition(t17, "P_117", TransitionCondition.NotNull);
		T17Ct1.SetNextCondition(LogicConnector.AND, T17Ct2);

		GuardMapping grdT17 = new GuardMapping();
		grdT17.condition = T17Ct1;
		grdT17.Activations.add(new Activation(t17, "P_55", TransitionOperation.AddElement, "P_15"));
		grdT17.Activations.add(new Activation(t17, "P_117", TransitionOperation.AddElement, "P_15"));
		grdT17.Activations.add(new Activation(t17, "P_117", TransitionOperation.AddElement, "P_55"));
		grdT17.Activations.add(new Activation(t17, "P_55", TransitionOperation.AddElement, "P_117"));
		t17.GuardMappingList.add(grdT17);

		t17.Delay = 0;
		pn.Transitions.add(t17);

		// T43 ------------------------------------------------
		PetriTransition t43 = new PetriTransition(pn);
		t43.TransitionName = "T43";
		t43.InputPlaceName.add("P_56");
		t43.InputPlaceName.add("P_156");

		Condition T43Ct1 = new Condition(t43, "P_56", TransitionCondition.NotNull);
		Condition T43Ct2 = new Condition(t17, "P_156", TransitionCondition.NotNull);
		T43Ct1.SetNextCondition(LogicConnector.AND, T43Ct2);

		GuardMapping grdT43 = new GuardMapping();
		grdT43.condition = T43Ct1;
		grdT43.Activations.add(new Activation(t43, "P_56", TransitionOperation.AddElement, "P_55"));
		grdT43.Activations.add(new Activation(t43, "P_156", TransitionOperation.AddElement, "P_55"));
		t43.GuardMappingList.add(grdT43);

		t43.Delay = 0;
		pn.Transitions.add(t43);

		// T44 ------------------------------------------------
		PetriTransition t44 = new PetriTransition(pn);
		t44.TransitionName = "T44";
		t44.InputPlaceName.add("P_57");

		Condition T44Ct1 = new Condition(t44, "P_57", TransitionCondition.NotNull);

		GuardMapping grdT44 = new GuardMapping();
		grdT44.condition = T44Ct1;
		grdT44.Activations.add(new Activation(t43, "P_57", TransitionOperation.AddElement, "P_56"));
		t44.GuardMappingList.add(grdT44);

		t44.Delay = 0;
		pn.Transitions.add(t44);

		// T91 ------------------------------------------------
		PetriTransition t91 = new PetriTransition(pn);
		t91.TransitionName = "T91";
		t91.InputPlaceName.add("P_56");

		Condition T91Ct1 = new Condition(t91, "P_18", TransitionCondition.NotNull);

		GuardMapping grdT91 = new GuardMapping();
		grdT91.condition = T91Ct1;
		grdT91.Activations.add(new Activation(t91, "Five", TransitionOperation.DynamicDelay,""));
		grdT91.Activations.add(new Activation(t91, "P_56", TransitionOperation.AddElement, "P_156"));
		t91.GuardMappingList.add(grdT91);

		t91.Delay = 0;
		pn.Transitions.add(t91);

		// T82 ------------------------------------------------
		PetriTransition t82 = new PetriTransition(pn);
		t82.TransitionName = "T82";
		t82.InputPlaceName.add("P_15");

		Condition T82Ct1 = new Condition(t82, "P_15", TransitionCondition.NotNull);

		GuardMapping grdT82 = new GuardMapping();
		grdT82.condition = T82Ct1;
		grdT82.Activations.add(new Activation(t82, "P_15", TransitionOperation.AddElement, "P_118"));
		t82.GuardMappingList.add(grdT82);

		t82.Delay = 0;
		pn.Transitions.add(t82);

		// T18 ------------------------------------------------
		PetriTransition t18 = new PetriTransition(pn);
		t18.TransitionName = "T18";
		t18.InputPlaceName.add("P_118");

		Condition T18Ct1 = new Condition(t18, "P_118", TransitionCondition.NotNull);

		GuardMapping grdT18 = new GuardMapping();
		grdT18.condition = T18Ct1;
		grdT18.Activations.add(new Activation(t18, "P_118", TransitionOperation.AddElement, "P_52"));
		t18.GuardMappingList.add(grdT18);

		t18.Delay = 0;
		pn.Transitions.add(t18);

		// T92 ------------------------------------------------
		PetriTransition t92 = new PetriTransition(pn);
		t92.TransitionName = "T92";
		t92.InputPlaceName.add("P_52");

		Condition T92Ct1 = new Condition(t92, "P_52", TransitionCondition.NotNull);

		GuardMapping grdT92 = new GuardMapping();
		grdT92.condition = T92Ct1;
		grdT92.Activations.add(new Activation(t92, "Five", TransitionOperation.DynamicDelay,""));
		grdT92.Activations.add(new Activation(t92, "P_52", TransitionOperation.AddElement, "P_159"));
		t92.GuardMappingList.add(grdT92);

		t92.Delay = 0;
		pn.Transitions.add(t92);

		// T41 ------------------------------------------------
		PetriTransition t41 = new PetriTransition(pn);
		t41.TransitionName = "T41";
		t41.InputPlaceName.add("P_52");
		t41.InputPlaceName.add("P_159");

		Condition T41Ct1 = new Condition(t41, "P_52", TransitionCondition.NotNull);
		Condition T41Ct2 = new Condition(t41, "P_159", TransitionCondition.NotNull);
		T41Ct1.SetNextCondition(LogicConnector.AND, T41Ct2);

		GuardMapping grdT41 = new GuardMapping();
		grdT41.condition = T41Ct1;
		grdT41.Activations.add(new Activation(t41, "P_52", TransitionOperation.DynamicDelay,"P_53"));
		grdT41.Activations.add(new Activation(t41, "P_159", TransitionOperation.AddElement, "P_53"));
		t41.GuardMappingList.add(grdT41);

		t41.Delay = 0;
		pn.Transitions.add(t41);

		// T42 ------------------------------------------------
		PetriTransition t42 = new PetriTransition(pn);
		t42.TransitionName = "T42";
		t42.InputPlaceName.add("P_53");

		Condition T42Ct1 = new Condition(t42, "P_53", TransitionCondition.NotNull);

		GuardMapping grdT42 = new GuardMapping();
		grdT42.condition = T42Ct1;
		grdT42.Activations.add(new Activation(t42, "P_53", TransitionOperation.AddElement, "P_54"));
		t42.GuardMappingList.add(grdT42);

		t42.Delay = 0;
		pn.Transitions.add(t42);

		// T19 ------------------------------------------------
		PetriTransition t19 = new PetriTransition(pn);
		t19.TransitionName = "T19";
		t19.InputPlaceName.add("P_118");

		Condition T19Ct1 = new Condition(t19, "P_118", TransitionCondition.NotNull);

		GuardMapping grdT19 = new GuardMapping();
		grdT19.condition = T19Ct1;
		grdT19.Activations.add(new Activation(t19, "P_118", TransitionOperation.AddElement, "P_49"));
		t19.GuardMappingList.add(grdT19);

		t19.Delay = 0;
		pn.Transitions.add(t19);

		// T39 ------------------------------------------------
		PetriTransition t39 = new PetriTransition(pn);
		t39.TransitionName = "T39";
		t39.InputPlaceName.add("P_49");

		Condition T39Ct1 = new Condition(t39, "P_118", TransitionCondition.NotNull);

		GuardMapping grdT39 = new GuardMapping();
		grdT39.condition = T39Ct1;
		grdT39.Activations.add(new Activation(t39, "P_49", TransitionOperation.AddElement, "P_50"));
		t39.GuardMappingList.add(grdT39);

		t39.Delay = 0;
		pn.Transitions.add(t39);

		// T40 ------------------------------------------------
		PetriTransition t40 = new PetriTransition(pn);
		t40.TransitionName = "T40";
		t40.InputPlaceName.add("P_50");

		Condition T40Ct1 = new Condition(t40, "P_50", TransitionCondition.NotNull);

		GuardMapping grdT40 = new GuardMapping();
		grdT40.condition = T40Ct1;
		grdT40.Activations.add(new Activation(t40, "P_50", TransitionOperation.AddElement, "P_51"));
		t40.GuardMappingList.add(grdT40);

		t40.Delay = 0;
		pn.Transitions.add(t40);

		// T83 ------------------------------------------------
		PetriTransition t83 = new PetriTransition(pn);
		t83.TransitionName = "T83";
		t83.InputPlaceName.add("P_15");

		Condition T83Ct1 = new Condition(t83, "P_15", TransitionCondition.NotNull);

		GuardMapping grdT83 = new GuardMapping();
		grdT83.condition = T83Ct1;
		grdT83.Activations.add(new Activation(t83, "P_15", TransitionOperation.AddElement, "P_119"));
		t83.GuardMappingList.add(grdT83);

		t83.Delay = 0;
		pn.Transitions.add(t83);

		// T20 ------------------------------------------------
		PetriTransition t20 = new PetriTransition(pn);
		t20.TransitionName = "T20";
		t20.InputPlaceName.add("P_119");

		Condition T20Ct1 = new Condition(t20, "P_119", TransitionCondition.NotNull);

		GuardMapping grdT20 = new GuardMapping();
		grdT20.condition = T20Ct1;
		grdT20.Activations.add(new Activation(t20, "P_119", TransitionOperation.AddElement, "P_31"));
		t20.GuardMappingList.add(grdT20);

		t20.Delay = 0;
		pn.Transitions.add(t20);

		// T35 ------------------------------------------------
		PetriTransition t35 = new PetriTransition(pn);
		t35.TransitionName = "T35";
		t35.InputPlaceName.add("P_119");

		Condition T35Ct1 = new Condition(t35, "P_119", TransitionCondition.NotNull);

		GuardMapping grdT35 = new GuardMapping();
		grdT35.condition = T35Ct1;
		grdT35.Activations.add(new Activation(t35, "P_119", TransitionOperation.AddElement, "P_35"));
		t35.GuardMappingList.add(grdT35);

		t35.Delay = 0;
		pn.Transitions.add(t35);

		// T31 ------------------------------------------------
		PetriTransition t31 = new PetriTransition(pn);
		t31.TransitionName = "T31";
		t31.InputPlaceName.add("P_31");

		Condition T31Ct1 = new Condition(t31, "P_31", TransitionCondition.NotNull);

		GuardMapping grdT31 = new GuardMapping();
		grdT31.condition = T31Ct1;
		grdT31.Activations.add(new Activation(t31, "P_31", TransitionOperation.AddElement, "P_34"));
		grdT31.Activations.add(new Activation(t31, "P_31", TransitionOperation.AddElement, "P_148"));
		t31.GuardMappingList.add(grdT31);

		t31.Delay = 0;
		pn.Transitions.add(t31);

		// T89 ------------------------------------------------
		PetriTransition t89 = new PetriTransition(pn);
		t89.TransitionName = "T89";
		t89.InputPlaceName.add("P_148");

		Condition T89Ct1 = new Condition(t89, "P_148", TransitionCondition.NotNull);
		Condition T89Ct2 = new Condition(t41, "P_149", TransitionCondition.NotNull);
		T41Ct1.SetNextCondition(LogicConnector.AND, T89Ct2);

		GuardMapping grdT89 = new GuardMapping();
		grdT89.condition = T89Ct1;
		grdT89.Activations.add(new Activation(t89, "P_148", TransitionOperation.AddElement, "P_154"));
		grdT89.Activations.add(new Activation(t89, "P_148", TransitionOperation.AddElement, "P_144"));
		grdT89.Activations.add(new Activation(t89, "P_148", TransitionOperation.AddElement, "P_143"));
		grdT89.Activations.add(new Activation(t89, "P_148", TransitionOperation.AddElement, "P_157"));
		grdT89.Activations.add(new Activation(t89, "P_148", TransitionOperation.AddElement, "P_155"));
		grdT89.Activations.add(new Activation(t89, "P_148", TransitionOperation.AddElement, "P_158"));
		grdT89.Activations.add(new Activation(t89, "P_149", TransitionOperation.AddElement, "P_144"));
		grdT89.Activations.add(new Activation(t89, "P_149", TransitionOperation.AddElement, "P_143"));
		t89.GuardMappingList.add(grdT89);

		t89.Delay = 0;
		pn.Transitions.add(t89);

		// T21 ------------------------------------------------
		PetriTransition t21 = new PetriTransition(pn);
		t21.TransitionName = "T21";
		t21.InputPlaceName.add("P_119");

		Condition T21Ct1 = new Condition(t21, "P_119", TransitionCondition.NotNull); // God have mercy

		GuardMapping grdT21 = new GuardMapping();
		grdT21.condition = T21Ct1;
		grdT21.Activations.add(new Activation(t21, "P_119", TransitionOperation.AddElement, "P_35"));
		t21.GuardMappingList.add(grdT21);

		t21.Delay = 0;
		pn.Transitions.add(t21);

		// T33 ------------------------------------------------
		PetriTransition t33 = new PetriTransition(pn);
		t33.TransitionName = "T33";
		t33.InputPlaceName.add("P_35");
		t33.InputPlaceName.add("P_158");

		Condition T33Ct1 = new Condition(t33, "P_35", TransitionCondition.NotNull); // God have mercy
		Condition T33Ct2 = new Condition(t33, "P_158", TransitionCondition.NotNull);
		T41Ct1.SetNextCondition(LogicConnector.AND, T33Ct2);

		GuardMapping grdT33 = new GuardMapping();
		grdT33.condition = T33Ct1;
		grdT33.Activations.add(new Activation(t33, "P_35", TransitionOperation.AddElement, "P_149"));
		grdT33.Activations.add(new Activation(t33, "P_158", TransitionOperation.AddElement, "P_149"));
		t33.GuardMappingList.add(grdT33);

		t33.Delay = 0;
		pn.Transitions.add(t33);

		// T97 ------------------------------------------------
		PetriTransition t97 = new PetriTransition(pn);
		t97.TransitionName = "T97";
		t97.InputPlaceName.add("P_35");

		Condition T97Ct1 = new Condition(t97, "P_35", TransitionCondition.NotNull);

		GuardMapping grdT97 = new GuardMapping();
		grdT97.condition = T97Ct1;
		grdT97.Activations.add(new Activation(t97, "Five", TransitionOperation.DynamicDelay,""));
		grdT97.Activations.add(new Activation(t97, "P_35", TransitionOperation.AddElement, "P_158"));
		t97.GuardMappingList.add(grdT97);

		t97.Delay = 0;
		pn.Transitions.add(t97);

		// T47 ------------------------------------------------
		PetriTransition t47 = new PetriTransition(pn);
		t47.TransitionName = "T47";
		t47.InputPlaceName.add("P_144");
		t47.InputPlaceName.add("P_132");
		t47.InputPlaceName.add("P_121");
		t47.InputPlaceName.add("P_129");

		Condition T47Ct1 = new Condition(t47, "P_144", TransitionCondition.NotNull); // When will it be over?
		Condition T47Ct2 = new Condition(t47, "P_132", TransitionCondition.NotNull);
		Condition T47Ct3 = new Condition(t47, "P_121", TransitionCondition.NotNull);
		Condition T47Ct4 = new Condition(t47, "P_129", TransitionCondition.NotNull);
		T41Ct1.SetNextCondition(LogicConnector.AND, T47Ct2);
		T41Ct1.SetNextCondition(LogicConnector.AND, T47Ct3);
		T41Ct1.SetNextCondition(LogicConnector.AND, T47Ct4);

		GuardMapping grdT47 = new GuardMapping();
		grdT47.condition = T47Ct1;
		grdT47.Activations.add(new Activation(t47, "P_144", TransitionOperation.AddElement, "P_132"));
		grdT47.Activations.add(new Activation(t47, "P_144", TransitionOperation.AddElement, "P_6"));
		grdT47.Activations.add(new Activation(t47, "P_144", TransitionOperation.AddElement, "P_129"));
		grdT47.Activations.add(new Activation(t47, "P_144", TransitionOperation.AddElement, "P_121"));
		grdT47.Activations.add(new Activation(t47, "P_132", TransitionOperation.AddElement, "P_121"));
		grdT47.Activations.add(new Activation(t47, "P_129", TransitionOperation.AddElement, "P_121"));
		t47.GuardMappingList.add(grdT47);

		t47.Delay = 0;
		pn.Transitions.add(t47);

		// T48 ------------------------------------------------
		PetriTransition t48 = new PetriTransition(pn);
		t48.TransitionName = "T48";
		t48.InputPlaceName.add("P_143");
		t48.InputPlaceName.add("P_121");

		Condition T48Ct1 = new Condition(t48, "P_143", TransitionCondition.NotNull); // When will it be over?
		Condition T48Ct2 = new Condition(t48, "P_121", TransitionCondition.NotNull);
		T41Ct1.SetNextCondition(LogicConnector.AND, T48Ct2);

		GuardMapping grdT48 = new GuardMapping();
		grdT48.condition = T48Ct1;
		grdT48.Activations.add(new Activation(t48, "P_143", TransitionOperation.AddElement, "P_121"));
		grdT48.Activations.add(new Activation(t48, "P_143", TransitionOperation.AddElement, "P_6"));
		grdT48.Activations.add(new Activation(t48, "P_121", TransitionOperation.AddElement, "P_162"));

		t48.GuardMappingList.add(grdT48);

		t48.Delay = 0;
		pn.Transitions.add(t48);

		// T98 ------------------------------------------------
		PetriTransition t98 = new PetriTransition(pn);
		t98.TransitionName = "T98";
		t98.InputPlaceName.add("P_141");

		Condition T98Ct1 = new Condition(t98, "P_141", TransitionCondition.NotNull); // God have mercy

		GuardMapping grdT98 = new GuardMapping();
		grdT98.condition = T98Ct1;
		grdT98.Activations.add(new Activation(t98, "P_141", TransitionOperation.AddElement, "P_143"));
		t98.GuardMappingList.add(grdT98);

		t98.Delay = 0;
		pn.Transitions.add(t98);

		// T84 ------------------------------------------------
		PetriTransition t84 = new PetriTransition(pn);
		t84.TransitionName = "T84";
		t84.InputPlaceName.add("P_6");

		Condition T84Ct1 = new Condition(t84, "P_6", TransitionCondition.NotNull); // God have mercy

		GuardMapping grdT84 = new GuardMapping();
		grdT84.condition = T84Ct1;
		grdT84.Activations.add(new Activation(t84, "P_6", TransitionOperation.AddElement, "P_120"));
		t84.GuardMappingList.add(grdT84);

		t84.Delay = 0;
		pn.Transitions.add(t84);

		// T50 ------------------------------------------------
		PetriTransition t50 = new PetriTransition(pn);
		t50.TransitionName = "T50";
		t50.InputPlaceName.add("P_120");

		Condition T50Ct1 = new Condition(t50, "P_120", TransitionCondition.NotNull);

		GuardMapping grdT50 = new GuardMapping();
		grdT50.condition = T50Ct1;
		grdT50.Activations.add(new Activation(t50, "P_120", TransitionOperation.AddElement, "P_128"));
		grdT50.Activations.add(new Activation(t50, "P_120", TransitionOperation.AddElement, "P_142"));
		grdT50.Activations.add(new Activation(t50, "P_128", TransitionOperation.AddElement, "P_142"));
		t50.GuardMappingList.add(grdT50);

		t50.Delay = 0;
		pn.Transitions.add(t50);

		// T49 ------------------------------------------------
		PetriTransition t49 = new PetriTransition(pn);
		t49.TransitionName = "T49";
		t49.InputPlaceName.add("P_120");

		Condition T49Ct1 = new Condition(t49, "P_120", TransitionCondition.NotNull);

		GuardMapping grdT49 = new GuardMapping();
		grdT49.condition = T49Ct1;
		grdT49.Activations.add(new Activation(t49, "P_120", TransitionOperation.AddElement, "P_141"));
		t49.GuardMappingList.add(grdT49);

		t49.Delay = 0;
		pn.Transitions.add(t49);

		// T99 ------------------------------------------------
		PetriTransition t99 = new PetriTransition(pn);
		t99.TransitionName = "T99";
		t99.InputPlaceName.add("P_141");

		Condition T99Ct1 = new Condition(t99, "P_141", TransitionCondition.NotNull);

		GuardMapping grdT99 = new GuardMapping();
		grdT99.condition = T99Ct1;
		grdT99.Activations.add(new Activation(t99, "Five", TransitionOperation.DynamicDelay,""));
		grdT99.Activations.add(new Activation(t99, "P_141", TransitionOperation.AddElement, "P_163"));
		t99.GuardMappingList.add(grdT99);

		t99.Delay = 0;
		pn.Transitions.add(t99);

		// T90 ------------------------------------------------
		PetriTransition t90 = new PetriTransition(pn);
		t90.TransitionName = "T90";
		t90.InputPlaceName.add("P_141");
		t90.InputPlaceName.add("P_142");
		t90.InputPlaceName.add("P_163");
		t90.InputPlaceName.add("P_156");
		t90.InputPlaceName.add("P_155");
		t90.InputPlaceName.add("P_152");

		Condition T90Ct1 = new Condition(t90, "P_141", TransitionCondition.NotNull);
		Condition T90Ct2 = new Condition(t48, "P_142", TransitionCondition.NotNull);
		Condition T90Ct3 = new Condition(t48, "P_163", TransitionCondition.NotNull);
		Condition T90Ct4 = new Condition(t48, "P_156", TransitionCondition.NotNull);
		Condition T90Ct5 = new Condition(t48, "P_155", TransitionCondition.NotNull);
		Condition T90Ct6 = new Condition(t48, "P_152", TransitionCondition.NotNull);
		T90Ct1.SetNextCondition(LogicConnector.AND, T90Ct2);
		T90Ct1.SetNextCondition(LogicConnector.AND, T90Ct3);
		T90Ct1.SetNextCondition(LogicConnector.AND, T90Ct4);
		T90Ct1.SetNextCondition(LogicConnector.AND, T90Ct5);
		T90Ct1.SetNextCondition(LogicConnector.AND, T90Ct6);

		GuardMapping grdT90 = new GuardMapping();
		grdT90.condition = T90Ct1;
		grdT90.Activations.add(new Activation(t90, "P_141", TransitionOperation.AddElement, "P_150"));
		grdT90.Activations.add(new Activation(t90, "P_141", TransitionOperation.AddElement, "P_153"));
		grdT90.Activations.add(new Activation(t90, "P_141", TransitionOperation.AddElement, "P_155"));
		grdT90.Activations.add(new Activation(t90, "P_141", TransitionOperation.AddElement, "P_152"));
		grdT90.Activations.add(new Activation(t90, "P_141", TransitionOperation.AddElement, "P_151"));

		grdT90.Activations.add(new Activation(t90, "P_142", TransitionOperation.AddElement, "P_150"));
		grdT90.Activations.add(new Activation(t90, "P_142", TransitionOperation.AddElement, "P_153"));
		grdT90.Activations.add(new Activation(t90, "P_142", TransitionOperation.AddElement, "P_155"));
		grdT90.Activations.add(new Activation(t90, "P_142", TransitionOperation.AddElement, "P_152"));
		grdT90.Activations.add(new Activation(t90, "P_142", TransitionOperation.AddElement, "P_151"));

		grdT90.Activations.add(new Activation(t90, "P_163", TransitionOperation.AddElement, "P_150"));
		grdT90.Activations.add(new Activation(t90, "P_163", TransitionOperation.AddElement, "P_153"));
		grdT90.Activations.add(new Activation(t90, "P_163", TransitionOperation.AddElement, "P_155"));
		grdT90.Activations.add(new Activation(t90, "P_163", TransitionOperation.AddElement, "P_152"));
		grdT90.Activations.add(new Activation(t90, "P_163", TransitionOperation.AddElement, "P_151"));

		grdT90.Activations.add(new Activation(t90, "P_156", TransitionOperation.AddElement, "P_150"));
		grdT90.Activations.add(new Activation(t90, "P_156", TransitionOperation.AddElement, "P_153"));
		grdT90.Activations.add(new Activation(t90, "P_156", TransitionOperation.AddElement, "P_155"));
		grdT90.Activations.add(new Activation(t90, "P_156", TransitionOperation.AddElement, "P_152"));
		grdT90.Activations.add(new Activation(t90, "P_156", TransitionOperation.AddElement, "P_151"));

		grdT90.Activations.add(new Activation(t90, "P_155", TransitionOperation.AddElement, "P_150"));
		grdT90.Activations.add(new Activation(t90, "P_155", TransitionOperation.AddElement, "P_153"));
		grdT90.Activations.add(new Activation(t90, "P_155", TransitionOperation.AddElement, "P_152"));
		grdT90.Activations.add(new Activation(t90, "P_155", TransitionOperation.AddElement, "P_151"));

		grdT90.Activations.add(new Activation(t90, "P_152", TransitionOperation.AddElement, "P_150"));
		grdT90.Activations.add(new Activation(t90, "P_152", TransitionOperation.AddElement, "P_153"));
		grdT90.Activations.add(new Activation(t90, "P_152", TransitionOperation.AddElement, "P_155"));
		grdT90.Activations.add(new Activation(t90, "P_152", TransitionOperation.AddElement, "P_151"));
		t90.GuardMappingList.add(grdT90);

		t90.Delay = 0;
		pn.Transitions.add(t90);

		// T901 ------------------------------------------------
		PetriTransition t901 = new PetriTransition(pn);
		t901.TransitionName = "T901";
		t901.InputPlaceName.add("P_150");

		Condition T901Ct1 = new Condition(t901, "P_150", TransitionCondition.NotNull);

		GuardMapping grdT901 = new GuardMapping();
		grdT901.condition = T901Ct1;
		grdT901.Activations.add(new Activation(t901, "Five", TransitionOperation.DynamicDelay,""));
		grdT901.Activations.add(new Activation(t901, "P_150", TransitionOperation.AddElement, "P_161"));
		t901.GuardMappingList.add(grdT901);

		t901.Delay = 0;
		pn.Transitions.add(t901);

		// T36 ------------------------------------------------
		PetriTransition t36 = new PetriTransition(pn);
		t36.TransitionName = "T36";
		t36.InputPlaceName.add("P_150");
		t36.InputPlaceName.add("P_161");

		Condition T36Ct1 = new Condition(t36, "P_150", TransitionCondition.NotNull);
		Condition T36Ct2 = new Condition(t36, "P_161", TransitionCondition.NotNull);
		T36Ct1.SetNextCondition(LogicConnector.AND, T36Ct2);

		GuardMapping grdT36 = new GuardMapping();
		grdT36.condition = T36Ct1;
		grdT36.Activations.add(new Activation(t36, "P_150", TransitionOperation.AddElement, "P_38"));
		grdT36.Activations.add(new Activation(t36, "P_161", TransitionOperation.AddElement, "P_38"));
		grdT36.Activations.add(new Activation(t36, "P_38", TransitionOperation.AddElement, "P_161"));
		grdT36.Activations.add(new Activation(t36, "P_38", TransitionOperation.AddElement, "P_150"));
		t36.GuardMappingList.add(grdT36);

		t36.Delay = 0;
		pn.Transitions.add(t36);

		// T22 ------------------------------------------------
		PetriTransition t22 = new PetriTransition(pn);
		t22.TransitionName = "T22";
		t22.InputPlaceName.add("P_38");

		Condition T22Ct1 = new Condition(t36, "P_38", TransitionCondition.NotNull);

		GuardMapping grdT22 = new GuardMapping();
		grdT22.condition = T22Ct1;
		grdT22.Activations.add(new Activation(t22, "P_38", TransitionOperation.AddElement, "P_127"));
		grdT22.Activations.add(new Activation(t22, "P_38", TransitionOperation.AddElement, "P_15"));
		grdT22.Activations.add(new Activation(t22, "P_127", TransitionOperation.AddElement, "P_38"));
		t22.GuardMappingList.add(grdT22);

		t22.Delay = 0;
		pn.Transitions.add(t22);

		// T23 ------------------------------------------------
		PetriTransition t23 = new PetriTransition(pn);
		t23.TransitionName = "T23";
		t23.InputPlaceName.add("P_41");

		Condition T23Ct1 = new Condition(t36, "P_41", TransitionCondition.NotNull);

		GuardMapping grdT23 = new GuardMapping();
		grdT23.condition = T23Ct1;
		grdT23.Activations.add(new Activation(t23, "P_41", TransitionOperation.AddElement, "P_127"));
		grdT23.Activations.add(new Activation(t23, "P_41", TransitionOperation.AddElement, "P_15"));
		grdT23.Activations.add(new Activation(t23, "P_127", TransitionOperation.AddElement, "P_41"));
		t23.GuardMappingList.add(grdT23);

		t23.Delay = 0;
		pn.Transitions.add(t23);

		// T38 ------------------------------------------------
		PetriTransition t38 = new PetriTransition(pn);
		t38.TransitionName = "T38";
		t38.InputPlaceName.add("P_151");

		Condition T38Ct1 = new Condition(t36, "P_151", TransitionCondition.NotNull);

		GuardMapping grdT38 = new GuardMapping();
		grdT38.condition = T38Ct1;
		grdT38.Activations.add(new Activation(t38, "P_151", TransitionOperation.AddElement, "P_41"));
		grdT38.Activations.add(new Activation(t38, "P_41", TransitionOperation.AddElement, "P_151"));
		grdT38.Activations.add(new Activation(t38, "P_151", TransitionOperation.AddElement, "P_44"));
		grdT38.Activations.add(new Activation(t38, "P_44", TransitionOperation.AddElement, "P_151"));
		grdT38.Activations.add(new Activation(t38, "P_44", TransitionOperation.AddElement, "P_41"));
		grdT38.Activations.add(new Activation(t38, "P_41", TransitionOperation.AddElement, "P_44"));
		t23.GuardMappingList.add(grdT38);

		t38.Delay = 0;
		pn.Transitions.add(t38);

		// T55 ------------------------------------------------
		PetriTransition t55 = new PetriTransition(pn);
		t55.TransitionName = "T55";
		t55.InputPlaceName.add("P_62");

		Condition T55Ct1 = new Condition(t36, "P_62", TransitionCondition.NotNull);

		GuardMapping grdT55 = new GuardMapping();
		grdT55.condition = T55Ct1;
		grdT55.Activations.add(new Activation(t55, "P_62", TransitionOperation.AddElement, "P_124"));
		grdT55.Activations.add(new Activation(t55, "P_62", TransitionOperation.AddElement, "P_6"));
		grdT55.Activations.add(new Activation(t55, "P_124", TransitionOperation.AddElement, "P_6"));
		grdT55.Activations.add(new Activation(t55, "P_124", TransitionOperation.AddElement, "P_62"));
		t55.GuardMappingList.add(grdT55);

		t55.Delay = 0;
		pn.Transitions.add(t55);

		// T62 ------------------------------------------------
		PetriTransition t62 = new PetriTransition(pn);
		t62.TransitionName = "T62";
		t62.InputPlaceName.add("P_63");

		Condition T62Ct1 = new Condition(t36, "P_63", TransitionCondition.NotNull);

		GuardMapping grdT62 = new GuardMapping();
		grdT62.condition = T62Ct1;
		grdT62.Activations.add(new Activation(t62, "P_63", TransitionOperation.AddElement, "P_62"));
		grdT62.Activations.add(new Activation(t62, "P_62", TransitionOperation.AddElement, "P_63"));
		grdT62.Activations.add(new Activation(t62, "P_63", TransitionOperation.AddElement, "P_69"));
		grdT62.Activations.add(new Activation(t62, "P_69", TransitionOperation.AddElement, "P_63"));
		grdT62.Activations.add(new Activation(t62, "P_63", TransitionOperation.AddElement, "P_68"));
		grdT62.Activations.add(new Activation(t62, "P_68", TransitionOperation.AddElement, "P_63"));
		t62.GuardMappingList.add(grdT62);

		t62.Delay = 0;
		pn.Transitions.add(t62);

		// T63 ------------------------------------------------
		PetriTransition t63 = new PetriTransition(pn);
		t63.TransitionName = "T63";
		t63.InputPlaceName.add("P_64");

		Condition T63Ct1 = new Condition(t36, "P_64", TransitionCondition.NotNull);

		GuardMapping grdT63 = new GuardMapping();
		grdT63.condition = T63Ct1;
		grdT63.Activations.add(new Activation(t63, "P_64", TransitionOperation.AddElement, "P_63"));
		grdT63.Activations.add(new Activation(t63, "P_63", TransitionOperation.AddElement, "P_64"));
		grdT63.Activations.add(new Activation(t63, "P_64", TransitionOperation.AddElement, "P_71"));
		grdT63.Activations.add(new Activation(t63, "P_71", TransitionOperation.AddElement, "P_64"));
		grdT63.Activations.add(new Activation(t63, "P_64", TransitionOperation.AddElement, "P_70"));
		grdT63.Activations.add(new Activation(t63, "P_70", TransitionOperation.AddElement, "P_64"));

		t63.GuardMappingList.add(grdT63);

		t63.Delay = 0;
		pn.Transitions.add(t63);

		// T56 ------------------------------------------------
		PetriTransition t56 = new PetriTransition(pn);
		t56.TransitionName = "T56";
		t56.InputPlaceName.add("P_6");

		Condition T56Ct1 = new Condition(t56, "P_6", TransitionCondition.NotNull);

		GuardMapping grdT56 = new GuardMapping();
		grdT56.condition = T56Ct1;
		grdT56.Activations.add(new Activation(t56, "P_6", TransitionOperation.AddElement, "P_65"));
		t56.GuardMappingList.add(grdT63);

		t56.Delay = 0;
		pn.Transitions.add(t56);

		// T61 ------------------------------------------------
		PetriTransition t61 = new PetriTransition(pn);
		t61.TransitionName = "T61";
		t61.InputPlaceName.add("P_65");

		Condition T61Ct1 = new Condition(t61, "P_65", TransitionCondition.NotNull);

		GuardMapping grdT61 = new GuardMapping();
		grdT61.condition = T61Ct1;
		grdT61.Activations.add(new Activation(t61, "P_65", TransitionOperation.AddElement, "P_66"));
		grdT61.Activations.add(new Activation(t61, "P_65", TransitionOperation.AddElement, "P_72"));
		grdT61.Activations.add(new Activation(t61, "P_72", TransitionOperation.AddElement, "P_65"));
		t61.GuardMappingList.add(grdT61);

		t61.Delay = 0;
		pn.Transitions.add(t61);

		// T64 ------------------------------------------------
		PetriTransition t64 = new PetriTransition(pn);
		t64.TransitionName = "T64";
		t64.InputPlaceName.add("P_66");

		Condition T64Ct1 = new Condition(t64, "P_66", TransitionCondition.NotNull);

		GuardMapping grdT64 = new GuardMapping();
		grdT64.condition = T64Ct1;
		grdT64.Activations.add(new Activation(t64, "P_66", TransitionOperation.AddElement, "P_67"));
		grdT64.Activations.add(new Activation(t64, "P_66", TransitionOperation.AddElement, "P_73"));
		grdT64.Activations.add(new Activation(t64, "P_73", TransitionOperation.AddElement, "P_66"));
		t64.GuardMappingList.add(grdT64);

		t64.Delay = 0;
		pn.Transitions.add(t64);

		// T85 ------------------------------------------------
		PetriTransition t85 = new PetriTransition(pn);
		t85.TransitionName = "T85";
		t85.InputPlaceName.add("P_6");

		Condition T85Ct1 = new Condition(t85, "P_6", TransitionCondition.NotNull);

		GuardMapping grdT85 = new GuardMapping();
		grdT85.condition = T85Ct1;
		grdT85.Activations.add(new Activation(t85, "P_6", TransitionOperation.AddElement, "P_122"));
		t85.GuardMappingList.add(grdT85);

		t85.Delay = 0;
		pn.Transitions.add(t85);

		// T51 ------------------------------------------------
		PetriTransition t51 = new PetriTransition(pn);
		t51.TransitionName = "T51";
		t51.InputPlaceName.add("P_122");

		Condition T51Ct1 = new Condition(t51, "P_122", TransitionCondition.NotNull);

		GuardMapping grdT51 = new GuardMapping();
		grdT51.condition = T51Ct1;
		grdT51.Activations.add(new Activation(t51, "P_122", TransitionOperation.AddElement, "P_76"));
		t51.GuardMappingList.add(grdT51);

		t51.Delay = 0;
		pn.Transitions.add(t51);

		// T65 ------------------------------------------------
		PetriTransition t65 = new PetriTransition(pn);
		t65.TransitionName = "T65";
		t65.InputPlaceName.add("P_76");

		Condition T65Ct1 = new Condition(t65, "P_76", TransitionCondition.NotNull);

		GuardMapping grdT65 = new GuardMapping();
		grdT65.condition = T65Ct1;
		grdT65.Activations.add(new Activation(t65, "P_76", TransitionOperation.AddElement, "P_77"));
		t65.GuardMappingList.add(grdT65);

		t65.Delay = 0;
		pn.Transitions.add(t65);

		// T66 ------------------------------------------------
		PetriTransition t66 = new PetriTransition(pn);
		t66.TransitionName = "T65";
		t66.InputPlaceName.add("P_77");

		Condition T66Ct1 = new Condition(t66, "P_77", TransitionCondition.NotNull); // there is no hope in this hell...

		GuardMapping grdT66 = new GuardMapping();
		grdT66.condition = T66Ct1;
		grdT66.Activations.add(new Activation(t66, "P_77", TransitionOperation.AddElement, "P_78"));
		t66.GuardMappingList.add(grdT66);

		t66.Delay = 0;
		pn.Transitions.add(t66);

		// T52 ------------------------------------------------
		PetriTransition t52 = new PetriTransition(pn);
		t52.TransitionName = "T52";
		t52.InputPlaceName.add("P_122");

		Condition T52Ct1 = new Condition(t52, "P_122", TransitionCondition.NotNull); //

		GuardMapping grdT52 = new GuardMapping();
		grdT52.condition = T52Ct1;
		grdT52.Activations.add(new Activation(t52, "P_122", TransitionOperation.AddElement, "P_79"));
		t52.GuardMappingList.add(grdT52);

		t52.Delay = 0;
		pn.Transitions.add(t52);

		// T69 ------------------------------------------------
		PetriTransition t69 = new PetriTransition(pn);
		t69.TransitionName = "T69";
		t69.InputPlaceName.add("P_122");
		t69.InputPlaceName.add("P_164");

		Condition T69Ct1 = new Condition(t69, "P_122", TransitionCondition.NotNull);
		Condition T69Ct2 = new Condition(t36, "P_164", TransitionCondition.NotNull);
		T69Ct1.SetNextCondition(LogicConnector.AND, T69Ct2);

		GuardMapping grdT69 = new GuardMapping();
		grdT69.condition = T69Ct1;
		grdT69.Activations.add(new Activation(t69, "P_122", TransitionOperation.AddElement, "P_80"));
		grdT69.Activations.add(new Activation(t69, "P_164", TransitionOperation.AddElement, "P_80"));
		t69.GuardMappingList.add(grdT69);

		t69.Delay = 0;
		pn.Transitions.add(t69);

		// T6900 ------------------------------------------------
		PetriTransition t6900 = new PetriTransition(pn);
		t6900.TransitionName = "T6900";
		t6900.InputPlaceName.add("P_79");

		Condition T6900Ct1 = new Condition(t69, "P_79", TransitionCondition.NotNull);

		GuardMapping grdT6900 = new GuardMapping();
		grdT6900.condition = T6900Ct1;
		grdT6900.Activations.add(new Activation(t6900, "Five", TransitionOperation.DynamicDelay,""));
		grdT6900.Activations.add(new Activation(t6900, "P_79", TransitionOperation.AddElement, "P_164"));
		t6900.GuardMappingList.add(grdT6900);

		t6900.Delay = 0;
		pn.Transitions.add(t6900);

		// T6901 ------------------------------------------------
		PetriTransition t6901 = new PetriTransition(pn);
		t6901.TransitionName = "T6901";
		t6901.InputPlaceName.add("P_80");

		Condition T6901Ct1 = new Condition(t69, "P_80", TransitionCondition.NotNull);

		GuardMapping grdT6901 = new GuardMapping();
		grdT6901.condition = T6901Ct1;
		grdT6901.Activations.add(new Activation(t6901, "Five", TransitionOperation.DynamicDelay,""));
		grdT6901.Activations.add(new Activation(t6901, "P_80", TransitionOperation.AddElement, "P_165"));
		t6901.GuardMappingList.add(grdT6901);

		t6901.Delay = 0;
		pn.Transitions.add(t6901);

		// T67 ------------------------------------------------
		PetriTransition t67 = new PetriTransition(pn);
		t67.TransitionName = "T69";
		t67.InputPlaceName.add("P_165");
		t67.InputPlaceName.add("P_80");

		Condition T67Ct1 = new Condition(t67, "P_165", TransitionCondition.NotNull);
		Condition T67Ct2 = new Condition(t67, "P_80", TransitionCondition.NotNull);
		T69Ct1.SetNextCondition(LogicConnector.AND, T67Ct2);

		GuardMapping grdT67 = new GuardMapping();
		grdT67.condition = T67Ct1;
		grdT67.Activations.add(new Activation(t67, "P_165", TransitionOperation.AddElement, "P_81"));
		grdT67.Activations.add(new Activation(t67, "P_80", TransitionOperation.AddElement, "P_81"));
		t67.GuardMappingList.add(grdT67);

		t67.Delay = 0;
		pn.Transitions.add(t67);

		// T68 ------------------------------------------------
		PetriTransition t68 = new PetriTransition(pn);
		t68.TransitionName = "T68";
		t68.InputPlaceName.add("P_84");

		Condition T68Ct1 = new Condition(t68, "P_84", TransitionCondition.NotNull); //

		GuardMapping grdT68 = new GuardMapping();
		grdT68.condition = T68Ct1;
		grdT68.Activations.add(new Activation(t68, "P_84", TransitionOperation.AddElement, "P_83"));
		t68.GuardMappingList.add(grdT68);

		t68.Delay = 0;
		pn.Transitions.add(t68);

		// T70 ------------------------------------------------
		PetriTransition t70 = new PetriTransition(pn);
		t70.TransitionName = "T70";
		t70.InputPlaceName.add("P_83");

		Condition T70Ct1 = new Condition(t70, "P_83", TransitionCondition.NotNull); //

		GuardMapping grdT70 = new GuardMapping();
		grdT70.condition = T70Ct1;
		grdT70.Activations.add(new Activation(t70, "P_83", TransitionOperation.AddElement, "P_82"));
		grdT70.Activations.add(new Activation(t70, "P_82", TransitionOperation.AddElement, "P_83"));
		t70.GuardMappingList.add(grdT70);

		t70.Delay = 0;
		pn.Transitions.add(t70);

		// T53 ------------------------------------------------
		PetriTransition t53 = new PetriTransition(pn);
		t53.TransitionName = "T53";
		t53.InputPlaceName.add("P_82");
		t53.InputPlaceName.add("P_126");

		Condition T53Ct1 = new Condition(t53, "P_82", TransitionCondition.NotNull);
		Condition T53Ct2 = new Condition(t53, "P_126", TransitionCondition.NotNull);
		T53Ct1.SetNextCondition(LogicConnector.AND, T53Ct2);

		GuardMapping grdT53 = new GuardMapping();
		grdT53.condition = T53Ct1;
		grdT53.Activations.add(new Activation(t53, "P_82", TransitionOperation.AddElement, "P_126"));
		grdT53.Activations.add(new Activation(t53, "P_82", TransitionOperation.AddElement, "P_6"));
		grdT53.Activations.add(new Activation(t53, "P_126", TransitionOperation.AddElement, "P_82"));
		grdT53.Activations.add(new Activation(t53, "P_126", TransitionOperation.AddElement, "P_6"));
		t53.GuardMappingList.add(grdT53);

		t53.Delay = 0;
		pn.Transitions.add(t53);

		// T72 ------------------------------------------------
		PetriTransition t72 = new PetriTransition(pn);
		t72.TransitionName = "T72";
		t72.InputPlaceName.add("P_87");
		t72.InputPlaceName.add("P_89");

		Condition T72Ct1 = new Condition(t72, "P_87", TransitionCondition.NotNull);
		Condition T72Ct2 = new Condition(t72, "P_89", TransitionCondition.NotNull);
		T72Ct1.SetNextCondition(LogicConnector.AND, T72Ct2);

		GuardMapping grdT72 = new GuardMapping();
		grdT72.condition = T72Ct1;
		grdT72.Activations.add(new Activation(t72, "P_87", TransitionOperation.AddElement, "P_86"));
		grdT72.Activations.add(new Activation(t72, "P_89", TransitionOperation.AddElement, "P_86"));
		t72.GuardMappingList.add(grdT72);

		t72.Delay = 0;
		pn.Transitions.add(t72);

		// T71 ------------------------------------------------
		PetriTransition t71 = new PetriTransition(pn);
		t71.TransitionName = "T71";
		t71.InputPlaceName.add("P_86");

		Condition T71Ct1 = new Condition(t71, "P_86", TransitionCondition.NotNull);

		GuardMapping grdT71 = new GuardMapping();
		grdT71.condition = T71Ct1;
		grdT71.Activations.add(new Activation(t71, "P_86", TransitionOperation.AddElement, "P_85"));
		grdT71.Activations.add(new Activation(t71, "P_85", TransitionOperation.AddElement, "P_86"));
		t71.GuardMappingList.add(grdT71);

		t71.Delay = 0;
		pn.Transitions.add(t71);

		// T54 ------------------------------------------------
		PetriTransition t54 = new PetriTransition(pn);
		t54.TransitionName = "T54";
		t54.InputPlaceName.add("P_85");
		t54.InputPlaceName.add("P_126");

		Condition T54Ct1 = new Condition(t54, "P_85", TransitionCondition.NotNull);
		Condition T54Ct2 = new Condition(t54, "P_126", TransitionCondition.NotNull);
		T54Ct1.SetNextCondition(LogicConnector.AND, T54Ct2);

		GuardMapping grdT54 = new GuardMapping();
		grdT54.condition = T54Ct1;
		grdT54.Activations.add(new Activation(t54, "P_85", TransitionOperation.AddElement, "P_126"));
		grdT54.Activations.add(new Activation(t54, "P_85", TransitionOperation.AddElement, "P_6"));
		grdT54.Activations.add(new Activation(t54, "P_126", TransitionOperation.AddElement, "P_85"));
		grdT54.Activations.add(new Activation(t54, "P_126", TransitionOperation.AddElement, "P_6"));
		t54.GuardMappingList.add(grdT54);

		t54.Delay = 0;
		pn.Transitions.add(t54);

		// T86 ------------------------------------------------
		PetriTransition t86 = new PetriTransition(pn);
		t86.TransitionName = "T86";
		t86.InputPlaceName.add("P_6");

		Condition T86Ct1 = new Condition(t86, "P_6", TransitionCondition.NotNull); //

		GuardMapping grdT86 = new GuardMapping();
		grdT86.condition = T86Ct1;
		grdT86.Activations.add(new Activation(t86, "P_6", TransitionOperation.AddElement, "P_123"));
		t86.GuardMappingList.add(grdT86);

		t86.Delay = 0;
		pn.Transitions.add(t86);

		// T57 ------------------------------------------------
		PetriTransition t57 = new PetriTransition(pn);
		t57.TransitionName = "T86";
		t57.InputPlaceName.add("P_90");

		Condition T57Ct1 = new Condition(t57, "P_90", TransitionCondition.NotNull); //

		GuardMapping grdT57 = new GuardMapping();
		grdT86.condition = T57Ct1;
		grdT86.Activations.add(new Activation(t57, "P_90", TransitionOperation.AddElement, "P_102"));
		grdT86.Activations.add(new Activation(t57, "P_90", TransitionOperation.AddElement, "P_66"));
		t57.GuardMappingList.add(grdT57);

		t57.Delay = 0;
		pn.Transitions.add(t57);

		// T88 ------------------------------------------------
		PetriTransition t88 = new PetriTransition(pn);
		t88.TransitionName = "T88";
		t88.InputPlaceName.add("P_94");
		t88.InputPlaceName.add("P_95");
		t88.InputPlaceName.add("P_133");

		Condition T88Ct1 = new Condition(t88, "P_94", TransitionCondition.NotNull);
		Condition T88Ct2 = new Condition(t88, "P_95", TransitionCondition.NotNull);
		Condition T88Ct3 = new Condition(t88, "P_133", TransitionCondition.NotNull);
		T88Ct1.SetNextCondition(LogicConnector.AND, T88Ct2);
		T88Ct1.SetNextCondition(LogicConnector.AND, T88Ct3);

		GuardMapping grdT88 = new GuardMapping();
		grdT88.condition = T88Ct1;
		grdT88.Activations.add(new Activation(t88, "P_94", TransitionOperation.AddElement, "P_130"));
		grdT88.Activations.add(new Activation(t88, "P_94", TransitionOperation.AddElement, "P_131"));
		grdT88.Activations.add(new Activation(t88, "P_94", TransitionOperation.AddElement, "P_133"));
		grdT88.Activations.add(new Activation(t88, "P_95", TransitionOperation.AddElement, "P_130"));
		grdT88.Activations.add(new Activation(t88, "P_95", TransitionOperation.AddElement, "P_131"));
		grdT88.Activations.add(new Activation(t88, "P_95", TransitionOperation.AddElement, "P_133"));
		grdT88.Activations.add(new Activation(t88, "P_133", TransitionOperation.AddElement, "P_130"));
		grdT88.Activations.add(new Activation(t88, "P_133", TransitionOperation.AddElement, "P_131"));
		t88.GuardMappingList.add(grdT88);

		t88.Delay = 0;
		pn.Transitions.add(t88);

		// T74 ------------------------------------------------
		PetriTransition t74 = new PetriTransition(pn);
		t74.TransitionName = "T74";
		t74.InputPlaceName.add("P_130");
		t74.InputPlaceName.add("P_103");
		t74.InputPlaceName.add("P_105");

		Condition T74Ct1 = new Condition(t74, "P_130", TransitionCondition.NotNull);
		Condition T74Ct2 = new Condition(t74, "P_103", TransitionCondition.NotNull);
		Condition T74Ct3 = new Condition(t74, "P_105", TransitionCondition.NotNull);
		T88Ct1.SetNextCondition(LogicConnector.AND, T74Ct2);
		T88Ct1.SetNextCondition(LogicConnector.AND, T74Ct3);

		GuardMapping grdT74 = new GuardMapping();
		grdT74.condition = T74Ct1;
		grdT74.Activations.add(new Activation(t74, "P_130", TransitionOperation.AddElement, "P_98"));
		grdT74.Activations.add(new Activation(t74, "P_130", TransitionOperation.AddElement, "P_104"));
		grdT74.Activations.add(new Activation(t74, "P_130", TransitionOperation.AddElement, "P_105"));
		grdT74.Activations.add(new Activation(t74, "P_103", TransitionOperation.AddElement, "P_98"));
		grdT74.Activations.add(new Activation(t74, "P_103", TransitionOperation.AddElement, "P_104"));
		t74.GuardMappingList.add(grdT74);

		t74.Delay = 0;
		pn.Transitions.add(t74);

		// T75 ------------------------------------------------
		PetriTransition t75 = new PetriTransition(pn);
		t75.TransitionName = "T75";
		t75.InputPlaceName.add("P_131");
		t75.InputPlaceName.add("P_168");

		Condition T75Ct1 = new Condition(t75, "P_131", TransitionCondition.NotNull);
		Condition T75Ct2 = new Condition(t75, "P_168", TransitionCondition.NotNull);
		T88Ct1.SetNextCondition(LogicConnector.AND, T75Ct2);

		GuardMapping grdT75 = new GuardMapping();
		grdT75.condition = T75Ct1;
		grdT75.Activations.add(new Activation(t75, "P_131", TransitionOperation.AddElement, "P_99"));
		grdT75.Activations.add(new Activation(t75, "P_168", TransitionOperation.AddElement, "P_99"));
		t75.GuardMappingList.add(grdT75);

		t75.Delay = 0;
		pn.Transitions.add(t75);

		// T104 ------------------------------------------------
		PetriTransition t104 = new PetriTransition(pn);
		t104.TransitionName = "T104";
		t104.InputPlaceName.add("P_131");

		Condition T104Ct1 = new Condition(t104, "P_131", TransitionCondition.NotNull);

		GuardMapping grdT104 = new GuardMapping();
		grdT104.condition = T104Ct1;
		grdT104.Activations.add(new Activation(t104, "Five", TransitionOperation.DynamicDelay,""));
		grdT104.Activations.add(new Activation(t104, "P_131", TransitionOperation.AddElement, "P_169"));
		t104.GuardMappingList.add(grdT104);

		t104.Delay = 0;
		pn.Transitions.add(t104);

		// T105 ------------------------------------------------
		PetriTransition t105 = new PetriTransition(pn);
		t105.TransitionName = "T105";
		t105.InputPlaceName.add("P_100");

		Condition T105Ct1 = new Condition(t105, "P_100", TransitionCondition.NotNull);

		GuardMapping grdT105 = new GuardMapping();
		grdT105.condition = T105Ct1;
		grdT105.Activations.add(new Activation(t105, "Five", TransitionOperation.DynamicDelay,""));
		grdT105.Activations.add(new Activation(t105, "P_100", TransitionOperation.AddElement, "P_131"));
		t105.GuardMappingList.add(grdT105);

		t105.Delay = 0;
		pn.Transitions.add(t105);

		// T78 ------------------------------------------------
		PetriTransition t78 = new PetriTransition(pn);
		t78.TransitionName = "T78";
		t78.InputPlaceName.add("P_100");
		t78.InputPlaceName.add("P_169");

		Condition T78Ct1 = new Condition(t78, "P_100", TransitionCondition.NotNull);
		Condition T78Ct2 = new Condition(t78, "P_169", TransitionCondition.NotNull);
		T88Ct1.SetNextCondition(LogicConnector.AND, T78Ct2);

		GuardMapping grdT78 = new GuardMapping();
		grdT78.condition = T78Ct1;
		grdT78.Activations.add(new Activation(t78, "P_100", TransitionOperation.DynamicDelay,"P_135"));
		grdT78.Activations.add(new Activation(t78, "P_169", TransitionOperation.AddElement, "P_135"));
		t78.GuardMappingList.add(grdT78);

		t78.Delay = 0;
		pn.Transitions.add(t78);

		// T79 ------------------------------------------------
		PetriTransition t79 = new PetriTransition(pn);
		t79.TransitionName = "T79";
		t79.InputPlaceName.add("P_101");
		t79.InputPlaceName.add("P_112");
		t79.InputPlaceName.add("P_111");

		Condition T79Ct1 = new Condition(t79, "P_101", TransitionCondition.NotNull);
		Condition T79Ct2 = new Condition(t79, "P_112", TransitionCondition.NotNull);
		Condition T79Ct3 = new Condition(t79, "P_111", TransitionCondition.NotNull);
		T88Ct1.SetNextCondition(LogicConnector.AND, T79Ct2);
		T88Ct1.SetNextCondition(LogicConnector.AND, T79Ct3);

		GuardMapping grdT79 = new GuardMapping();
		grdT79.condition = T79Ct1;
		grdT79.Activations.add(new Activation(t79, "P_101", TransitionOperation.AddElement,"P_136"));
		grdT79.Activations.add(new Activation(t79, "P_101", TransitionOperation.AddElement, "P_113"));
		grdT79.Activations.add(new Activation(t79, "P_101", TransitionOperation.AddElement, "P_111"));
		grdT79.Activations.add(new Activation(t79, "P_111", TransitionOperation.AddElement, "P_136"));
		grdT79.Activations.add(new Activation(t79, "P_112", TransitionOperation.AddElement, "P_136"));
		t79.GuardMappingList.add(grdT79);

		t79.Delay = 0;
		pn.Transitions.add(t79);

		// T87 ------------------------------------------------
		PetriTransition t87 = new PetriTransition(pn);
		t87.TransitionName = "T87";
		t87.InputPlaceName.add("P_136");
		t87.InputPlaceName.add("P_135");
		t87.InputPlaceName.add("P_140");

		Condition T87Ct1 = new Condition(t87, "P_136", TransitionCondition.NotNull);
		Condition T87Ct2 = new Condition(t87, "P_135", TransitionCondition.NotNull);
		Condition T87Ct3 = new Condition(t87, "P_140", TransitionCondition.NotNull);
		T88Ct1.SetNextCondition(LogicConnector.AND, T87Ct2);
		T88Ct1.SetNextCondition(LogicConnector.AND, T87Ct3);

		GuardMapping grdT87 = new GuardMapping();
		grdT87.condition = T87Ct1;
		grdT87.Activations.add(new Activation(t87, "P_136", TransitionOperation.AddElement,"P_139"));
		grdT87.Activations.add(new Activation(t87, "P_136", TransitionOperation.AddElement,"P_137"));
		grdT87.Activations.add(new Activation(t87, "P_136", TransitionOperation.AddElement,"P_138"));
		grdT87.Activations.add(new Activation(t87, "P_137", TransitionOperation.AddElement,"P_136"));
		grdT87.Activations.add(new Activation(t87, "P_138", TransitionOperation.AddElement,"P_136"));
		grdT87.Activations.add(new Activation(t87, "P_135", TransitionOperation.AddElement, "P_96"));
		grdT87.Activations.add(new Activation(t87, "P_140", TransitionOperation.AddElement, "P_97"));
		t87.GuardMappingList.add(grdT87);

		t87.Delay = 0;
		pn.Transitions.add(t87);

		// T80 ------------------------------------------------
		PetriTransition t80 = new PetriTransition(pn);
		t80.TransitionName = "T80";
		t80.InputPlaceName.add("P_97");

		Condition T80Ct1 = new Condition(t80, "P_97", TransitionCondition.NotNull);

		GuardMapping grdT80 = new GuardMapping();
		grdT80.condition = T80Ct1;
		grdT80.Activations.add(new Activation(t80, "P_97", TransitionOperation.AddElement,"P_147"));
		grdT80.Activations.add(new Activation(t80, "P_97", TransitionOperation.AddElement,"P_136"));
		grdT80.Activations.add(new Activation(t80, "P_97", TransitionOperation.AddElement,"P_146"));
		grdT80.Activations.add(new Activation(t80, "P_97", TransitionOperation.AddElement,"P_135"));
		grdT80.Activations.add(new Activation(t80, "P_97", TransitionOperation.AddElement,"P_145"));
		grdT80.Activations.add(new Activation(t80, "P_97", TransitionOperation.AddElement,"P_93"));

		grdT80.Activations.add(new Activation(t80, "P_147", TransitionOperation.AddElement,"P_97"));
		grdT80.Activations.add(new Activation(t80, "P_136", TransitionOperation.AddElement,"P_97"));
		grdT80.Activations.add(new Activation(t80, "P_146", TransitionOperation.AddElement,"P_97"));
		grdT80.Activations.add(new Activation(t80, "P_135", TransitionOperation.AddElement,"P_97"));
		grdT80.Activations.add(new Activation(t80, "P_145", TransitionOperation.AddElement,"P_97"));
		grdT80.Activations.add(new Activation(t80, "P_93", TransitionOperation.AddElement,"P_97"));
		t80.GuardMappingList.add(grdT80);

		t80.Delay = 0;
		pn.Transitions.add(t80);

		// T60 ------------------------------------------------
		PetriTransition t60 = new PetriTransition(pn);
		t60.TransitionName = "T60";
		t60.InputPlaceName.add("P_93");

		Condition T60Ct1 = new Condition(t60, "P_93", TransitionCondition.NotNull);

		GuardMapping grdT60 = new GuardMapping();
		grdT60.condition = T60Ct1;
		grdT60.Activations.add(new Activation(t60, "P_93", TransitionOperation.AddElement,"P_125"));
		grdT60.Activations.add(new Activation(t60, "P_125", TransitionOperation.AddElement,"P_93"));
		grdT60.Activations.add(new Activation(t60, "P_93", TransitionOperation.AddElement,"P_6"));
		t60.GuardMappingList.add(grdT60);

		t60.Delay = 0;
		pn.Transitions.add(t60);

		// T77 ------------------------------------------------
		PetriTransition t77 = new PetriTransition(pn);
		t77.TransitionName = "T77";
		t77.InputPlaceName.add("P_96");
		t77.InputPlaceName.add("P_167");

		Condition T77Ct1 = new Condition(t77, "P_96", TransitionCondition.NotNull);
		Condition T77Ct2 = new Condition(t77, "P_167", TransitionCondition.NotNull);
		T77Ct1.SetNextCondition(LogicConnector.AND, T77Ct2);

		GuardMapping grdT77 = new GuardMapping();
		grdT77.condition = T77Ct1;
		grdT77.Activations.add(new Activation(t77, "P_96", TransitionOperation.AddElement,"P_92"));
		grdT77.Activations.add(new Activation(t77, "P_92", TransitionOperation.AddElement,"P_96"));
		grdT77.Activations.add(new Activation(t77, "P_167", TransitionOperation.AddElement,"P_92"));
		t77.GuardMappingList.add(grdT77);

		t77.Delay = 0;
		pn.Transitions.add(t77);

		// T103 ------------------------------------------------
		PetriTransition t103 = new PetriTransition(pn);
		t103.TransitionName = "T103";
		t103.InputPlaceName.add("P_96");

		Condition T103Ct1 = new Condition(t103, "P_18", TransitionCondition.NotNull);

		GuardMapping grdT103 = new GuardMapping();
		grdT103.condition = T103Ct1;
		grdT103.Activations.add(new Activation(t103, "Five", TransitionOperation.DynamicDelay,""));
		grdT103.Activations.add(new Activation(t103, "P_96", TransitionOperation.AddElement, "P_167"));
		t103.GuardMappingList.add(grdT103);

		t103.Delay = 0;
		pn.Transitions.add(t103);

		// T59 ------------------------------------------------
		PetriTransition t59 = new PetriTransition(pn);
		t59.TransitionName = "T59";
		t59.InputPlaceName.add("P_92");

		Condition T59Ct1 = new Condition(t59, "P_92", TransitionCondition.NotNull);

		GuardMapping grdT59 = new GuardMapping();
		grdT59.condition = T59Ct1;
		grdT59.Activations.add(new Activation(t59, "P_92", TransitionOperation.AddElement, "P_6"));
		grdT59.Activations.add(new Activation(t59, "P_92", TransitionOperation.AddElement, "P_125"));
		grdT59.Activations.add(new Activation(t59, "P_125", TransitionOperation.AddElement, "P_92"));
		t59.GuardMappingList.add(grdT59);

		t59.Delay = 0;
		pn.Transitions.add(t59); // Found solace, now time for the controllers... O__O

		// -------------------------------------------------------------------------------------
		// ----------------------------PNStart-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("Lanes_Intersection started \n ------------------------------");
		pn.Delay = 2000;

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
	}
}
