package com.tugas.rivanda;

/**
 *
 * @author Rivanda
 */

import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Date date = new Date ();
        ArrayList<Pegawai> listPegawai = new ArrayList<Pegawai>();
        DecimalFormat df = new DecimalFormat ("#,###");
        
        Pinjam[] peminjaman = new Pinjam[419];
        
        
        peminjaman[0] = new Pinjam("IA",1486500,0);
        peminjaman[1] = new Pinjam("IA",1486500,1);
        peminjaman[2] = new Pinjam("IA",1533400,2);
        peminjaman[3] = new Pinjam("IA",1533400,3);
        peminjaman[4] = new Pinjam("IA",1581700,4);
        peminjaman[5] = new Pinjam("IA",1581700,5);
        peminjaman[6] = new Pinjam("IA",1631500,6);
        peminjaman[7] = new Pinjam("IA",1631500,7);
        peminjaman[8] = new Pinjam("IA",1682900,8);
        peminjaman[9] = new Pinjam("IA",1682900,9);
        peminjaman[10] = new Pinjam("IA",1735900,10);
        peminjaman[11] = new Pinjam("IA",1735900,11);
        peminjaman[12] = new Pinjam("IA",1790500,12);
        peminjaman[13] = new Pinjam("IA",1790500,13);
        peminjaman[14] = new Pinjam("IA",1846900,14);
        peminjaman[15] = new Pinjam("IA",1846900,15);
        peminjaman[16] = new Pinjam("IA",1905100,16);
        peminjaman[17] = new Pinjam("IA",1905100,17);
        peminjaman[18] = new Pinjam("IA",1965100,18);
        peminjaman[19] = new Pinjam("IA",1965100,19);
        peminjaman[20] = new Pinjam("IA",202700,20);
        peminjaman[21] = new Pinjam("IA",202700,21);
        peminjaman[22] = new Pinjam("IA",2090800,22);
        peminjaman[23] = new Pinjam("IA",2090800,23);
        peminjaman[24] = new Pinjam("IA",2156700,24);
        peminjaman[25] = new Pinjam("IA",2156700,25);
        peminjaman[26] = new Pinjam("IA",2224600,26);
        peminjaman[27] = new Pinjam("IA",2224600,27);
        
        peminjaman[28] = new Pinjam("IB",1623500,0);
        peminjaman[29] = new Pinjam("IB",1623500,1);
        peminjaman[30] = new Pinjam("IB",1623500,2);
        peminjaman[31] = new Pinjam("IB",1623400,3);
        peminjaman[32] = new Pinjam("IB",1623400,4);
        peminjaman[33] = new Pinjam("IB",1674500,5);
        peminjaman[34] = new Pinjam("IB",1674500,6);
        peminjaman[35] = new Pinjam("IB",1727300,7);
        peminjaman[36] = new Pinjam("IB",1727300,8);
        peminjaman[37] = new Pinjam("IB",1781700,9);
        peminjaman[38] = new Pinjam("IB",1781700,10);
        peminjaman[39] = new Pinjam("IB",1837800,11);
        peminjaman[40] = new Pinjam("IB",1837800,12);
        peminjaman[41] = new Pinjam("IB",1895700,13);
        peminjaman[42] = new Pinjam("IB",1895700,14);
        peminjaman[43] = new Pinjam("IB",1955400,15);
        peminjaman[44] = new Pinjam("IB",1955400,16);
        peminjaman[45] = new Pinjam("IB",1955400,16);
        peminjaman[46] = new Pinjam("IB",2016900,17);
        peminjaman[47] = new Pinjam("IB",2016900,18);
        peminjaman[48] = new Pinjam("IB",2080500,19);
        peminjaman[49] = new Pinjam("IB",2080500,20);
        peminjaman[50] = new Pinjam("IB",2146000,21);
        peminjaman[51] = new Pinjam("IB",2146000,22);
        peminjaman[52] = new Pinjam("IB",2213600,23);
        peminjaman[53] = new Pinjam("IB",2213600,24);
        peminjaman[54] = new Pinjam("IB",2283300,25);
        peminjaman[55] = new Pinjam("IB",2283300,26);
        peminjaman[56] = new Pinjam("IB",2355200,27);
        
        peminjaman[57] = new Pinjam("IC",1692100,0);
        peminjaman[58] = new Pinjam("IC",1692100,1);
        peminjaman[59] = new Pinjam("IC",1692100,2);
        peminjaman[60] = new Pinjam("IC",1692100,3);
        peminjaman[61] = new Pinjam("IC",1692100,4);
        peminjaman[62] = new Pinjam("IC",1745400,5);
        peminjaman[63] = new Pinjam("IC",1745400,6);
        peminjaman[64] = new Pinjam("IC",1800300,7);
        peminjaman[65] = new Pinjam("IC",1800300,8);
        peminjaman[66] = new Pinjam("IC",1857000,9);
        peminjaman[67] = new Pinjam("IC",1857000,10);
        peminjaman[68] = new Pinjam("IC",1915500,11);
        peminjaman[69] = new Pinjam("IC",1915500,12);
        peminjaman[70] = new Pinjam("IC",1975800,13);
        peminjaman[71] = new Pinjam("IC",1975800,14);
        peminjaman[72] = new Pinjam("IC",2038100,15);
        peminjaman[73] = new Pinjam("IC",2038100,16);
        peminjaman[74] = new Pinjam("IC",2102300,17);
        peminjaman[75] = new Pinjam("IC",2102300,18);
        peminjaman[76] = new Pinjam("IC",2168500,19);
        peminjaman[77] = new Pinjam("IC",2168500,20);
        peminjaman[78] = new Pinjam("IC",2236800,21);
        peminjaman[79] = new Pinjam("IC",2236800,22);
        peminjaman[80] = new Pinjam("IC",2307200,23);
        peminjaman[81] = new Pinjam("IC",2307200,24);
        peminjaman[82] = new Pinjam("IC",2379900,25);
        peminjaman[83] = new Pinjam("IC",2379900,26);
        peminjaman[84] = new Pinjam("IC",2454800,27);
        
        peminjaman[85] = new Pinjam("ID",1763600,0);
        peminjaman[86] = new Pinjam("ID",1763600,1);
        peminjaman[87] = new Pinjam("ID",1763600,2);
        peminjaman[88] = new Pinjam("ID",1763600,3);
        peminjaman[89] = new Pinjam("ID",1763600,4);
        peminjaman[90] = new Pinjam("ID",1819200,5);
        peminjaman[91] = new Pinjam("ID",1819200,6);
        peminjaman[92] = new Pinjam("ID",1876500,7);
        peminjaman[93] = new Pinjam("ID",1876500,8);
        peminjaman[94] = new Pinjam("ID",1935600,9);
        peminjaman[95] = new Pinjam("ID",1935600,10);
        peminjaman[96] = new Pinjam("ID",19996500,11);
        peminjaman[97] = new Pinjam("ID",19996500,12);
        peminjaman[98] = new Pinjam("ID",2059400,13);
        peminjaman[99] = new Pinjam("ID",2059400,14);
        peminjaman[100] = new Pinjam("ID",2124300,15);
        peminjaman[101] = new Pinjam("ID",2124300,16);
        peminjaman[102] = new Pinjam("ID",2191200,17);
        peminjaman[103] = new Pinjam("ID",2191200,18);
        peminjaman[104] = new Pinjam("ID",2260200,19);
        peminjaman[105] = new Pinjam("ID",2260200,20);
        peminjaman[106] = new Pinjam("ID",2331400,21);
        peminjaman[107] = new Pinjam("ID",2331400,22);
        peminjaman[108] = new Pinjam("ID",2404800,23);
        peminjaman[109] = new Pinjam("ID",2404800,24);
        peminjaman[110] = new Pinjam("ID",2480500,25);
        peminjaman[111] = new Pinjam("ID",2480500,26);
        peminjaman[112] = new Pinjam("ID",2558700,27);
        
        peminjaman[113] = new Pinjam("IIA",1926000,0);
        peminjaman[114] = new Pinjam("IIA",1956300,1);
        peminjaman[115] = new Pinjam("IIA",1956300,2);
        peminjaman[116] = new Pinjam("IIA",2017900,3);
        peminjaman[117] = new Pinjam("IIA",2017900,4);
        peminjaman[118] = new Pinjam("IIA",2081500,5);
        peminjaman[119] = new Pinjam("IIA",2081500,6);
        peminjaman[120] = new Pinjam("IIA",2147000,7);
        peminjaman[121] = new Pinjam("IIA",2147000,8);
        peminjaman[122] = new Pinjam("IIA",2214700,9);
        peminjaman[123] = new Pinjam("IIA",2214700,10);
        peminjaman[124] = new Pinjam("IIA",2284400,11);
        peminjaman[125] = new Pinjam("IIA",2284400,12);
        peminjaman[126] = new Pinjam("IIA",2356400,13);
        peminjaman[127] = new Pinjam("IIA",2356400,14);
        peminjaman[128] = new Pinjam("IIA",2430600,15);
        peminjaman[129] = new Pinjam("IIA",2430600,16);
        peminjaman[130] = new Pinjam("IIA",2507100,17);
        peminjaman[131] = new Pinjam("IIA",2507100,18);
        peminjaman[132] = new Pinjam("IIA",2586100,19);
        peminjaman[133] = new Pinjam("IIA",2586100,20);
        peminjaman[134] = new Pinjam("IIA",2667500,21);
        peminjaman[135] = new Pinjam("IIA",2667500,22);
        peminjaman[136] = new Pinjam("IIA",2751600,23);
        peminjaman[137] = new Pinjam("IIA",2751600,24);
        peminjaman[138] = new Pinjam("IIA",2838200,25);
        peminjaman[139] = new Pinjam("IIA",2838200,26);
        peminjaman[140] = new Pinjam("IIA",2927600,27);
        peminjaman[141] = new Pinjam("IIA",2927600,28);
        peminjaman[142] = new Pinjam("IIA",3019800,29);
        peminjaman[143] = new Pinjam("IIA",3019800,30);
        peminjaman[144] = new Pinjam("IIA",3114900,31);
        peminjaman[145] = new Pinjam("IIA",3114900,32);
        peminjaman[146] = new Pinjam("IIA",3213100,33);
        
        peminjaman[147] = new Pinjam("IIB",2103300,0);
        peminjaman[148] = new Pinjam("IIB",2103300,1);
        peminjaman[149] = new Pinjam("IIB",2103300,2);
        peminjaman[150] = new Pinjam("IIB",2103300,3);
        peminjaman[151] = new Pinjam("IIB",2103300,4);
        peminjaman[152] = new Pinjam("IIB",2169500,5);
        peminjaman[153] = new Pinjam("IIB",2169500,6);
        peminjaman[154] = new Pinjam("IIB",2237900,7);
        peminjaman[155] = new Pinjam("IIB",2237900,8);
        peminjaman[156] = new Pinjam("IIB",2308300,9);
        peminjaman[157] = new Pinjam("IIB",2381100,11);
        peminjaman[158] = new Pinjam("IIB",2381100,12);
        peminjaman[159] = new Pinjam("IIB",2456000,13);
        peminjaman[160] = new Pinjam("IIB",2456000,14);
        peminjaman[161] = new Pinjam("IIB",2533400,15);
        peminjaman[162] = new Pinjam("IIB",2533400,16);
        peminjaman[163] = new Pinjam("IIB",2613200,17);
        peminjaman[164] = new Pinjam("IIB",2613200,18);
        peminjaman[165] = new Pinjam("IIB",2695500,19);
        peminjaman[166] = new Pinjam("IIB",2695500,20);
        peminjaman[167] = new Pinjam("IIB",2780400,21);
        peminjaman[168] = new Pinjam("IIB",2780400,22);
        peminjaman[169] = new Pinjam("IIB",2867900,23);
        peminjaman[170] = new Pinjam("IIB",2867900,24);
        peminjaman[171] = new Pinjam("IIB",2985300,25);
        peminjaman[172] = new Pinjam("IIB",2985300,26);
        peminjaman[173] = new Pinjam("IIB",3051400,27);
        peminjaman[174] = new Pinjam("IIB",3051400,28);
        peminjaman[175] = new Pinjam("IIB",3147600,29);
        peminjaman[176] = new Pinjam("IIB",3147600,30);
        peminjaman[177] = new Pinjam("IIB",3246700,31);
        peminjaman[178] = new Pinjam("IIB",3246700,32);
        peminjaman[179] = new Pinjam("IIB",3348900,33);
        
        peminjaman[180] = new Pinjam("IIC",2192300,0);
        peminjaman[181] = new Pinjam("IIC",2192300,1);
        peminjaman[182] = new Pinjam("IIC",2192300,2);
        peminjaman[183] = new Pinjam("IIC",2192300,3);
        peminjaman[184] = new Pinjam("IIC",2192300,4);
        peminjaman[185] = new Pinjam("IIC",2261300,5);
        peminjaman[186] = new Pinjam("IIC",2261300,6);
        peminjaman[187] = new Pinjam("IIC",2332500,7);
        peminjaman[188] = new Pinjam("IIC",2332500,8);
        peminjaman[189] = new Pinjam("IIC",2406000,9);
        peminjaman[190] = new Pinjam("IIC",2406000,10);
        peminjaman[191] = new Pinjam("IIC",2481800,11);
        peminjaman[192] = new Pinjam("IIC",2481800,12);
        peminjaman[193] = new Pinjam("IIC",2559900,13);
        peminjaman[194] = new Pinjam("IIC",2559900,14);
        peminjaman[195] = new Pinjam("IIC",2640600,15);
        peminjaman[196] = new Pinjam("IIC",2640600,16);
        peminjaman[197] = new Pinjam("IIC",2723700,17);
        peminjaman[198] = new Pinjam("IIC",2723700,18);
        peminjaman[199] = new Pinjam("IIC",2809500,19);
        peminjaman[200] = new Pinjam("IIC",2809500,20);
        peminjaman[201] = new Pinjam("IIC",2898000,21);
        peminjaman[202] = new Pinjam("IIC",2898000,22);
        peminjaman[203] = new Pinjam("IIC",2989300,23);
        peminjaman[204] = new Pinjam("IIC",2989300,24);
        peminjaman[205] = new Pinjam("IIC",3083400,25);
        peminjaman[206] = new Pinjam("IIC",3083400,26);
        peminjaman[207] = new Pinjam("IIC",3180500,27);
        peminjaman[208] = new Pinjam("IIC",3180500,28);
        peminjaman[209] = new Pinjam("IIC",3280700,29);
        peminjaman[210] = new Pinjam("IIC",3280700,30);
        peminjaman[211] = new Pinjam("IIC",3384000,31);
        peminjaman[212] = new Pinjam("IIC",3384000,32);
        peminjaman[213] = new Pinjam("IIC",3490600,33);
        
        peminjaman[214] = new Pinjam("IID",2285000,0);
        peminjaman[215] = new Pinjam("IID",2285000,1);
        peminjaman[216] = new Pinjam("IID",2285000,2);
        peminjaman[217] = new Pinjam("IID",2285000,3);
        peminjaman[218] = new Pinjam("IID",2285000,4);
        peminjaman[219] = new Pinjam("IID",2357000,5);
        peminjaman[220] = new Pinjam("IID",2357000,6);
        peminjaman[221] = new Pinjam("IID",2431200,7);
        peminjaman[222] = new Pinjam("IID",2431200,8);
        peminjaman[223] = new Pinjam("IID",2507800,9);
        peminjaman[224] = new Pinjam("IID",2507800,10);
        peminjaman[225] = new Pinjam("IID",2586700,11);
        peminjaman[226] = new Pinjam("IID",2586700,12);
        peminjaman[227] = new Pinjam("IID",2668200,13);
        peminjaman[228] = new Pinjam("IID",2668200,14);
        peminjaman[229] = new Pinjam("IID",2752300,15);
        peminjaman[230] = new Pinjam("IID",2752300,16);
        peminjaman[231] = new Pinjam("IID",2838900,17);
        peminjaman[232] = new Pinjam("IID",2838900,18);
        peminjaman[233] = new Pinjam("IID",2928300,19);
        peminjaman[234] = new Pinjam("IID",2928300,20);
        peminjaman[235] = new Pinjam("IID",3020600,21);
        peminjaman[236] = new Pinjam("IID",3020600,22);
        peminjaman[237] = new Pinjam("IID",3115700,23);
        peminjaman[238] = new Pinjam("IID",3115700,24);
        peminjaman[239] = new Pinjam("IID",3213800,25);
        peminjaman[240] = new Pinjam("IID",3213800,26);
        peminjaman[241] = new Pinjam("IID",3315100,27);
        peminjaman[242] = new Pinjam("IID",3315100,28);
        peminjaman[243] = new Pinjam("IID",3419500,29);
        peminjaman[244] = new Pinjam("IID",3419500,30);
        peminjaman[245] = new Pinjam("IID",3527200,31);
        peminjaman[246] = new Pinjam("IID",3527200,32);
        peminjaman[247] = new Pinjam("IID",3638200,33);
        
        peminjaman[248] = new Pinjam("IIIA",2456700,0);
        peminjaman[249] = new Pinjam("IIIA",2456700,1);
        peminjaman[250] = new Pinjam("IIIA",2534000,2);
        peminjaman[251] = new Pinjam("IIIA",2534000,3);
        peminjaman[252] = new Pinjam("IIIA",2613800,4);
        peminjaman[253] = new Pinjam("IIIA",2613000,5);
        peminjaman[254] = new Pinjam("IIIA",2696200,6);
        peminjaman[255] = new Pinjam("IIIA",2696200,7);
        peminjaman[256] = new Pinjam("IIIA",2781100,8);
        peminjaman[257] = new Pinjam("IIIA",2781100,9);
        peminjaman[258] = new Pinjam("IIIA",2868700,10);
        peminjaman[259] = new Pinjam("IIIA",2868700,11);
        peminjaman[260] = new Pinjam("IIIA",2959000,12);
        peminjaman[261] = new Pinjam("IIIA",2959000,13);
        peminjaman[262] = new Pinjam("IIIA",3052300,14);
        peminjaman[263] = new Pinjam("IIIA",3052300,15);
        peminjaman[264] = new Pinjam("IIIA",3281300,16);
        peminjaman[265] = new Pinjam("IIIA",3281300,17);
        peminjaman[266] = new Pinjam("IIIA",3247500,18);
        peminjaman[267] = new Pinjam("IIIA",3247500,19);
        peminjaman[268] = new Pinjam("IIIA",3346800,20);
        peminjaman[269] = new Pinjam("IIIA",3346800,21);
        peminjaman[270] = new Pinjam("IIIA",3455300,22);
        peminjaman[271] = new Pinjam("IIIA",3455300,23);
        peminjaman[272] = new Pinjam("IIIA",3564100,24);
        peminjaman[273] = new Pinjam("IIIA",3564100,25);
        peminjaman[274] = new Pinjam("IIIA",3676400,26);
        peminjaman[275] = new Pinjam("IIIA",3676400,27);
        peminjaman[276] = new Pinjam("IIIA",3792100,28);
        peminjaman[277] = new Pinjam("IIIA",3792100,29);
        peminjaman[278] = new Pinjam("IIIA",3911600,30);
        peminjaman[279] = new Pinjam("IIIA",3911600,31);
        peminjaman[280] = new Pinjam("IIIA",4034800,32);
        
        peminjaman[281] = new Pinjam("IIIB",2560000,0);
        peminjaman[282] = new Pinjam("IIIB",2560000,1);
        peminjaman[283] = new Pinjam("IIIB",2641200,2);
        peminjaman[284] = new Pinjam("IIIB",2641200,3);
        peminjaman[285] = new Pinjam("IIIB",2724400,4);
        peminjaman[286] = new Pinjam("IIIB",2724400,5);
        peminjaman[287] = new Pinjam("IIIB",2810200,6);
        peminjaman[288] = new Pinjam("IIIB",2810200,7);
        peminjaman[289] = new Pinjam("IIIB",2898700,8);
        peminjaman[290] = new Pinjam("IIIB",2898700,9);
        peminjaman[291] = new Pinjam("IIIB",2990000,10);
        peminjaman[292] = new Pinjam("IIIB",2990000,11);
        peminjaman[293] = new Pinjam("IIIB",3084200,12);
        peminjaman[294] = new Pinjam("IIIB",3084200,13);
        peminjaman[295] = new Pinjam("IIIB",3181300,14);
        peminjaman[296] = new Pinjam("IIIB",3181300,15);
        peminjaman[297] = new Pinjam("IIIB",3281500,16);
        peminjaman[298] = new Pinjam("IIIB",3281500,17);
        peminjaman[299] = new Pinjam("IIIB",3384900,18);
        peminjaman[300] = new Pinjam("IIIB",3384900,19);
        peminjaman[301] = new Pinjam("IIIB",3491500,20);
        peminjaman[302] = new Pinjam("IIIB",3491500,21);
        peminjaman[303] = new Pinjam("IIIB",3601400,22);
        peminjaman[304] = new Pinjam("IIIB",3601400,23);
        peminjaman[305] = new Pinjam("IIIB",3714900,24);
        peminjaman[306] = new Pinjam("IIIB",3714900,25);
        peminjaman[307] = new Pinjam("IIIB",3831900,26);
        peminjaman[308] = new Pinjam("IIIB",3831900,27);
        peminjaman[309] = new Pinjam("IIIB",3952600,28);
        peminjaman[310] = new Pinjam("IIIB",3952600,29);
        peminjaman[311] = new Pinjam("IIIB",4007000,30);
        peminjaman[312] = new Pinjam("IIIB",4007000,31);
        peminjaman[313] = new Pinjam("IIIB",4205400,32);
        
        peminjaman[314] = new Pinjam("IIIC",2668900,0);
        peminjaman[315] = new Pinjam("IIIC",2668900,1);
        peminjaman[316] = new Pinjam("IIIC",2752900,2);
        peminjaman[317] = new Pinjam("IIIC",2752900,3);
        peminjaman[318] = new Pinjam("IIIC",2839700,4);
        peminjaman[319] = new Pinjam("IIIC",2839700,5);
        peminjaman[320] = new Pinjam("IIIC",2929100,6);
        peminjaman[321] = new Pinjam("IIIC",2929100,7);
        peminjaman[322] = new Pinjam("IIIC",3021300,8);
        peminjaman[323] = new Pinjam("IIIC",3021300,9);
        peminjaman[324] = new Pinjam("IIIC",3116500,10);
        peminjaman[325] = new Pinjam("IIIC",3116500,11);
        peminjaman[326] = new Pinjam("IIIC",3214700,12);
        peminjaman[327] = new Pinjam("IIIC",3214700,13);
        peminjaman[328] = new Pinjam("IIIC",3315900,14);
        peminjaman[329] = new Pinjam("IIIC",3315900,15);
        peminjaman[330] = new Pinjam("IIIC",3420300,16);
        peminjaman[331] = new Pinjam("IIIC",3420300,17);
        peminjaman[332] = new Pinjam("IIIC",3528100,18);
        peminjaman[333] = new Pinjam("IIIC",3528100,19);
        peminjaman[334] = new Pinjam("IIIC",3639200,20);
        peminjaman[335] = new Pinjam("IIIC",3639200,21);
        peminjaman[336] = new Pinjam("IIIC",3753800,22);
        peminjaman[337] = new Pinjam("IIIC",3753800,23);
        peminjaman[338] = new Pinjam("IIIC",3872000,24);
        peminjaman[339] = new Pinjam("IIIC",3872000,25);
        peminjaman[340] = new Pinjam("IIIC",3994200,26);
        peminjaman[341] = new Pinjam("IIIC",3994200,27);
        peminjaman[342] = new Pinjam("IIIC",4119700,28);
        peminjaman[343] = new Pinjam("IIIC",4119700,29);
        peminjaman[344] = new Pinjam("IIIC",4249500,30);
        peminjaman[345] = new Pinjam("IIIC",4249500,31);
        peminjaman[346] = new Pinjam("IIIC",4383300,32);
        
        peminjaman[347] = new Pinjam("IIID",2781800,0);
        peminjaman[348] = new Pinjam("IIID",2781800,1);
        peminjaman[349] = new Pinjam("IIID",2869400,2);
        peminjaman[350] = new Pinjam("IIID",2869400,3);
        peminjaman[351] = new Pinjam("IIID",2959800,4);
        peminjaman[352] = new Pinjam("IIID",2959800,5);
        peminjaman[353] = new Pinjam("IIID",3053000,6);
        peminjaman[354] = new Pinjam("IIID",3053000,7);
        peminjaman[355] = new Pinjam("IIID",3149100,8);
        peminjaman[356] = new Pinjam("IIID",3149100,9);
        peminjaman[357] = new Pinjam("IIID",3248300,10);
        peminjaman[358] = new Pinjam("IIID",3248300,11);
        peminjaman[359] = new Pinjam("IIID",3350600,12);
        peminjaman[360] = new Pinjam("IIID",3350600,13);
        peminjaman[361] = new Pinjam("IIID",3456200,14);
        peminjaman[362] = new Pinjam("IIID",3456200,15);
        peminjaman[363] = new Pinjam("IIID",3565000,16);
        peminjaman[364] = new Pinjam("IIID",3565000,17);
        peminjaman[365] = new Pinjam("IIID",3677300,18);
        peminjaman[366] = new Pinjam("IIID",3677300,19);
        peminjaman[367] = new Pinjam("IIID",3912600,20);
        peminjaman[368] = new Pinjam("IIID",3912600,21);
        peminjaman[369] = new Pinjam("IIID",3912600,22);
        peminjaman[370] = new Pinjam("IIID",3912600,23);
        peminjaman[371] = new Pinjam("IIID",4035800,24);
        peminjaman[372] = new Pinjam("IIID",4035800,25);
        peminjaman[373] = new Pinjam("IIID",4162900,26);
        peminjaman[374] = new Pinjam("IIID",4162900,27);
        peminjaman[375] = new Pinjam("IIID",4294000,28);
        peminjaman[376] = new Pinjam("IIID",4294000,29);
        peminjaman[377] = new Pinjam("IIID",4429300,30);
        peminjaman[378] = new Pinjam("IIID",4429300,31);
        peminjaman[379] = new Pinjam("IIID",4568800,32);
        
        peminjaman[380] = new Pinjam("IVA",2899500,0);
        peminjaman[381] = new Pinjam("IVA",2899500,1);
        peminjaman[382] = new Pinjam("IVA",2990800,2);
        peminjaman[383] = new Pinjam("IVA",2990800,3);
        peminjaman[384] = new Pinjam("IVA",3085000,4);
        peminjaman[385] = new Pinjam("IVA",3085000,5);
        peminjaman[386] = new Pinjam("IVA",3182100,6);
        peminjaman[387] = new Pinjam("IVA",3182100,7);
        peminjaman[388] = new Pinjam("IVA",3282400,8);
        peminjaman[389] = new Pinjam("IVA",3282400,9);
        peminjaman[390] = new Pinjam("IVA",3385700,10);
        peminjaman[391] = new Pinjam("IVA",3385700,11);
        peminjaman[392] = new Pinjam("IVA",3492400,12);
        peminjaman[393] = new Pinjam("IVA",3492400,13);
        peminjaman[394] = new Pinjam("IVA",3602400,14);
        peminjaman[395] = new Pinjam("IVA",3602400,15);
        peminjaman[396] = new Pinjam("IVA",3715800,16);
        peminjaman[397] = new Pinjam("IVA",3715800,17);
        peminjaman[398] = new Pinjam("IVA",3832800,18);
        peminjaman[399] = new Pinjam("IVA",3832800,19);
        peminjaman[400] = new Pinjam("IVA",3953600,20);
        peminjaman[401] = new Pinjam("IVA",3953600,21);
        peminjaman[402] = new Pinjam("IVA",4078100,22);
        peminjaman[403] = new Pinjam("IVA",4078100,23);
        peminjaman[404] = new Pinjam("IVA",4206500,24);
        peminjaman[405] = new Pinjam("IVA",4206500,25);
        peminjaman[406] = new Pinjam("IVA",4339000,26);
        peminjaman[407] = new Pinjam("IVA",4339000,27);
        peminjaman[408] = new Pinjam("IVA",4475700,28);
        peminjaman[409] = new Pinjam("IVA",4475700,29);
        peminjaman[410] = new Pinjam("IVA",4616600,30);
        peminjaman[411] = new Pinjam("IVA",4616600,31);
        peminjaman[412] = new Pinjam("IVA",4762000,32);
        peminjaman[413] = new Pinjam("IVB",3022100,0);
        peminjaman[414] = new Pinjam("IVB",3022100,1);
        peminjaman[415] = new Pinjam("IVB",3117300,2);
        peminjaman[416] = new Pinjam("IVB",3117300,3);
        peminjaman[417] = new Pinjam("IVC",3149900,0);
        peminjaman[418] = new Pinjam("IVD",3283200,0);
        
        Scanner in = new Scanner(System.in);
        
        String nip, nama, golongan = null;
        int masaKerja = 0, anak = 0, menu = 0, sanksi_1 = 0, sanksi_2 = 0;
        char menikah, terlambat = 0;
        String UlangDariAwal;
        boolean cek_nip = true;
        boolean aslino = true;
        boolean name = true;
        boolean valid_menu = true;
        double pajak = 0.0125;
        boolean valid_pegawai = true;
        char validp;
        boolean valid_anak = true;
        boolean valid_menikah = true;
        boolean valid_masa_kerja = true;
        int test = 0;
        boolean valid_ulang = true;
        boolean valid_gol = true;
        
        for (UlangDariAwal = "Y"; UlangDariAwal.equalsIgnoreCase("y");) {
            in.reset();
            System.out.println ("                     KOPERASI PEGAWAI ASOY GEBOY                   ");
            System.out.println ("           ███▓▓▓▒▒▒▒░░░░░┌ ╔         ╗ ┐░░░░░▒▒▒▒▓▓▓███");
            System.out.println ("           ███▓▓▓▒▒▒▒░░░░░├ ╣ M E N U ╠ ┤░░░░░▒▒▒▒▓▓▓███");
            System.out.println ("           ███▓▓▓▒▒▒▒░░░░░└ ╚         ╝ ┘░░░░░▒▒▒▒▓▓▓███");
            System.out.println ("||----------------------------------------------------------------||");
            System.out.println ("|| 1. Informasi Peminjaman       || 4. Cetak Data seluruh Pegawai ||");
            System.out.println ("||-------------------------------||------------------------------ ||");
            System.out.println ("|| 2. Entry Data Pegawai         || 5. Data Pegawi                ||");
            System.out.println ("||-------------------------------||------------------------------ ||");
            System.out.println ("|| 3. Kalkulasi Peminjaman       || 6. Keluar Program             ||");
            System.out.println ("||_______________________________||_______________________________||");
            
            do {
            System.out.print ("Harap Masukan Menu yang anda Pilih : ");
                try { menu = in.nextInt();
                    in.nextLine();
                }
                catch (Exception e){
                    System.err.println ("Harap Masukan yang benar");
                    in.nextLine();
                }
               }while (menu <0 || menu >6);
            System.out.println ();
            
            
                        
            
            switch(menu){
                case 1:
                {
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");   
                    System.out.println ("■                     DATA PEMINJAMAN BERDASARKAN GOLONGAN                    ■");
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                    System.out.println ("|Masa Kerja | IA            | IB            | IC             | ID             |");
                    System.out.println ("|0          | Rp. 1486500   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|1          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|2          | Rp. 1533400   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|3          | Rp.           | Rp.  1623400  | Rp. 1692100    | Rp. 1763600    |");
                    System.out.println ("|4          | Rp. 1581700   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|5          | Rp.           | Rp.  1674500  | Rp.  1674500   | Rp. 1819200    |");
                    System.out.println ("|6          | Rp. 1631500   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|7          | Rp.           | Rp.  1727300  | Rp.  1800100   | Rp. 1876500    |");
                    System.out.println ("|8          | Rp. 1682900   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|9          | Rp.           | Rp.  1781700  | Rp.  1857000   | Rp. 1935600    |");
                    System.out.println ("|10         | Rp. 1735900   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|11         | Rp.           | Rp.  1837800  | Rp.  1837800   | Rp. 1996500    |");
                    System.out.println ("|12         | Rp. 1790500   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|13         | Rp.           | Rp.  1895700  | Rp.  1975800   | Rp. 2059400    |");
                    System.out.println ("|14         | Rp. 1846900   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|15         | Rp.           | Rp.  1955400  | Rp.  2018100   | Rp. 2124300    |");
                    System.out.println ("|16         | Rp. 1905100   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|17         | Rp.           | Rp.  2016900  | Rp.  2102300   | Rp. 2191200    |");
                    System.out.println ("|18         | Rp. 1945100   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|19         | Rp.           | Rp.  2080500  | Rp.  2168500   | Rp. 2260200    |");
                    System.out.println ("|20         | Rp. 2027000   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|21         | Rp.           | Rp.  2146000  | Rp.  2236800   | Rp. 2331400    |");
                    System.out.println ("|22         | Rp. 2090800   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|23         | Rp.           | Rp.  2213600  | Rp.  2307200   | Rp. 2404800    |");
                    System.out.println ("|24         | Rp. 2156700   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|25         | Rp.           | Rp.  2283300  | Rp.  2379900   | Rp. 2480500    |");
                    System.out.println ("");
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");   
                    System.out.println ("■                     DATA PEMINJAMAN BERDASARKAN GOLONGAN                    ■");
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                    System.out.println ("|Masa Kerja | IIA           | IIB           | IIC            | IID            |");
                    System.out.println ("|0          | Rp. 1926000   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|1          | Rp. 1956300   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|2          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|3          | Rp. 2017900   | Rp. 2103300   | Rp. 2192300    | Rp. 2285000    |");
                    System.out.println ("|4          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|5          | Rp. 2081500   | Rp.  2169500  | Rp.  2261300   | Rp. 2357000    |");
                    System.out.println ("|6          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|7          | Rp. 2147000   | Rp.  2237900  | Rp.  2332500   | Rp. 2431200    |");
                    System.out.println ("|8          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|9          | Rp. 2214700   | Rp.  2308300  | Rp.  2406000   | Rp. 2507800    |");
                    System.out.println ("|10         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|11         | Rp. 2284400   | Rp.  2381100  | Rp.  2481800   | Rp. 2587700    |");
                    System.out.println ("|12         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|13         | Rp. 2356400   | Rp.  2456000  | Rp.  2559900   | Rp. 2668200    |");
                    System.out.println ("|14         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|15         | Rp. 2430600   | Rp.  2533400  | Rp.  2640600   | Rp. 2752300    |");
                    System.out.println ("|16         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|17         | Rp. 2507100   | Rp.  2613200  | Rp.  2723700   | Rp. 2838900    |");
                    System.out.println ("|18         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|19         | Rp. 2586100   | Rp.  2695500  | Rp.  2809500   | Rp. 2928300    |");
                    System.out.println ("|20         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|21         | Rp. 2667500   | Rp.  2780400  | Rp.  2898000   | Rp. 3020600    |");
                    System.out.println ("|22         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|23         | Rp. 2751600   | Rp.  2867900  | Rp.  2989300   | Rp. 3115700    |");
                    System.out.println ("|24         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|25         | Rp. 2838200   | Rp.  2958300  | Rp.  3083400   | Rp. 3213800    |");
                    System.out.println ("|26         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|27         | Rp. 2927600   | Rp.  3051400  | Rp.  3180500   | Rp. 3315100    |");
                    System.out.println ("|28         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|29         | Rp. 3019800   | Rp.  3147600  | Rp.  3280700   | Rp. 3419500    |");
                    System.out.println ("|30         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|31         | Rp. 3114900   | Rp.  3246700  | Rp.  3384000   | Rp. 3527200    |");
                    System.out.println ("|32         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|33         | Rp. 3213100   | Rp.  3348900  | Rp.  3490600   | Rp. 3638200    |");

                    System.out.println ("");
                    System.out.println ("• Limit Peminjaman disesuaikan dengan golongan");
                    System.out.println ("► Sanksi apabila terlambar membayar bulan pertama : Rp.25000");
                    System.out.println ("► Sanksi apabila terlambar membayar bulan berikutnya : Rp.50000");
                    System.out.println ("► Pajak Penghasilan 15% per Tahun / 1.25% per Bulan");
                    System.out.println ("");
                    System.out.println ("============================== DATA TAHUN 2022 ================================");
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println (" ");
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("Error");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.err.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 2:
                {
                    do {
                    System.out.println ("");
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println ("                      ENTRY DATA PEGAWAI                     ");
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println ("     =========> MASUKAN DATA DENGAN HURUF KAPITAL <==========");
                    System.out.println ("        =========> NIP PEGAWAI JANGAN KELIRU <==========");
                    System.out.println (" ");
                    do {
                    System.out.print ("Masukan Nama                    : ");
                    nama = in.nextLine();
                     if(nama.matches("[a-z A-Z]*")){
                            name = true;
                        }else {
                            name = false;
                            System.err.println("Harap Masukan Data dengan Benar!");
                        }
                    }while (name==false);
                    
                    do {
                    do {
                    System.out.print ("Masukan NIP                     : ");
                    nip = in.nextLine();
                        if(nip.matches("[0-9]*")){
                            aslino = true;
                        }
                        else {
                            aslino = false;
                            System.err.println("Harap Masukan Data dengan Benar!");
                        }
                        }while (aslino ==false);
                    
                            if (nip.length()==10){
                                cek_nip = true;
                            }else {
                                cek_nip = false;
                                System.err.println ("NIP harus 10 digit");
                            }
                    }while (cek_nip == false);
                    
                    do {
                    System.out.print ("Masukan Golongan                : ");   
                    try { golongan = in.next();
                        if ("IA".equals(golongan) || "IB".equals(golongan) || "IC".equals(golongan) || "ID".equals(golongan) || "IIA".equals(golongan)|| "IIB".equals(golongan)|| "IIC".equals(golongan)|| "IID".equals(golongan)|| "IIIA".equals(golongan)|| "IIIB".equals(golongan)|| "IIIC".equals(golongan)|| "IIID".equals(golongan)|| "IVA".equals(golongan)|| "IVB".equals(golongan)|| "IVC".equals(golongan)|| "IVD".equals(golongan)){
                            valid_gol = true;
                        }else {
                            valid_gol = false;
                            System.err.println("Harap masukan golongan yang benar!");
                            in.nextLine();
                        }
                    }
                    catch (Exception e){
                        System.err.println ("Tidak boleh dengan angka");
                    }
                    }while (valid_gol == false);
                    
                    do {
                    System.out.print ("Masukan Tahun Masa Kerja        : ");
                    try {masaKerja = in.nextInt();
                        if (masaKerja >25){
                            System.err.println ("Tidak Ada");
                            in.nextLine();
                            valid_masa_kerja = false;
                        }else{
                            valid_masa_kerja = true;
                        }
                    }
                    catch (Exception e){
                          System.err.println ("Hanya bisa diinput angka!");
                          in.nextLine ();
                    }
                    }while (valid_masa_kerja == false);
                    
                    do {
                    System.out.print ("Status Menikah (Y/N)            : ");
                    menikah = in.next().charAt (0);
                    if(menikah == 'Y' || menikah == 'y' || menikah == 'N' || menikah == 'n'){
                            valid_menikah = true;
                        }else {
                            valid_menikah = false;
                        }
                    } while (valid_menikah == false); 
                    
                    do { 
                    System.out.print ("Jumlah anak                     : ");   
                    try { anak = in.nextInt();
                          in.nextLine ();
                    }
                    catch (Exception e){
                          System.err.println ("Hanya bisa diinput angka!");
                          in.nextLine ();
                    }
                    }while (anak <0);
                    
                    
                    
                    System.out.print ("Apakah data sudah benar? (Y/N)  : ");
                    validp = in.next().charAt (0);
                    in.nextLine ();
                    if(validp == 'Y' || validp == 'y' ){
                            valid_pegawai = true;
                        }else {
                            valid_pegawai = false;
                            System.err.println ("Masukan yang benar");
                        }
                    } while (valid_pegawai == false);

                    Pegawai pegawai = new Pegawai(nip,nama,golongan,masaKerja,menikah,anak);
                    listPegawai.add(pegawai);
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println ("Data sudah Disimpan!");
                    
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("Error");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.out.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 3:
                {
                    System.out.println ("---------------------------------------------------");
                    System.out.print   ("Masukan NIP                     : ");
                    nip = in.nextLine();
                    
                    System.out.print ("Masukan Jumlah Keterlambatan Pembayaran : ");
                    sanksi_1 =in.nextInt();
                    
                    System.out.println ("Alasan tidak membayar: 1.Belum ada Dananya");
                    System.out.println ("                       2.yang lainnya");
                    sanksi_2 = in.nextInt();
                    
                    if (sanksi_2 == 2){
                            if (sanksi_1 >0){
                                System.out.print ("Sudah Mengajukan Surat izin? (Y/N):");
                                terlambat = in.next().charAt (0);
                            }else if (sanksi_1>30){
                                System.out.print ("Maaf Peminjaman tidak bisa diproses karena masalah pembayaran");
                                System.out.print ("Harap Hubungi Admin Dinas");
                            }
                    }
                    Pegawai findP = findPegawai(listPegawai,nip);
                    if(findP != null ){
                        int findGol = searchGolongan(findP.getGolongan(),findP.getMasaKerja(),peminjaman);
                        
                        double pajak_peminjaman = pajakPinjam (pajak,peminjaman[findGol].getnominalPinjam());
                        double sanksi = sanksiTerlambat (sanksi_1,terlambat);
                        
                        double total = peminjaman[findGol].getnominalPinjam() - sanksi - pajak_peminjaman;
                        System.out.println ("");
                        System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                        System.out.println ("               PERHITUNGAN PEMINJAMAN PEGAWAI           ");
                        System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                        System.out.println ("                              "+date.toString());
                        System.out.println ("");
                        System.out.println ("Nominal Peminjaman : Rp"+df.format(peminjaman[findGol].getnominalPinjam()));
                        System.out.println ("");
                        System.out.println ("Sanksi             : Rp" +df.format(sanksi));
                        System.out.println ("Potongan Pajak     : Rp" +df.format(pajak_peminjaman));
                        System.out.println ("");
                        System.out.println ("Dana yang diterima : Rp"+df.format(total));
                        System.out.println ("=========================================================");
                        System.out.println (" ");
                    }else{
                        System.out.println ("Data Pegawai Tidak Ditemukan");
                    }
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("Error");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.out.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 4:{
                    
                    int i = 1;
                    
                    for(Pegawai pegawai : listPegawai){
                        System.out.println ("=========================================================================================");
                        System.out.println ("                                      PERINCIAN PEMINJAMAN        ");
                        System.out.println ("                                             PEGAWAI          ");
                        System.out.println ("                                     -----------------------"      );
                        System.out.println ("");
                        System.out.println (" Yang Bertanda tangan dibawah ini:");
                        System.out.println ("       Nama    : RIVANDA PUTRA PRATAMA SURAHMAN");
                        System.out.println ("       Jabatan : BENDAHARA");
                        System.out.println ("");
                        System.out.println ("       Menerangkan bahwa sdr. "+pegawai.getNip()+ " sebagai Pegawai di Instansi Dinas");
                        System.out.println (" Telah menerima Peminjaman pada tanggal "+date.toString()+". dengan rincian sebagai Berikut:");
                        System.out.println ("");
                        System.out.println("No.: "+i);
                        System.out.println("");
                        System.out.println("NIP      : "+pegawai.getNip());
                        System.out.println("Nama     : "+pegawai.getNama());
                        System.out.println("Golongan : "+pegawai.getGolongan());
                        System.out.println (" ");
                        
                        int findGol = searchGolongan(pegawai.getGolongan(),pegawai.getMasaKerja(), peminjaman);
                        double pajak_peminjaman = pajakPinjam (pajak,peminjaman[findGol].getnominalPinjam());
                        double sanksi = sanksiTerlambat (sanksi_1,terlambat);
                        double total = peminjaman[findGol].getnominalPinjam() - sanksi - pajak_peminjaman;
                        
                        System.out.println ("Nominal Peminjaman                                     : Rp"+df.format(peminjaman[findGol].getnominalPinjam()));
                        System.out.println ("");
                        System.out.println ("Potongan-potongan");
                        System.out.println ("A. Sanksi                                              : Rp" +df.format(sanksi));
                        System.out.println ("B. Potongan Pajak                                      : Rp" +df.format(pajak_peminjaman));
                        System.out.println ("");
                        System.out.println ("=========================================================================================");
                        System.out.println ("Dana yang diterima                                     : Rp"+df.format(total));
                        System.out.println ("=========================================================================================");
                        System.out.println ("");
                        System.out.println ("     Mengetahui karyawan                                  Bendaharawan    ");
                        System.out.println ("     yang bersangkutan                                                    ");
                        System.out.println ("");
                        System.out.println ("");
                        System.out.println ("     "+pegawai.getNama()+"                               Rivanda Putra Pratama Surahman");
                        System.out.println ("    " +pegawai.getNip()+"                                         9285730134");
                        System.out.println (" ");
                        i++;
                    
                    }
                    
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("Error");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.out.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 5:{
                    if(listPegawai.isEmpty()){
                    System.out.println("Belum ada data pegawai");
                    } else {
                     int i = 1;
                     for(Pegawai pegawai : listPegawai){
                        System.out.println("------------------------------------------");
                        System.out.println("No:"+i);
                        System.out.println("NIP            : "+pegawai.getNip());
                        System.out.println("Nama           : "+pegawai.getNama());
                        System.out.println("Golongan       : "+pegawai.getGolongan());
                        System.out.println("Status Menikah : "+pegawai.getMenikah());
                        System.out.println("Anak           : "+pegawai.getAnak());
                        System.out.println("------------------------------------------");
                        i++;
                     }
                      do {
                        System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                        try {UlangDariAwal = in.next();
                        if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                                valid_ulang = true;
                            }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                                System.exit (0);
                                in.nextLine();
                            }else {
                                System.err.println ("Error");
                                valid_ulang = false;
                            }

                        }catch (Exception e){
                            System.out.println ("Hanya Y atau N!");
                            in.nextLine();
                        }
                        } while (valid_ulang == false);
                        in.nextLine();
                 }
                    
                }
                break;
                case 6:{
                    System.exit (0);
                }break;
                default:{
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) :");
                    UlangDariAwal = in.next();
                    in.nextLine();
                }
                break;        
            }
        }
        
    }
    
   
    public static double pajakPinjam (double pajak, double peminjaman){
        double result = 0;
        result = pajak*peminjaman;
        return result;
    }
   
    public static double sanksiTerlambat (int sanksi_1,char terlambat){
        double result =0;
        if (terlambat == 'Y'){
            result = sanksi_1*25000;
        }
        else{
        result = sanksi_1*50000;
        }
        return result;
    }
       
    public static Pegawai findPegawai(ArrayList<Pegawai> listPegawai,String nip){
        Pegawai tempPegawai = new Pegawai();
        
        for(Pegawai pegawai: listPegawai){
            if(pegawai.getNip().equals(nip)){
                tempPegawai = pegawai;
                
            }else{
                tempPegawai = null;
            }
        }
        return tempPegawai;
    
    }
    
    private static int searchGolongan(String str,int mas, Pinjam[] data){
        int i = 0;
        int status = 0;
        int index = -1;
        
        while(i<data.length && status==0){
            if(data[i].getGolongan().equals(str) && data[i].getMasaKerja() == mas){
                status=1;
                index = i;
                
            }else{
                i++;
                
            }
        }
        
        return index;
        
    }
        
     private String getTanggal(){
        DateFormat dateFormat= new SimpleDateFormat ("yyyy/MM/dd");
        Date date = new Date ();
        return dateFormat.format (date);
    }

    private String getWaktu () {
        DateFormat dateFormat = new SimpleDateFormat ("HH:mm:ss");
        Date date = new Date ();
        return dateFormat.format (date);
    }
}