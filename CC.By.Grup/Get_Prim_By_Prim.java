package CC.Util.By.Grup;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.Pref.Pref_Set_Q_By_Q;
import CC.$.Q$Q_Grup.Prim$Prim;
import static CC.Math.Math_Plus.Ad;

public interface Get_Prim_By_Prim<By_Typ,Valu_Typ> extends
		Get_Prim_By_Bool<Valu_Typ>,
		Get_Prim_By_ChR<Valu_Typ>,
		Get_Prim_By_Flot<Valu_Typ>,
		Get_Prim_By_Dubl<Valu_Typ>,
		Get_Prim_By_Byt<Valu_Typ>,
		Get_Prim_By_Short<Valu_Typ>,
		Get_Prim_By_Int<Valu_Typ>,
		Get_Prim_By_Long<Valu_Typ>,
		Get_Prim_By_Point<By_Typ,Valu_Typ>,
		Prim$Prim<By_Typ,Valu_Typ>
{
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Bool(boolean By){return Get_Long_By_Long((By)?1:0)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_ChR(char By){return Get_Long_By_Long(By)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Flot(float By){return Get_Long_By_Dubl(By)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Dubl(double By){return Get_Long_By_Dubl(By)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Byt(byte By){return Get_Long_By_Long(By)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Short(short By){return Get_Long_By_Long(By)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Int(int By){return Get_Long_By_Long(By)!=0;}
	@Override @Nevr_Neds_Ovrid default boolean Get_Bool_By_Long(long By){return Get_Long_By_Long(By)!=0;}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Bool(boolean By){return (char)Get_Long_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_ChR(char By){return (char)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Flot(float By){return (char)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Dubl(double By){return (char)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Byt(byte By){return (char)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Short(short By){return (char)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Int(int By){return (char)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default char Get_ChR_By_Long(long By){return (char)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Bool(boolean By){return (float)Get_Dubl_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_ChR(char By){return (float)Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Flot(float By){return (float)Get_Dubl_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Dubl(double By){return (float)Get_Dubl_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Byt(byte By){return (float)Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Short(short By){return (float)Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Int(int By){return (float)Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default float Get_Flot_By_Long(long By){return (float)Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default double Get_Dubl_By_Bool(boolean By){return Get_Dubl_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default double Get_Dubl_By_ChR(char By){return Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default double Get_Dubl_By_Flot(float By){return Get_Dubl_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default double Get_Dubl_By_Byt(byte By){return Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default double Get_Dubl_By_Short(short By){return Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default double Get_Dubl_By_Int(int By){return Get_Dubl_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Bool(boolean By){return (byte)Get_Long_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_ChR(char By){return (byte)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Flot(float By){return (byte)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Dubl(double By){return (byte)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Byt(byte By){return (byte)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Short(short By){return (byte)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Int(int By){return (byte)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default byte Get_Byt_By_Long(long By){return (byte)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Bool(boolean By){return (short)Get_Long_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_ChR(char By){return (short)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Flot(float By){return (short)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Dubl(double By){return (short)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Byt(byte By){return (short)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Short(short By){return (short)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Int(int By){return (short)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default short Get_Short_By_Long(long By){return (short)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Bool(boolean By){return (int)Get_Long_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_ChR(char By){return (int)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Flot(float By){return (int)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Dubl(double By){return (int)Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Byt(byte By){return (int)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Short(short By){return (int)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Int(int By){return (int)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default int Get_Int_By_Long(long By){return (int)Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default long Get_Long_By_Bool(boolean By){return Get_Long_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default long Get_Long_By_ChR(char By){return Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default long Get_Long_By_Flot(float By){return Get_Long_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default long Get_Long_By_Byt(byte By){return Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default long Get_Long_By_Short(short By){return Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default long Get_Long_By_Int(int By){return Get_Long_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default Valu_Typ Get_Point_By_Bool(boolean By){return Get_Point_By_Long((By)?1:0);}
	@Override @Nevr_Neds_Ovrid default Valu_Typ Get_Point_By_ChR(char By){return Get_Point_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default Valu_Typ Get_Point_By_Flot(float By){return Get_Point_By_Dubl(By);}
	@Override @Nevr_Neds_Ovrid default Valu_Typ Get_Point_By_Byt(byte By){return Get_Point_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default Valu_Typ Get_Point_By_Short(short By){return Get_Point_By_Long(By);}
	@Override @Nevr_Neds_Ovrid default Valu_Typ Get_Point_By_Int(int By){return Get_Point_By_Long(By);}

	static void P(Get_Prim_By_Prim A,Get_Prim_By_Prim B,Pref_Set_Q_By_Q To)
	{To.Set_Pref2$1_By_Pref_SOrc(Ad,A,B);}
	@Override
	@Nevr_Neds_Ovrid
	default void Tran_AB(Get_Prim_By_Prim From,Pref_Set_Q_By_Q To)
	{P(From,this,To);}
}