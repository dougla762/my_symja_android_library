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
public class IntRules66 { 
  public static IAST RULES = List( 
IIntegrate(7397,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_,Complex(C0,$p("fz")))))),x_Symbol),
    Condition(Simp(Times(CoshIntegral(Plus(Times(c,f,$s("fz"),Power(d,-1)),Times(f,$s("fz"),x))),Power(d,-1)),x),And(FreeQ(List(c,d,e,f,$s("fz")),x),EqQ(Plus(Times(d,Plus(e,Times(CN1,C1D2,Pi))),Times(CN1,c,f,$s("fz"),CI)),C0)))),
IIntegrate(7398,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CosIntegral(Plus(e,Times(CN1,C1D2,Pi),Times(f,x))),Power(d,-1)),x),And(FreeQ(List(c,d,e,f),x),EqQ(Plus(Times(d,Plus(e,Times(CN1,C1D2,Pi))),Times(CN1,c,f)),C0)))),
IIntegrate(7399,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Cos(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Sin(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),-1)),x),x),Dist(Sin(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Cos(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),-1)),x),x)),And(FreeQ(List(c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(7400,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(Times(C1D2,Pi),e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Dist(Times(C2,Power(d,-1)),Subst(Int(Cos(Times(f,Sqr(x),Power(d,-1))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(7401,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Dist(Times(C2,Power(d,-1)),Subst(Int(Sin(Times(f,Sqr(x),Power(d,-1))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(7402,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Cos(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Sin(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1D2)),x),x),Dist(Sin(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1))),Int(Times(Cos(Plus(Times(c,f,Power(d,-1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1D2)),x),x)),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(7403,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x))))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x))))),x),x))),And(FreeQ(List(c,d,e,f,m),x),IntegerQ(Times(C2,k))))),
IIntegrate(7404,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Exp(Times(CI,Plus(e,Times(f,x)))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Plus(e,Times(f,x))))),x),x))),FreeQ(List(c,d,e,f,m),x))),
IIntegrate(7405,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr($($s("§sin"),Plus(e_DEFAULT,Times(C1D2,f_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(Plus(c,Times(d,x)),m),x),x),Negate(Dist(C1D2,Int(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(Times(C2,e),Times(f,x)))),x),x))),FreeQ(List(c,d,e,f,m),x))),
IIntegrate(7406,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),-1)),x),Dist(Times(Sqr(b),Plus(n,Negate(C1)),Power(n,-1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x),Negate(Simp(Times(b,Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,n),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1)))),
IIntegrate(7407,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),-1)),x),Dist(Times(Sqr(b),Plus(n,Negate(C1)),Power(n,-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(f),Sqr(n)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),x),x)),Negate(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,n),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),GtQ(m,C1)))),
IIntegrate(7408,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(e,Times(f,x))),n),x),x),And(FreeQ(List(c,d,e,f,m),x),IGtQ(n,C1),Or(Not(RationalQ(m)),And(GeQ(m,CN1),LtQ(m,C1)))))),
IIntegrate(7409,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Sin(Plus(e,Times(f,x))),n),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(f,n,Power(Times(d,Plus(m,C1)),-1)),Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),Plus(m,C1)),Times(Cos(Plus(e,Times(f,x))),Power(Sin(Plus(e,Times(f,x))),Plus(n,Negate(C1)))),x),x),x))),And(FreeQ(List(c,d,e,f,m),x),IGtQ(n,C1),GeQ(m,CN2),LtQ(m,CN1)))),
IIntegrate(7410,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(Sqr(b),Sqr(f),n,Plus(n,Negate(C1)),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C2)))),x),x),Negate(Dist(Times(Sqr(f),Sqr(n),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),x),x)),Negate(Simp(Times(b,f,n,Power(Plus(c,Times(d,x)),Plus(m,C2)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),LtQ(m,CN2)))),
IIntegrate(7411,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),-1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),-1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Simp(Times(d,Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(7412,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),-1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Dist(Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),-1)),x))),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),NeQ(n,CN2),GtQ(m,C1)))),
IIntegrate(7413,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C0),Or(EqQ(n,C1),IGtQ(m,C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))))),
IIntegrate(7414,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(C2,a),n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(Times(C1D2,C1,Plus(e,Times(Pi,a,Power(Times(C2,b),-1)))),Times(C1D2,f,x))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(n),Or(GtQ(n,C0),IGtQ(m,C0))))),
IIntegrate(7415,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(C2,a),IntPart(n)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),FracPart(n)),Power(Power(Sin(Plus(Times(C1D2,e),Times(a,Pi,Power(Times(C4,b),-1)),Times(C1D2,f,x))),Times(C2,FracPart(n))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(Times(C1D2,e),Times(a,Pi,Power(Times(C4,b),-1)),Times(C1D2,f,x))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Plus(n,C1D2)),Or(GtQ(n,C0),IGtQ(m,C0))))),
IIntegrate(7416,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_,Complex(C0,$p("fz"))))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Times(Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),Plus(b,Times(C2,a,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),-1)),Times(CN1,b,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Exp(Times(C2,CI,k,Pi)),-1)))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("fz")),x),IntegerQ(Times(C2,k)),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(7417,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),Exp(Times(CI,Plus(e,Times(f,x)))),Power(Plus(b,Times(C2,a,Exp(Times(CI,Pi,Plus(k,Negate(C1D2)))),Exp(Times(CI,Plus(e,Times(f,x))))),Times(CN1,b,Exp(Times(C2,CI,k,Pi)),Exp(Times(C2,CI,Plus(e,Times(f,x)))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IntegerQ(Times(C2,k)),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(7418,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_,Complex(C0,$p("fz"))))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Plus(Times(CN1,CI,b),Times(C2,a,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Times(CI,b,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("fz")),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(7419,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Plus(e,Times(f,x)))),Power(Plus(Times(CI,b),Times(C2,a,Exp(Times(CI,Plus(e,Times(f,x))))),Times(CN1,CI,b,Exp(Times(C2,CI,Plus(e,Times(f,x)))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(7420,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-2)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(f,Plus(Sqr(a),Negate(Sqr(b))),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1)),x),Dist(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),x),x),Negate(Dist(Times(b,d,m,Power(Times(f,Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(m,C0)))),
IIntegrate(7421,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),x)),Dist(Times(a,Power(Plus(Sqr(a),Negate(Sqr(b))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x),Negate(Dist(Times(b,Plus(n,C2),Power(Times(Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),Dist(Times(b,d,m,Power(Times(f,Plus(n,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(n,CN2),IGtQ(m,C0)))),
IIntegrate(7422,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),n)),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
IIntegrate(7423,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sin(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Sin(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(7424,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Cos(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Cos(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(a,b,m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(7425,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d,n),x),IGtQ(p,C0)))),
IIntegrate(7426,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d,n),x),IGtQ(p,C0)))),
IIntegrate(7427,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Power(x,n),-1)),x),x)),Negate(Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d),x),ILtQ(p,CN1),IGtQ(n,C2)))),
IIntegrate(7428,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Power(x,n),-1)),x),x)),Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d),x),ILtQ(p,CN1),IGtQ(n,C2)))),
IIntegrate(7429,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1))))),
IIntegrate(7430,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1))))),
IIntegrate(7431,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,p)),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Sin(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(7432,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,p)),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Cos(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(7433,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(x,n))),p),Sin(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,n,p),x))),
IIntegrate(7434,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Power(x,n))),p),Cos(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,n,p),x))),
IIntegrate(7435,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IGtQ(p,C0)))),
IIntegrate(7436,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),IGtQ(p,C0)))),
IIntegrate(7437,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(d,Power(e,m),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,m,n),x),ILtQ(p,CN1),EqQ(m,Plus(n,Negate(C1))),Or(IntegerQ(n),GtQ(e,C0))))),
IIntegrate(7438,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(e,m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Dist(Times(d,Power(e,m),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),ILtQ(p,CN1),EqQ(m,Plus(n,Negate(C1))),Or(IntegerQ(n),GtQ(e,C0))))),
IIntegrate(7439,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,CN1),IGtQ(n,C0),Or(GtQ(Plus(m,Negate(n),C1),C0),GtQ(n,C2)),RationalQ(m)))),
IIntegrate(7440,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x))),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Cos(Plus(c,Times(d,x)))),x),x)),Dist(Times(d,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Sin(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,CN1),IGtQ(n,C0),Or(GtQ(Plus(m,Negate(n),C1),C0),GtQ(n,C2)),RationalQ(m)))),
IIntegrate(7441,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Sin(Plus(c,Times(d,x))),Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1)),IntegerQ(m)))),
IIntegrate(7442,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(ExpandIntegrand(Cos(Plus(c,Times(d,x))),Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),IGtQ(n,C0),Or(EqQ(n,C2),EqQ(p,CN1)),IntegerQ(m)))),
IIntegrate(7443,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Sin(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(7444,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(b,Times(a,Power(Power(x,n),-1))),p),Cos(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d,m),x),ILtQ(p,C0),ILtQ(n,C0)))),
IIntegrate(7445,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Sin(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Sin(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
IIntegrate(7446,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Cos(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Power(x,n))),p),Cos(Plus(c,Times(d,x)))),x),FreeQ(List(a,b,c,d,e,m,n,p),x)))
  );
}
