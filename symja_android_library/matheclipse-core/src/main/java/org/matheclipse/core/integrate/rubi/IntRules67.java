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
public class IntRules67 { 
  public static IAST RULES = List( 
IIntegrate(7447,Int(Sin(Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Sqrt(Times(C1D2,Pi)),FresnelS(Times(Sqrt(Times(C2,Power(Pi,-1))),Rt(d,C2),Plus(e,Times(f,x)))),Power(Times(f,Rt(d,C2)),-1)),x),FreeQ(List(d,e,f),x))),
IIntegrate(7448,Int(Cos(Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Sqrt(Times(C1D2,Pi)),FresnelC(Times(Sqrt(Times(C2,Power(Pi,-1))),Rt(d,C2),Plus(e,Times(f,x)))),Power(Times(f,Rt(d,C2)),-1)),x),FreeQ(List(d,e,f),x))),
IIntegrate(7449,Int(Sin(Plus(c_,Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(Sin(c),Int(Cos(Times(d,Sqr(Plus(e,Times(f,x))))),x),x),Dist(Cos(c),Int(Sin(Times(d,Sqr(Plus(e,Times(f,x))))),x),x)),FreeQ(List(c,d,e,f),x))),
IIntegrate(7450,Int(Cos(Plus(c_,Times(d_DEFAULT,Sqr(Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(Cos(c),Int(Cos(Times(d,Sqr(Plus(e,Times(f,x))))),x),x),Negate(Dist(Sin(c),Int(Sin(Times(d,Sqr(Plus(e,Times(f,x))))),x),x))),FreeQ(List(c,d,e,f),x))),
IIntegrate(7451,Int(Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Negate(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x))),And(FreeQ(List(c,d,e,f),x),IGtQ(n,C2)))),
IIntegrate(7452,Int(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Dist(C1D2,Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x)),And(FreeQ(List(c,d,e,f),x),IGtQ(n,C2)))),
IIntegrate(7453,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C1),IGtQ(n,C1)))),
IIntegrate(7454,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C1),IGtQ(n,C1)))),
IIntegrate(7455,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Negate(Dist(Power(f,-1),Subst(Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Power(x,n),-1)))))),p),Power(x,-2)),x),x,Power(Plus(e,Times(f,x)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),ILtQ(n,C0),EqQ(n,CN2)))),
IIntegrate(7456,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Negate(Dist(Power(f,-1),Subst(Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Power(x,n),-1)))))),p),Power(x,-2)),x),x,Power(Plus(e,Times(f,x)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),ILtQ(n,C0),EqQ(n,CN2)))),
IIntegrate(7457,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(n,f),-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),p)),x),x,Power(Plus(e,Times(f,x)),n)),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IntegerQ(Power(n,-1))))),
IIntegrate(7458,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Times(n,f),-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),p)),x),x,Power(Plus(e,Times(f,x)),n)),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IntegerQ(Power(n,-1))))),
IIntegrate(7459,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Dist(Times(k,Power(f,-1)),Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(x,Times(k,n))))))),p)),x),x,Power(Plus(e,Times(f,x)),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),FractionQ(n)))),
IIntegrate(7460,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_DEFAULT),x_Symbol),
    Condition(Module(List(Set(k,Denominator(n))),Dist(Times(k,Power(f,-1)),Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(x,Times(k,n))))))),p)),x),x,Power(Plus(e,Times(f,x)),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),FractionQ(n)))),
