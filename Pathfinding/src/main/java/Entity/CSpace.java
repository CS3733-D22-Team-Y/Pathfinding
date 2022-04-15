package Entity;

import java.util.List;

/*

NOTE : This system of Nodes likely needs to be HEAVILY updated and fixed,
my apologies that this does not

*/

public class CSpace {
    //Instantiation
    //Main Nodes in Pod A
    public Node A1 = new Entity.Node("A1");
    public Node A2 = new Entity.Node("A2");
    public Node A3 = new Entity.Node("A3");
    public Node A4 = new Entity.Node("A4");
    public Node A5 = new Entity.Node("A5");
    public Node A6 = new Entity.Node("A6");
    public Node A7 = new Entity.Node("A7");
    public Node A8 = new Entity.Node("A8");
    public Node A9 = new Entity.Node("A9");
    public Node A10 = new Entity.Node("A10");

    //Main Nodes in Pod B
    public Node B1 = new Entity.Node("B1", List.of(H1));
    public Node B2 = new Entity.Node("B2"H2));
    public Node B3 = new Entity.Node("B3"H3));
    public Node B4 = new Entity.Node("B4"H4));
    public Node B5 = new Entity.Node("B5"H5));
    public Node B6 = new Entity.Node("B6"H6));
    public Node B7 = new Entity.Node("B7"H7));
    public Node B8 = new Entity.Node("B8"H8));
    public Node B9 = new Entity.Node("B9"H9));
    public Node B10 = new Entity.Node("B10"H10));

    //Main Nodes in Pod C
    public Node C1 = new Entity.Node("C1"H51));
    public Node C2 = new Entity.Node("C2"H52));
    public Node C3 = new Entity.Node("C3"H54));
    public Node C4 = new Entity.Node("C4"H56));
    public Node C5 = new Entity.Node("C5"H57));
    public Node C6 = new Entity.Node("C6"H58));
    public Node C7 = new Entity.Node("C7"H59));
    public Node C8 = new Entity.Node("C8"H60));
    public Node C9 = new Entity.Node("C9"H61));
    public Node C10 = new Entity.Node("C10"H62));

    //Main Nodes in Pod D
    public Node D1 = new Entity.Node("D1"H71));
    public Node D2 = new Entity.Node("D2"H72));
    public Node D3 = new Entity.Node("D3"H73));
    public Node D4 = new Entity.Node("D4"H74));
    public Node D5 = new Entity.Node("D5"H75));
    public Node D6 = new Entity.Node("D6"H76));
    public Node D7 = new Entity.Node("D7"H77));
    public Node D8 = new Entity.Node("D8"H78));
    public Node D9 = new Entity.Node("D9"H79));
    public Node D10 = new Entity.Node("D10"H80));
    public Node D11 = new Entity.Node("D11"H81));
    public Node D12 = new Entity.Node("D12"H83));
    public Node D13 = new Entity.Node("D13"H84));
    public Node D14 = new Entity.Node("D14"H85));
    public Node D15 = new Entity.Node("D15"H86));
    public Node D16 = new Entity.Node("D16"H87));
    public Node D17 = new Entity.Node("D17"H88));

    //Other Functional Nodes
    public Node E1 = new Entity.Node("E1"DRT, H43));
    public Node E2 = new Entity.Node("E2"H101));
    public Node BED1 = new Entity.Node("BED1"H37, H38, M10));
    public Node BED2 = new Entity.Node("BED2"H93, H94, H95, H96));
    public Node DRT = new Entity.Node("DRT"E1));
    public Node CLN1 = new Entity.Node("CLN1"H37, H38, M10));
    public Node CLN2 = new Entity.Node("CLN2"H53, M29));
    public Node SW1 = new Entity.Node("SW1"H15));
    public Node SW2 = new Entity.Node("SW2"H65));
    public Node SE1 = new Entity.Node("SE1"H17));
    public Node SE2 = new Entity.Node("SE2"H67));

    //Miscellaneous Room Nodes
    public Node M1 = new Entity.Node("M1"H101));
    public Node M2 = new Entity.Node("M2"H5, H6));
    public Node M3 = new Entity.Node("M3"H100));
    public Node M4 = new Entity.Node("M4"CLN1, M5));
    public Node M5 = new Entity.Node("M5"M4, H9));
    public Node M6 = new Entity.Node("M6"H1, H11));
    public Node M7 = new Entity.Node("M7"H13));
    public Node M8 = new Entity.Node("M8"H12));
    public Node M9 = new Entity.Node("M9"H23));
    public Node M10 = new Entity.Node("M10"BED1, H102, M23, M11));
    public Node M11 = new Entity.Node("M11"M10, M24));
    public Node M12 = new Entity.Node("M12"H103));
    public Node M13 = new Entity.Node("M13"H27));
    public Node M14 = new Entity.Node("M14"H31));
    public Node M15 = new Entity.Node("M15"H31));
    public Node M16 = new Entity.Node("M16"H33));
    public Node M17 = new Entity.Node("M17"H34));
    public Node M18 = new Entity.Node("M18"H35, M19));
    public Node M19 = new Entity.Node("M19"M18));
    public Node M20 = new Entity.Node("M20"H36));
    public Node M21 = new Entity.Node("M21"H36));
    public Node M22 = new Entity.Node("M22"H38));
    public Node M23 = new Entity.Node("M23"H41, M10));
    public Node M24 = new Entity.Node("M24"H42, M11));
    public Node M25 = new Entity.Node("M25"H44));
    public Node M26 = new Entity.Node("M26"H49));
    public Node M27 = new Entity.Node("M27"H50));
    public Node M28 = new Entity.Node("M28"H51, H62));
    public Node M29 = new Entity.Node("M29"CLN2, M30));
    public Node M30 = new Entity.Node("M30"H59, M29));
    public Node M31 = new Entity.Node("M31"H56));
    public Node M32 = new Entity.Node("M32"H96));
    public Node M33 = new Entity.Node("M33"H96));
    public Node M34 = new Entity.Node("M34"H95));
    public Node M35 = new Entity.Node("M35"H47, M36));
    public Node M36 = new Entity.Node("M36"M35));
    public Node M37 = new Entity.Node("M37"H94));
    public Node M38 = new Entity.Node("M38"H92));
    public Node M39 = new Entity.Node("M39"H92));
    public Node M40 = new Entity.Node("M40"H69, H90));
    public Node M41 = new Entity.Node("M41"H71));
    public Node M42 = new Entity.Node("M42"H70));
    public Node M43 = new Entity.Node("M43"H74));
    public Node M44 = new Entity.Node("M44"H77));
    public Node M45 = new Entity.Node("M45"H80));
    public Node M46 = new Entity.Node("M46"H82));
    public Node M47 = new Entity.Node("M47"H82));
    public Node M48 = new Entity.Node("M48"H85));
    public Node M49 = new Entity.Node("M49"H89));
    public Node M50 = new Entity.Node("M50"H91));
    public Node M51 = new Entity.Node("M51"H98));
    public Node M52 = new Entity.Node("M52"H99));
    public Node M53 = new Entity.Node("M53"H38));

    //Hallway Nodes
    public Node H1 = new Entity.Node("H1"B1, H2, H13, M6));
    public Node H2 = new Entity.Node("H2"B2, H1, H3));
    public Node H3 = new Entity.Node("H3"B3, CLN1, H2, H4));
    public Node H4 = new Entity.Node("H4"B4, H3, H5));
    public Node H5 = new Entity.Node("H5"B5, H4, H6, M2));
    public Node H6 = new Entity.Node("H6"B6, H5, H7, M2));
    public Node H7 = new Entity.Node("H7"B7, H6, H8));
    public Node H8 = new Entity.Node("H8"B8, H7, H9));
    public Node H9 = new Entity.Node("H9"B9, H8, H10, M5));
    public Node H10 = new Entity.Node("H10"B10, H9, H11));
    public Node H11 = new Entity.Node("H11"H10, H12, H14, M6));
    public Node H12 = new Entity.Node("H12"H11, H13, H39, M8));
    public Node H13 = new Entity.Node("H13"H1, H12, M7));
    public Node H14 = new Entity.Node("H14"H11, H15));
    public Node H15 = new Entity.Node("H15"H14, H16, SW1));
    public Node H16 = new Entity.Node("H16"H15, H17));
    public Node H17 = new Entity.Node("H17"H16, H18, SE1));
    public Node H18 = new Entity.Node("H18"H17, H19));
    public Node H19 = new Entity.Node("H19"H18, H20, H22));
    public Node H20 = new Entity.Node("H20");
    public Node H21 = new Entity.Node("H21"A2, H20));
    public Node H22 = new Entity.Node("H22"H23, H32, H36));
    public Node H23 = new Entity.Node("H23"H22, H24, M9));
    public Node H24 = new Entity.Node("H24"H23, H26));
    public Node H25 = new Entity.Node("H25"H37, H103));
    public Node H26 = new Entity.Node("H26"A3, H24, H27));
    public Node H27 = new Entity.Node("H27"H26, H28, M13));
    public Node H28 = new Entity.Node("H28"A3, H27, H29));
    public Node H29 = new Entity.Node("H29"H28, H30));
    public Node H30 = new Entity.Node("H30"A4, A5, H29, H31));
    public Node H31 = new Entity.Node("H31"A6, H30, M14, M15));
    public Node H32 = new Entity.Node("H32"H22, H33));
    public Node H33 = new Entity.Node("H33"H32, H34, H35, M16));
    public Node H34 = new Entity.Node("H34"A7, A8, H33, M17));
    public Node H35 = new Entity.Node("H35"A9, A10, H33, M18));
    public Node H36 = new Entity.Node("H36"H22, H37, M20, M21));
    public Node H37 = new Entity.Node("H37"BED1, H25, H36));
    public Node H38 = new Entity.Node("H38"BED1, H39, M22, M53));
    public Node H39 = new Entity.Node("H39"H12, H38, H40));
    public Node H40 = new Entity.Node("H40"H39, H41));
    public Node H41 = new Entity.Node("H41"H40, H42, M23));
    public Node H42 = new Entity.Node("H42"H41, H43, M24));
    public Node H43 = new Entity.Node("H43"E1, H42, H44));
    public Node H44 = new Entity.Node("H44"H43, H45, M25));
    public Node H45 = new Entity.Node("H45"H44, H46, H47));
    public Node H46 = new Entity.Node("H46"H45, H48));
    public Node H47 = new Entity.Node("H47"H45, M35));
    public Node H48 = new Entity.Node("H48"H46, H49, H96));
    public Node H49 = new Entity.Node("H49"H48, H50, H63, M26));
    public Node H50 = new Entity.Node("H50"H49, H51, M27));
    public Node H51 = new Entity.Node("H51"C1, H50, H52, M28));
    public Node H52 = new Entity.Node("H52"C2, H51, H53));
    public Node H53 = new Entity.Node("H53"CLN2, H52, H54));
    public Node H54 = new Entity.Node("H54"C3, H53, H55));
    public Node H55 = new Entity.Node("H55"C4, H54, H56));
    public Node H56 = new Entity.Node("H56"C5, H55, H57));
    public Node H57 = new Entity.Node("H57"C6, H56, H58));
    public Node H58 = new Entity.Node("H58"C7, H57, H59));
    public Node H59 = new Entity.Node("H59"C8, H58, H60, M30));
    public Node H60 = new Entity.Node("H60"C8, H59, H61));
    public Node H61 = new Entity.Node("H61"C10, H60, H62));
    public Node H62 = new Entity.Node("H62"H61, H63, H64, M28));
    public Node H63 = new Entity.Node("H63"H49, H62));
    public Node H64 = new Entity.Node("H64"H62, H65));
    public Node H65 = new Entity.Node("H65"H64, H66, SW2));
    public Node H66 = new Entity.Node("H66"H65, H67));
    public Node H67 = new Entity.Node("H67"H66, H68, SE2));
    public Node H68 = new Entity.Node("H68"H67, H69));
    public Node H69 = new Entity.Node("H69"H68, H70, H91, M40));
    public Node H70 = new Entity.Node("H70"H69, H71, H72, M42));
    public Node H71 = new Entity.Node("H71"D1, H70, H72, M41));
    public Node H72 = new Entity.Node("H72"D2, H70, H71, H73));
    public Node H73 = new Entity.Node("H73"D3, H72, H74));
    public Node H74 = new Entity.Node("H74"D4, H73, H75, M43));
    public Node H75 = new Entity.Node("H75"D5, H74, H76));
    public Node H76 = new Entity.Node("H76"D6, H75, H77));
    public Node H77 = new Entity.Node("H77"D7, H76, H78, M44));
    public Node H78 = new Entity.Node("H78"D8, H77, H79));
    public Node H79 = new Entity.Node("H79"D9, H78, H80));
    public Node H80 = new Entity.Node("H80"D10, H79, H81, M45));
    public Node H81 = new Entity.Node("H81"D11, H80, H82));
    public Node H82 = new Entity.Node("H82"H81, H83, M46, M47));
    public Node H83 = new Entity.Node("H83"D12, H82, H84));
    public Node H84 = new Entity.Node("H84"D13, H83, H85));
    public Node H85 = new Entity.Node("H85"D14, H84, H86, M48));
    public Node H86 = new Entity.Node("H86"D15, H85, H87, H89));
    public Node H87 = new Entity.Node("H87"D16, H86, H88));
    public Node H88 = new Entity.Node("H88"D17, H87));
    public Node H89 = new Entity.Node("H89"H86, H90, M49));
    public Node H90 = new Entity.Node("H90"H89, H91, M40));
    public Node H91 = new Entity.Node("H91"H69, H90, H92, M50));
    public Node H92 = new Entity.Node("H92"H91, H93, M38, M39));
    public Node H93 = new Entity.Node("H93"BED2, H92, H94, H97));
    public Node H94 = new Entity.Node("H94"BED2, H93, H95, M37));
    public Node H95 = new Entity.Node("H95"BED2, H94, H96, M34));
    public Node H96 = new Entity.Node("H96"BED2, H48, H95, M32, M33));
    public Node H97 = new Entity.Node("H97"H93, H98));
    public Node H98 = new Entity.Node("H98"H97, H99, M51));
    public Node H99 = new Entity.Node("H99"H98, H100, M52));
    public Node H100 = new Entity.Node("H100"H99, H101, M3));
    public Node H101 = new Entity.Node("H101"E2, H100, H102));
    public Node H102 = new Entity.Node("H102"H101, H103, M10));
    public Node H103 = new Entity.Node("H103"H25, H102, M12));

    //Setting neighbor attribute for all nodes
    A1.neighbors = List.of(H20);
    A2.neighbors = List.of(H21);
}
