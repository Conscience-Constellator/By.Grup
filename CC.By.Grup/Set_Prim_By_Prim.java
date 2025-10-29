package CC.Util.By.Grup;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;

public interface Set_Prim_By_Prim<By_Typ,Valu_Typ,From_Typ> extends
		Get_Prim_By_Prim<By_Typ,Valu_Typ>,
		Set_Prim_By_Bool<Valu_Typ,From_Typ>,
		Set_Prim_By_ChR<Valu_Typ,From_Typ>,
		Set_Prim_By_Flot<Valu_Typ,From_Typ>,
		Set_Prim_By_Dubl<Valu_Typ,From_Typ>,
		Set_Prim_By_Byt<Valu_Typ,From_Typ>,
		Set_Prim_By_Short<Valu_Typ,From_Typ>,
		Set_Prim_By_Int<Valu_Typ,From_Typ>,
		Set_Prim_By_Long<Valu_Typ,From_Typ>,
		Set_Prim_By_Point<By_Typ,Valu_Typ,From_Typ>
{
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Bool(boolean By,boolean Valu){Set_Long_By_Long((By)?1:0,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_ChR(char By,boolean Valu){Set_Long_By_Long(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Flot(float By,boolean Valu){Set_Long_By_Dubl(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Dubl(double By,boolean Valu){Set_Long_By_Dubl(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Byt(byte By,boolean Valu){Set_Long_By_Long(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Short(short By,boolean Valu){Set_Long_By_Long(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Int(int By,boolean Valu){Set_Long_By_Long(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_Bool_By_Long(long By,boolean Valu){Set_Long_By_Long(By,(Valu)?1:0);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Bool(boolean By,char Valu){Set_Long_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_ChR(char By,char Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Flot(float By,char Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Dubl(double By,char Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Byt(byte By,char Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Short(short By,char Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Int(int By,char Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_ChR_By_Long(long By,char Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Bool(boolean By,float Valu){Set_Dubl_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_ChR(char By,float Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Flot(float By,float Valu){Set_Dubl_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Dubl(double By,float Valu){Set_Dubl_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Byt(byte By,float Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Short(short By,float Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Int(int By,float Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Flot_By_Long(long By,float Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Dubl_By_Bool(boolean By,double Valu){Set_Dubl_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Dubl_By_ChR(char By,double Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Dubl_By_Flot(float By,double Valu){Set_Dubl_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Dubl_By_Byt(byte By,double Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Dubl_By_Short(short By,double Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Dubl_By_Int(int By,double Valu){Set_Dubl_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Bool(boolean By,byte Valu){Set_Long_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_ChR(char By,byte Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Flot(float By,byte Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Dubl(double By,byte Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Byt(byte By,byte Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Short(short By,byte Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Int(int By,byte Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Byt_By_Long(long By,byte Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Bool(boolean By,short Valu){Set_Long_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_ChR(char By,short Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Flot(float By,short Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Dubl(double By,short Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Byt(byte By,short Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Short(short By,short Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Int(int By,short Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Short_By_Long(long By,short Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Bool(boolean By,int Valu){Set_Long_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_ChR(char By,int Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Flot(float By,int Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Dubl(double By,int Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Byt(byte By,int Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Short(short By,int Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Int(int By,int Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Int_By_Long(long By,int Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Long_By_Bool(boolean By,long Valu){Set_Long_By_Long((By)?1:0,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Long_By_ChR(char By,long Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Long_By_Flot(float By,long Valu){Set_Long_By_Dubl(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Long_By_Byt(byte By,long Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Long_By_Short(short By,long Valu){Set_Long_By_Long(By,Valu);}
	@Override @Nevr_Neds_Ovrid default void Set_Long_By_Int(int By,long Valu){Set_Long_By_Long(By,Valu);}
}