IIntegrate(7461,Int(Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Negate(Dist(Times(C1D2,CI),Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x))),FreeQ(List(c,d,e,f,n),x))),
IIntegrate(7462,Int(Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(Plus(e,Times(f,x)),n)))),x),x),Dist(C1D2,Int(Exp(Plus(Times(c,CI),Times(d,CI,Power(Plus(e,Times(f,x)),n)))),x),x)),FreeQ(List(c,d,e,f,n),x))),
IIntegrate(7463,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(p,C1)))),
IIntegrate(7464,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(p,C1)))),
IIntegrate(7465,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),FreeQ(List(a,b,c,d,e,f,n,p),x))),
IIntegrate(7466,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),n_)))))),p_),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(Plus(e,Times(f,x)),n)))))),p),x),FreeQ(List(a,b,c,d,e,f,n,p),x))),
IIntegrate(7467,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(ExpandToSum(u,x),n)))))),p),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),Not(LinearMatchQ(u,x))))),
IIntegrate(7468,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(ExpandToSum(u,x),n)))))),p),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),Not(LinearMatchQ(u,x))))),
IIntegrate(7469,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(u_))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Sin(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(7470,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(u_))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Cos(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
IIntegrate(7471,Int(Times(Power(x_,-1),Sin(Times(d_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Simp(Times(SinIntegral(Times(d,Power(x,n))),Power(n,-1)),x),FreeQ(List(d,n),x))),
IIntegrate(7472,Int(Times(Power(x_,-1),Cos(Times(d_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Simp(Times(CosIntegral(Times(d,Power(x,n))),Power(n,-1)),x),FreeQ(List(d,n),x))),
IIntegrate(7473,Int(Times(Power(x_,-1),Sin(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(Sin(c),Int(Times(Cos(Times(d,Power(x,n))),Power(x,-1)),x),x),Dist(Cos(c),Int(Times(Sin(Times(d,Power(x,n))),Power(x,-1)),x),x)),FreeQ(List(c,d,n),x))),
IIntegrate(7474,Int(Times(Power(x_,-1),Cos(Plus(c_,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(Cos(c),Int(Times(Cos(Times(d,Power(x,n))),Power(x,-1)),x),x),Negate(Dist(Sin(c),Int(Times(Sin(Times(d,Power(x,n))),Power(x,-1)),x),x))),FreeQ(List(c,d,n),x))),
IIntegrate(7475,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),Or(EqQ(p,C1),EqQ(m,Plus(n,Negate(C1))),And(IntegerQ(p),GtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0)))))),
IIntegrate(7476,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),Or(EqQ(p,C1),EqQ(m,Plus(n,Negate(C1))),And(IntegerQ(p),GtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0)))))),
IIntegrate(7477,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(7478,Int(Times(Power(Times(e_,x_),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,Power(x,n)))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(7479,Int(Times(Power(x_,m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Dist(Times(C2,Power(n,-1)),Subst(Int(Sin(Plus(a,Times(b,Sqr(x)))),x),x,Power(x,Times(C1D2,n))),x),And(FreeQ(List(a,b,m,n),x),EqQ(m,Plus(Times(C1D2,n),Negate(C1)))))),
IIntegrate(7480,Int(Times(Power(x_,m_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Dist(Times(C2,Power(n,-1)),Subst(Int(Cos(Plus(a,Times(b,Sqr(x)))),x),x,Power(x,Times(C1D2,n))),x),And(FreeQ(List(a,b,m,n),x),EqQ(m,Plus(Times(C1D2,n),Negate(C1)))))),
IIntegrate(7481,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Cos(Plus(c,Times(d,Power(x,n)))),Power(Times(d,n),-1)),x)),Dist(Times(Power(e,n),Plus(m,Negate(n),C1),Power(Times(d,n),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Cos(Plus(c,Times(d,Power(x,n))))),x),x)),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(n,Plus(m,C1))))),
IIntegrate(7482,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,Plus(n,Negate(C1))),Power(Times(e,x),Plus(m,Negate(n),C1)),Sin(Plus(c,Times(d,Power(x,n)))),Power(Times(d,n),-1)),x),Negate(Dist(Times(Power(e,n),Plus(m,Negate(n),C1),Power(Times(d,n),-1)),Int(Times(Power(Times(e,x),Plus(m,Negate(n))),Sin(Plus(c,Times(d,Power(x,n))))),x),x))),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(n,Plus(m,C1))))),
IIntegrate(7483,Int(Times(Power(Times(e_DEFAULT,x_),m_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Sin(Plus(c,Times(d,Power(x,n)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(d,n,Power(Times(Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Cos(Plus(c,Times(d,Power(x,n))))),x),x))),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(m,CN1)))),
IIntegrate(7484,Int(Times(Power(Times(e_DEFAULT,x_),m_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,x),Plus(m,C1)),Cos(Plus(c,Times(d,Power(x,n)))),Power(Times(e,Plus(m,C1)),-1)),x),Dist(Times(d,n,Power(Times(Power(e,n),Plus(m,C1)),-1)),Int(Times(Power(Times(e,x),Plus(m,n)),Sin(Plus(c,Times(d,Power(x,n))))),x),x)),And(FreeQ(List(c,d,e),x),IGtQ(n,C0),LtQ(m,CN1)))),
IIntegrate(7485,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Power(Times(e,x),m),Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(x,n))))),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Power(Times(e,x),m),Exp(Plus(Times(c,CI),Times(d,CI,Power(x,n))))),x),x))),And(FreeQ(List(c,d,e,m),x),IGtQ(n,C0)))),
IIntegrate(7486,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(Times(CN1,c,CI),Times(CN1,d,CI,Power(x,n))))),x),x),Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Plus(Times(c,CI),Times(d,CI,Power(x,n))))),x),x)),And(FreeQ(List(c,d,e,m),x),IGtQ(n,C0)))),
IIntegrate(7487,Int(Times(Power(x_,m_DEFAULT),Sqr(Sin(Plus(a_DEFAULT,Times(C1D2,b_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(x,m),x),x),Negate(Dist(C1D2,Int(Times(Power(x,m),Cos(Plus(Times(C2,a),Times(b,Power(x,n))))),x),x))),FreeQ(List(a,b,m,n),x))),
IIntegrate(7488,Int(Times(Power(x_,m_DEFAULT),Sqr(Cos(Plus(a_DEFAULT,Times(C1D2,b_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(x,m),x),x),Dist(C1D2,Int(Times(Power(x,m),Cos(Plus(Times(C2,a),Times(b,Power(x,n))))),x),x)),FreeQ(List(a,b,m,n),x))),
IIntegrate(7489,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,n,p,Power(Plus(m,C1),-1)),Int(Times(Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Cos(Plus(a,Times(b,Power(x,n))))),x),x))),And(FreeQ(List(a,b),x),IGtQ(p,C1),EqQ(Plus(m,n),C0),NeQ(n,C1),IntegerQ(n)))),
IIntegrate(7490,Int(Times(Power(x_,m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Dist(Times(b,n,p,Power(Plus(m,C1),-1)),Int(Times(Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Sin(Plus(a,Times(b,Power(x,n))))),x),x)),And(FreeQ(List(a,b),x),IGtQ(p,C1),EqQ(Plus(m,n),C0),NeQ(n,C1),IntegerQ(n)))),
IIntegrate(7491,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(n,Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Simp(Times(Power(x,n),Cos(Plus(a,Times(b,Power(x,n)))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x))),And(FreeQ(List(a,b,m,n),x),EqQ(Plus(m,Times(CN1,C2,n),C1),C0),GtQ(p,C1)))),
IIntegrate(7492,Int(Times(Power(x_,m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(n,Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Simp(Times(Power(x,n),Sin(Plus(a,Times(b,Power(x,n)))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x)),And(FreeQ(List(a,b,m,n),x),EqQ(Plus(m,Times(CN1,C2,n),C1),C0),GtQ(p,C1)))),
IIntegrate(7493,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(m,Negate(n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Sin(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Cos(Plus(a,Times(b,Power(x,n)))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x))),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),IGtQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(7494,Int(Times(Power(x_,m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(m,Negate(n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),x),Dist(Times(Plus(p,Negate(C1)),Power(p,-1)),Int(Times(Power(x,m),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Sqr(p)),-1)),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Cos(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Simp(Times(Power(x,Plus(m,Negate(n),C1)),Sin(Plus(a,Times(b,Power(x,n)))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,p),-1)),x)),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),IGtQ(m,Plus(Times(C2,n),Negate(C1)))))),
IIntegrate(7495,Int(Times(Power(x_,m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Dist(Times(Sqr(b),Sqr(n),p,Plus(p,Negate(C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(b),Sqr(n),Sqr(p),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Sin(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Negate(Simp(Times(b,n,p,Power(x,Plus(m,n,C1)),Cos(Plus(a,Times(b,Power(x,n)))),Power(Sin(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),x))),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),ILtQ(m,Plus(Times(CN2,n),C1)),NeQ(Plus(m,n,C1),C0)))),
IIntegrate(7496,Int(Times(Power(x_,m_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),-1)),x),Dist(Times(Sqr(b),Sqr(n),p,Plus(p,Negate(C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(b),Sqr(n),Sqr(p),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Cos(Plus(a,Times(b,Power(x,n)))),p)),x),x)),Simp(Times(b,n,p,Power(x,Plus(m,n,C1)),Sin(Plus(a,Times(b,Power(x,n)))),Power(Cos(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),-1)),x)),And(FreeQ(List(a,b),x),GtQ(p,C1),IGtQ(n,C0),ILtQ(m,Plus(Times(CN2,n),C1)),NeQ(Plus(m,n,C1),C0))))
  );
}
