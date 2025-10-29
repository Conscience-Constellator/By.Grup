package CC.Util.By.Grup;

import CC.Util.By.Get.*;

public interface Get_Prim_By_Point<By_Typ,Valu_Typ> extends
		Get_Bool_By_Point<By_Typ>,
		Get_ChR_By_Point<By_Typ>,
		Get_Flot_By_Point<By_Typ>,
		Get_Dubl_By_Point<By_Typ>,
		Get_Byt_By_Point<By_Typ>,
		Get_Short_By_Point<By_Typ>,
		Get_Int_By_Point<By_Typ>,
		Get_Long_By_Point<By_Typ>,
		Get_Point_By_Point<By_Typ,Valu_Typ>
{}