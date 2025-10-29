package CC.Util.By.Grup;

import CC.Util.By.Set.*;

public interface Set_Prim_By_Point<By_Typ,Valu_Typ,From_Typ> extends
		Set_Bool_By_Point<By_Typ,From_Typ>,
		Set_ChR_By_Point<By_Typ,From_Typ>,
		Set_Flot_By_Point<By_Typ,From_Typ>,
		Set_Dubl_By_Point<By_Typ,From_Typ>,
		Set_Byt_By_Point<By_Typ,From_Typ>,
		Set_Short_By_Point<By_Typ,From_Typ>,
		Set_Int_By_Point<By_Typ,From_Typ>,
		Set_Long_By_Point<By_Typ,From_Typ>,
		Set_Point_By_Point<By_Typ,Valu_Typ,From_Typ>
{}