package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules123 { 
  public static IAST RULES = List( 
IIntegrate(10247,Int(Times(Exp(Times(n_,ArcTanh(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(c,Times(C1D2,n)),Int(Times(Power(x,m),Power(Plus(c,Times(d,Sqr(x))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(a,x)),n)),x),x),And(FreeQ(List(a,c,d,m,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(Or(IntegerQ(p),GtQ(c,C0))),IGtQ(Times(C1D2,n),C0)))),
IIntegrate(10248,Int(Times(Exp(Times(n_,ArcTanh(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Times(C1D2,n)),-1),Int(Times(Power(x,m),Power(Plus(c,Times(d,Sqr(x))),Plus(p,Times(C1D2,n))),Power(Power(Plus(C1,Times(CN1,a,x)),n),-1)),x),x),And(FreeQ(List(a,c,d,m,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(Or(IntegerQ(p),GtQ(c,C0))),ILtQ(Times(C1D2,n),C0)))),
IIntegrate(10249,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(p)),Power(Plus(c,Times(d,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),FracPart(p)),-1)),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Exp(Times(n,ArcTanh(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,m,n,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(Or(IntegerQ(p),GtQ(c,C0))),Not(IntegerQ(Times(C1D2,n)))))),
IIntegrate(10250,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_)))),u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(c,p),Int(Times(u,Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,n)))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Or(IntegerQ(p),GtQ(c,C0))))),
IIntegrate(10251,Int(Times(Exp(Times(n_,ArcTanh(Times(a_DEFAULT,x_)))),u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(p)),Power(Plus(c,Times(d,Sqr(x))),FracPart(p)),Power(Times(Power(Plus(C1,Times(CN1,a,x)),FracPart(p)),Power(Plus(C1,Times(a,x)),FracPart(p))),-1)),Int(Times(u,Power(Plus(C1,Times(CN1,a,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,n)))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(Or(IntegerQ(p),GtQ(c,C0))),IntegerQ(Times(C1D2,n))))),
IIntegrate(10252,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_)))),u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(p)),Power(Plus(c,Times(d,Sqr(x))),FracPart(p)),Power(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),FracPart(p)),-1)),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Exp(Times(n,ArcTanh(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(Or(IntegerQ(p),GtQ(c,C0))),Not(IntegerQ(Times(C1D2,n)))))),
IIntegrate(10253,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,p),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Exp(Times(n,ArcTanh(Times(a,x)))),Power(Power(x,Times(C2,p)),-1)),x),x),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),IntegerQ(p)))),
IIntegrate(10254,Int(Times(Exp(Times(n_,ArcTanh(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_)),x_Symbol),
    Condition(Dist(Power(c,p),Int(Times(u,Power(Plus(C1,Negate(Power(Times(a,x),-1))),p),Power(Plus(C1,Power(Times(a,x),-1)),p),Exp(Times(n,ArcTanh(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(p)),IntegerQ(Times(C1D2,n)),GtQ(c,C0)))),
IIntegrate(10255,Int(Times(Exp(Times(n_,ArcTanh(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(C2,p)),Power(Plus(c,Times(d,Power(x,-2))),p),Power(Times(Power(Plus(C1,Times(CN1,a,x)),p),Power(Plus(C1,Times(a,x)),p)),-1)),Int(Times(u,Power(Plus(C1,Times(CN1,a,x)),p),Power(Plus(C1,Times(a,x)),p),Exp(Times(n,ArcTanh(Times(a,x)))),Power(Power(x,Times(C2,p)),-1)),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(p)),IntegerQ(Times(C1D2,n)),Not(GtQ(c,C0))))),
IIntegrate(10256,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(C2,p)),Power(Plus(c,Times(d,Power(x,-2))),p),Power(Power(Plus(C1,Times(c,Sqr(x),Power(d,-1))),p),-1)),Int(Times(u,Power(Plus(C1,Times(c,Sqr(x),Power(d,-1))),p),Exp(Times(n,ArcTanh(Times(a,x)))),Power(Power(x,Times(C2,p)),-1)),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(p)),Not(IntegerQ(Times(C1D2,n)))))),
IIntegrate(10257,Int(Exp(Times(n_DEFAULT,ArcTanh(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(C1,Times(CN1,a,c),Times(CN1,b,c,x)),Times(C1D2,n)),-1)),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(10258,Int(Times(Exp(Times(n_,ArcTanh(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(x_,m_)),x_Symbol),
    Condition(Dist(Times(C4,Power(Times(n,Power(b,Plus(m,C1)),Power(c,Plus(m,C1))),-1)),Subst(Int(Times(Power(x,Times(C2,Power(n,-1))),Power(Plus(CN1,Times(CN1,a,c),Times(Plus(C1,Times(CN1,a,c)),Power(x,Times(C2,Power(n,-1))))),m),Power(Power(Plus(C1,Power(x,Times(C2,Power(n,-1)))),Plus(m,C2)),-1)),x),x,Times(Power(Plus(C1,Times(c,Plus(a,Times(b,x)))),Times(C1D2,n)),Power(Power(Plus(C1,Times(CN1,c,Plus(a,Times(b,x)))),Times(C1D2,n)),-1))),x),And(FreeQ(List(a,b,c),x),ILtQ(m,C0),LtQ(CN1,n,C1)))),
IIntegrate(10259,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(C1,Times(CN1,a,c),Times(CN1,b,c,x)),Times(C1D2,n)),-1)),x),FreeQ(List(a,b,c,d,e,m,n),x))),
IIntegrate(10260,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Plus(a_,Times(b_DEFAULT,x_))))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),p),Int(Times(u,Power(Plus(C1,Negate(a),Times(CN1,b,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,a,Times(b,x)),Plus(p,Times(C1D2,n)))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),EqQ(Plus(Times(b,d),Times(CN1,C2,a,e)),C0),EqQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))),C0),Or(IntegerQ(p),GtQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),C0))))),
IIntegrate(10261,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Plus(a_,Times(b_DEFAULT,x_))))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,x),Times(e,Sqr(x))),p),Power(Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),-1)),Int(Times(u,Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),Exp(Times(n,ArcTanh(Times(a,x))))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),EqQ(Plus(Times(b,d),Times(CN1,C2,a,e)),C0),EqQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))),C0),Not(Or(IntegerQ(p),GtQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),C0)))))),
IIntegrate(10262,Int(Times(Exp(Times(n_DEFAULT,ArcTanh(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),-1))))),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Exp(Times(n,ArcCoth(Plus(Times(a,Power(c,-1)),Times(b,x,Power(c,-1))))))),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(10263,Int(Times(Exp(Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT),x_Symbol),
    Condition(Dist(Power(CN1,Times(C1D2,n)),Int(Times(u,Exp(Times(n,ArcTanh(Times(a,x))))),x),x),And(FreeQ(a,x),IntegerQ(Times(C1D2,n))))),
IIntegrate(10264,Int(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,Plus(n,C1))),Power(Times(Sqr(x),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,Plus(n,Negate(C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))))),-1)),x),x,Power(x,-1))),And(FreeQ(a,x),IntegerQ(Times(C1D2,Plus(n,Negate(C1))))))),
IIntegrate(10265,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,Plus(n,C1))),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,Plus(n,Negate(C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))))),-1)),x),x,Power(x,-1))),And(FreeQ(a,x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),IntegerQ(m)))),
IIntegrate(10266,Int(Exp(Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Sqr(x),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,n),x),Not(IntegerQ(n))))),
IIntegrate(10267,Int(Times(Exp(Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
IIntegrate(10268,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(x,m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,Plus(n,C1))),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,Plus(n,Negate(C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,m),x),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),Not(IntegerQ(m))))),
IIntegrate(10269,Int(Times(Exp(Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(x,m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,m,n),x),Not(IntegerQ(n)),Not(IntegerQ(m))))),
IIntegrate(10270,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Plus(C1,Times(a,x)),Power(Plus(c,Times(d,x)),p),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(a,Plus(p,C1)),-1)),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Times(a,c),d),C0),EqQ(p,Times(C1D2,n)),Not(IntegerQ(Times(C1D2,n)))))),
IIntegrate(10271,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,p),Int(Times(u,Power(x,p),Power(Plus(C1,Times(c,Power(Times(d,x),-1))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),Sqr(c)),Negate(Sqr(d))),C0),Not(IntegerQ(Times(C1D2,n))),IntegerQ(p)))),
IIntegrate(10272,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,x)),p),Power(Times(Power(x,p),Power(Plus(C1,Times(c,Power(Times(d,x),-1))),p)),-1)),Int(Times(u,Power(x,p),Power(Plus(C1,Times(c,Power(Times(d,x),-1))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Times(Sqr(a),Sqr(c)),Negate(Sqr(d))),C0),Not(IntegerQ(Times(C1D2,n))),Not(IntegerQ(p))))),
IIntegrate(10273,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(c,n),Subst(Int(Times(Power(Plus(c,Times(d,x)),Plus(p,Negate(n))),Power(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))),Times(C1D2,n)),Power(x,-2)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,p),x),EqQ(Plus(c,Times(a,d)),C0),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),Or(IntegerQ(p),EqQ(p,Times(C1D2,n)),EqQ(p,Plus(Times(C1D2,n),C1))),IntegerQ(Times(C2,p))))),
IIntegrate(10274,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(c,n),Subst(Int(Times(Power(Plus(c,Times(d,x)),Plus(p,Negate(n))),Power(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))),Times(C1D2,n)),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,p),x),EqQ(Plus(c,Times(a,d)),C0),IntegerQ(Times(C1D2,Plus(n,Negate(C1)))),IntegerQ(m),Or(IntegerQ(p),EqQ(p,Times(C1D2,n)),EqQ(p,Plus(Times(C1D2,n),C1)),LtQ(CN5,m,CN1)),IntegerQ(Times(C2,p))))),
IIntegrate(10275,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Sqr(x),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0))))),
IIntegrate(10276,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0)),IntegerQ(m)))),
IIntegrate(10277,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(c,p),Power(x,m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,m,n,p),x),EqQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0)),Not(IntegerQ(m))))),
IIntegrate(10278,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,Power(x,-1))),p),Power(Power(Plus(C1,Times(d,Power(Times(c,x),-1))),p),-1)),Int(Times(u,Power(Plus(C1,Times(d,Power(Times(c,x),-1))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))),C0),Not(IntegerQ(Times(C1D2,n))),Not(Or(IntegerQ(p),GtQ(c,C0)))))),
IIntegrate(10279,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Simp(Times(Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(a,c,n),-1)),x),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n)))))),
IIntegrate(10280,Int(Times(Exp(Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Simp(Times(Plus(n,Times(CN1,a,x)),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(a,c,Plus(Sqr(n),Negate(C1)),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(n))))),
IIntegrate(10281,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(n,Times(C2,a,Plus(p,C1),x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(a,c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),x),Negate(Dist(Times(C2,Plus(p,C1),Plus(Times(C2,p),C3),Power(Times(c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x))))),x),x))),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),LtQ(p,CN1),NeQ(p,QQ(-3L,2L)),NeQ(Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1)))),C0),Or(IntegerQ(p),Not(IntegerQ(n)))))),
IIntegrate(10282,Int(Times(Exp(Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),x_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Negate(Simp(Times(Plus(C1,Times(CN1,a,n,x)),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(n),Negate(C1)),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),x)),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(n))))),
IIntegrate(10283,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),x_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(C2,Plus(p,C1)),Times(a,n,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),x),Negate(Dist(Times(n,Plus(Times(C2,p),C3),Power(Times(a,c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x))))),x),x))),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),LeQ(p,CN1),NeQ(p,QQ(-3L,2L)),NeQ(Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1)))),C0),Or(IntegerQ(p),Not(IntegerQ(n)))))),
IIntegrate(10284,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Sqr(x_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Simp(Times(Plus(n,Times(C2,Plus(p,C1),a,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(Power(a,3),c,Sqr(n),Plus(Sqr(n),Negate(C1))),-1)),x)),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),EqQ(Plus(Sqr(n),Times(C2,Plus(p,C1))),C0),NeQ(Sqr(n),C1)))),
IIntegrate(10285,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Sqr(x_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(n,Times(C2,Plus(p,C1),a,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x)))),Power(Times(Power(a,3),c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),x),Negate(Dist(Times(Plus(Sqr(n),Times(C2,Plus(p,C1))),Power(Times(Sqr(a),c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Exp(Times(n,ArcCoth(Times(a,x))))),x),x))),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),LeQ(p,CN1),NeQ(Plus(Sqr(n),Times(C2,Plus(p,C1))),C0),NeQ(Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1)))),C0),Or(IntegerQ(p),Not(IntegerQ(n)))))),
IIntegrate(10286,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Negate(c),p),Power(Power(a,Plus(m,C1)),-1)),Subst(Int(Times(Exp(Times(n,x)),Power(Coth(x),Plus(m,Times(C2,Plus(p,C1)))),Power(Power(Cosh(x),Times(C2,Plus(p,C1))),-1)),x),x,ArcCoth(Times(a,x))),x)),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),IntegerQ(m),LeQ(C3,m,Times(CN2,Plus(p,C1))),IntegerQ(p)))),
IIntegrate(10287,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,p),Int(Times(u,Power(x,Times(C2,p)),Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),IntegerQ(p)))),
IIntegrate(10288,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,Sqr(x))),p),Power(Times(Power(x,Times(C2,p)),Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p)),-1)),Int(Times(u,Power(x,Times(C2,p)),Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(Times(Sqr(a),c),d),C0),Not(IntegerQ(Times(C1D2,n))),Not(IntegerQ(p))))),
IIntegrate(10289,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(c,p),Power(Power(a,Times(C2,p)),-1)),Int(Times(u,Power(Plus(CN1,Times(a,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,n))),Power(Power(x,Times(C2,p)),-1)),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0)),IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n)))))),
IIntegrate(10290,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(CN1,x,Power(a,-1))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(x,Power(a,-1))),Plus(p,Times(C1D2,n))),Power(x,-2)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0)),Not(IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n))))))),
IIntegrate(10291,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(CN1,x,Power(a,-1))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(x,Power(a,-1))),Plus(p,Times(C1D2,n))),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0)),Not(IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n)))),IntegerQ(m)))),
IIntegrate(10292,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(c,p),Power(x,m),Power(Power(x,-1),m)),Subst(Int(Times(Power(Plus(C1,Times(CN1,x,Power(a,-1))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(x,Power(a,-1))),Plus(p,Times(C1D2,n))),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1)),x)),And(FreeQ(List(a,c,d,m,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(Times(C1D2,n))),Or(IntegerQ(p),GtQ(c,C0)),Not(IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n)))),Not(IntegerQ(m))))),
IIntegrate(10293,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(p)),Power(Plus(c,Times(d,Power(x,-2))),FracPart(p)),Power(Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),FracPart(p)),-1)),Int(Times(u,Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,c,d,n,p),x),EqQ(Plus(c,Times(Sqr(a),d)),C0),Not(IntegerQ(Times(C1D2,n))),Not(Or(IntegerQ(p),GtQ(c,C0)))))),
IIntegrate(10294,Int(Times(Exp(Times(n_,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),u_DEFAULT),x_Symbol),
    Condition(Dist(Power(CN1,Times(C1D2,n)),Int(Times(u,Exp(Times(n,ArcTanh(Times(c,Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,n))))),
IIntegrate(10295,Int(Exp(Times(n_DEFAULT,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Plus(a,Times(b,x))),Times(C1D2,n)),Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),-1)),Times(C1D2,n)),Power(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1)),Int(Times(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(CN1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1)),x),x),And(FreeQ(List(a,b,c,n),x),Not(IntegerQ(Times(C1D2,n)))))),
IIntegrate(10296,Int(Times(Exp(Times(n_,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(x_,m_)),x_Symbol),
    Condition(Dist(Times(CN4,Power(Times(n,Power(b,Plus(m,C1)),Power(c,Plus(m,C1))),-1)),Subst(Int(Times(Power(x,Times(C2,Power(n,-1))),Power(Plus(C1,Times(a,c),Times(Plus(C1,Times(CN1,a,c)),Power(x,Times(C2,Power(n,-1))))),m),Power(Power(Plus(CN1,Power(x,Times(C2,Power(n,-1)))),Plus(m,C2)),-1)),x),x,Times(Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),-1)),Times(C1D2,n)),Power(Power(Plus(C1,Negate(Power(Times(c,Plus(a,Times(b,x))),-1))),Times(C1D2,n)),-1))),x),And(FreeQ(List(a,b,c),x),ILtQ(m,C0),LtQ(CN1,n,C1))))
  );
}
