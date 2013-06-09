package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions3 { 
  public static IAST RULES = List( 
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Sec(z_),C2))),
    Condition(Times(v,Power(Tan(z),C2)),SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Csc(z_),C2))),
    Condition(Times(v,Power(Cot(z),C2)),SameQ(u,Times(CN1,v)))),
SetDelayed(SimpAux(Power(Plus(Times($p(a,true),Cos(v_)),Times($p(b,true),Sin(v_))),n_)),
    Condition(SimpAux(Power(Plus(Times(Cos(v),Power(a,CN1)),Times(Sin(v),Power(b,CN1))),Times(CN1,n))),And(And(IntIntegerQ(n),Less(n,C0)),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(SimpSum(Times($p(u,true),Power(Cosh(z_),C2)),Times($p(v,true),Power(Sinh(z_),C2))),
    Condition(u,SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(Times($p(u,true),Power(Sech(z_),C2)),Times($p(v,true),Power(Tanh(z_),C2))),
    Condition(u,SameQ(u,v))),
SetDelayed(SimpSum(Times($p(u,true),Power(Coth(z_),C2)),Times($p(v,true),Power(Csch(z_),C2))),
    Condition(u,SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Sinh(z_),C2))),
    Condition(Times(u,Power(Cosh(z),C2)),SameQ(u,v))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Cosh(z_),C2))),
    Condition(Times(v,Power(Sinh(z),C2)),SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Tanh(z_),C2))),
    Condition(Times(u,Power(Sech(z),C2)),SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Coth(z_),C2))),
    Condition(Times(v,Power(Csch(z),C2)),SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Sech(z_),C2))),
    Condition(Times(u,Power(Tanh(z),C2)),SameQ(u,Times(CN1,v)))),
SetDelayed(SimpSum(u_,Times($p(v,true),Power(Csch(z_),C2))),
    Condition(Times(u,Power(Coth(z),C2)),SameQ(u,v))),
SetDelayed(SimpAux(Power(Plus(Times($p(a,true),Cosh(v_)),Times($p(b,true),Sinh(v_))),n_)),
    Condition(SimpAux(Power(Plus(Times(Cosh(v),Power(a,CN1)),Times(CN1,Times(Sinh(v),Power(b,CN1)))),Times(CN1,n))),And(And(IntIntegerQ(n),Less(n,C0)),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(SimpSum(Times($p(u,true),Power($(f_,a_),$p(n,true))),Times($p(v,true),Power($(f_,a_),$p(n,true)))),
    Condition(SimpAux(Times(Simp(Simplify(Plus(u,v))),Power($(f,a),n))),MemberQ(List($s("Erf"),$s("Erfc"),$s("Erfi"),$s("FresnelS"),$s("FresnelC"),$s("ExpIntegralEi"),$s("SinIntegral"),$s("CosIntegral"),$s("SinhIntegral"),$s("CoshIntegral"),$s("LogIntegral")),f))),
SetDelayed(SimpSum(Times($p(u,true),Power($(f_,a_,b_),$p(n,true))),Times($p(v,true),Power($(f_,a_,b_),$p(n,true)))),
    Condition(SimpAux(Times(Simp(Simplify(Plus(u,v))),Power($(f,a,b),n))),MemberQ(List($s("Int"),$s("Gamma"),$s("PolyLog"),$s("EllipticF"),$s("EllipticE")),f))),
SetDelayed(ExpandIntegrandQ(m_,n_,p_),
    And(And(And(IntIntegerQ(p),Greater(p,C0)),NonzeroQ(Plus(Plus(m,Times(CN1,n)),C1))),If(ZeroQ(Plus(n,Times(CN1,C1))),Or(Or(Not(IntIntegerQ(m)),And(Less(m,C0),Not(LessEqual(LessEqual(Plus(Plus(m,p),C2),C0),Plus(Plus(m,Times(C2,p)),C2))))),LessEqual(p,Plus(m,C2))),Or(Or(Equal(p,C2),Not(IntIntegerQ(Times(Plus(m,C1),Power(n,CN1))))),And(Not(And(Less(C0,Times(Plus(m,C1),Power(n,CN1))),LessEqual(Times(Plus(m,C1),Power(n,CN1)),C3))),Not(LessEqual(Times(Plus(m,C1),Power(n,CN1)),Times(CN1,Plus(p,C1))))))))),
SetDelayed(ExpnExpand(u_,$p(x,SymbolHead)),
    ExpnExpandAux(ExpandExpression(u,x),x)),
SetDelayed(ExpnExpandAux(Plus(Plus($p(u,true),Times($p(e,true),Power(x_,CN1))),Times($p(f,true),Power(Plus(c_,Times($p(d,true),x_)),CN1))),$p(x,SymbolHead)),
    Condition(Plus(ExpnExpandAux(u,x),Times(c,Times(e,Power(Times(x,Plus(c,Times(d,x))),CN1)))),And(FreeQ(List(c,d,e,f),x),ZeroQ(Plus(Times(d,e),f))))),
SetDelayed(ExpnExpandAux(Plus(Plus($p(u,true),Times($p(e,true),Power(Plus(a_,Times($p(b,true),x_)),CN1))),Times($p(f,true),Power(Plus(c_,Times($p(d,true),x_)),CN1))),$p(x,SymbolHead)),
    Condition(Plus(ExpnExpandAux(u,x),Times(Plus(Times(c,e),Times(a,f)),Power(Plus(Times(a,c),Times(Times(b,d),Power(x,C2))),CN1))),And(And(FreeQ(List(a,b,c,d,e,f),x),ZeroQ(Plus(Times(d,e),Times(b,f)))),ZeroQ(Plus(Times(b,c),Times(a,d)))))),
SetDelayed(ExpnExpandAux(u_,$p(x,SymbolHead)),
    u),
SetDelayed(ExpandExpression(Times($p(u,true),Power(Plus(Times($p(a,true),Power(x_,$p(p,true))),Times($p(b,true),Power(x_,$p(q,true)))),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(Times(u,Power(x,Times(n,p))),Power(Plus(a,Times(b,Power(x,Plus(q,Times(CN1,p))))),n)),x),And(And(FreeQ(List(a,b),x),IntIntegerQ(List(n,p,q))),GreaterEqual(Plus(q,Times(CN1,p)),C0)))),
SetDelayed(ExpandExpression(Times($p(u,true),Power(Plus(Plus($p(a,true),Times($p(d,true),Power(c_,m_))),Times($p(b,true),v_)),p_)),$p(x,SymbolHead)),
    Condition(Module(List($s("tmp")),ReplaceAll(ExpandExpression(Times(u,Power(Plus(Plus(a,Times(d,$s("tmp"))),Times(b,v)),p)),x),List(Rule($s("tmp"),Power(c,m))))),And(And(And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(p)),Less(p,C0)),FractionQ(m)),Not(FreeQ(v,x))))),
SetDelayed(ExpandExpression(Times($p(u,true),Power(Plus($p(a,true),Times(Times($p(b,true),Power(c_,m_)),v_)),p_)),$p(x,SymbolHead)),
    Condition(Module(List($s("tmp")),ReplaceAll(ExpandExpression(Times(u,Power(Plus(a,Times(Times(b,$s("tmp")),v)),p)),x),List(Rule($s("tmp"),Power(c,m))))),And(And(And(And(FreeQ(List(a,b,c),x),IntIntegerQ(p)),Less(p,C0)),FractionQ(m)),Not(FreeQ(v,x))))),
SetDelayed(ExpandExpression(Times(Power(Plus($p(c,true),Times($p(d,true),Power(x_,$p(m,true)))),$p(q,true)),Power(Plus(a_,Times($p(b,true),Power(x_,n_))),p_)),$p(x,SymbolHead)),
    Condition(Module(List($s("aa"),$s("bb")),RegularizeTerm(ReplaceAll(Apart(Times(Power(Plus(c,Times(d,Power(x,m))),q),Power(Plus($s("aa"),Times($s("bb"),Power(x,n))),p)),x),List(Rule($s("aa"),a),Rule($s("bb"),b))),x)),And(And(And(And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(List(m,n,p,q))),Less(p,C0)),Greater(n,C1)),Or(GreaterEqual(m,n),Less(m,C0))),Greater(q,C0)))),
SetDelayed(ExpandExpression(Times(Power(x_,m_),Times(Plus(a_,Times($p(b,true),Power(x_,$p(n,true)))),Power(Plus(c_,Times($p(d,true),Power(x_,$p(n,true)))),CN1))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,Times(Power(x,m),Power(c,CN1))),Dist(Times(Plus(Times(b,c),Times(CN1,Times(a,d))),Power(c,CN1)),ExpandExpression(Times(Power(x,Plus(m,n)),Power(Plus(c,Times(d,Power(x,n))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(List(m,n))),Greater(n,C0)),Less(m,C0)))),
SetDelayed(ExpandExpression(Times($p(u,true),Power(Plus(Plus(a_,Times($p(b,true),Power(x_,$p(k,true)))),Times($p(c,true),Power(x_,j_))),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(u,Times(Power(Plus(Times(b,C1D2),Times(c,Power(x,k))),Times(C2,n)),Power(Power(c,n),CN1))),x),And(And(And(And(FreeQ(List(a,b,c,j,k),x),IntIntegerQ(List(n,k,j))),Equal(j,Times(C2,k))),Less(n,C0)),ZeroQ(Plus(Power(b,C2),Times(CN1,Times(Times(C4,a),c))))))),
SetDelayed(ExpandExpression(Power(u_,n_),$p(x,SymbolHead)),
    Condition(Power(Plus(Plus(Coefficient(u,x,C0),Times(Coefficient(u,x,C1),x)),Times(Coefficient(u,x,C2),Power(x,C2))),n),And(And(And(And(RationalQ(n),Less(n,C0)),IntPolynomialQ(u,x)),Equal(Exponent(u,x),C2)),Not(MatchQ(u,Condition(Plus(Plus($p(a,true),Times($p(b,true),x)),Times($p(c,true),Power(x,C2))),FreeQ(List(a,b,c),x))))))),
SetDelayed(ExpandExpression(Times(u_,Power(Plus(a_,Times($p(b,true),Power(x_,C4))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Plus(Times(Plus(Coefficient(u,x,C0),Times(Coefficient(u,x,C2),Power(x,C2))),Power(Plus(a,Times(b,Power(x,C4))),CN1)),Times(Coefficient(u,x,C1),Times(x,Power(Plus(a,Times(b,Power(x,C4))),CN1)))),Times(Coefficient(u,x,C3),Times(Power(x,C3),Power(Plus(a,Times(b,Power(x,C4))),CN1)))),And(And(FreeQ(List(a,b),x),IntPolynomialQ(u,x)),Less(Exponent(u,x),C4)))),
SetDelayed(ExpandExpression(Times(Power(Plus($p(a,true),Times($p(b,true),x_)),$p(m,true)),Power(Plus(c_,Times($p(d,true),x_)),n_)),$p(x,SymbolHead)),
    Condition(Map(Function(RegularizeSubst(Slot1,x,Plus(a,Times(b,x)))),Apart(Times(Power(x,m),Power(Plus(Plus(c,Times(CN1,Times(a,Times(d,Power(b,CN1))))),Times(Times(d,Power(b,CN1)),x)),n)),x)),And(And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(List(m,n))),Greater(m,C0)),Less(n,C0)))),
SetDelayed(ExpandExpression(Times(Times(Power(x_,$p(m,true)),Power(Plus($p(a,true),Times($p(b,true),x_)),n_)),Power(Plus(c_,Times($p(d,true),x_)),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(Power(x,m),Power(Plus(Plus(Times(a,c),Times(Plus(Times(b,c),Times(a,d)),x)),Times(Times(b,d),Power(x,C2))),n)),x),And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(List(m,n))),Less(n,C0)))),
SetDelayed(ExpandExpression(Power(Sin(v_),n_),$p(x,SymbolHead)),
    Condition(Expand(TrigReduce(Power(Sin(v),n)),x),And(IntIntegerQ(n),Greater(n,C1)))),
SetDelayed(ExpandExpression(Power(Cos(v_),n_),$p(x,SymbolHead)),
    Condition(Expand(TrigReduce(Power(Cos(v),n)),x),And(IntIntegerQ(n),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Power(Sin(v_),n_),Power(Plus($p(c,true),Times($p(d,true),Power(Cos(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Times(CN1,Power(Sin(v),Plus(n,Times(CN1,C2)))),Power(d,CN1)),Dist(Times(Plus(c,d),Power(d,CN1)),ExpandExpression(Times(Power(Sin(v),Plus(n,Times(CN1,C2))),Power(Plus(c,Times(d,Power(Cos(v),C2))),CN1)),x))),And(And(FreeQ(List(c,d),x),EvenQ(n)),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Power(Cos(v_),n_),Power(Plus($p(c,true),Times($p(d,true),Power(Sin(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Times(CN1,Power(Cos(v),Plus(n,Times(CN1,C2)))),Power(d,CN1)),Dist(Times(Plus(c,d),Power(d,CN1)),ExpandExpression(Times(Power(Cos(v),Plus(n,Times(CN1,C2))),Power(Plus(c,Times(d,Power(Sin(v),C2))),CN1)),x))),And(And(FreeQ(List(c,d),x),EvenQ(n)),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Plus(a_,Times($p(b,true),Power(Sin(v_),C2))),Power(Plus($p(c,true),Times($p(d,true),Power(Cos(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Times(CN1,b),Power(d,CN1)),Times(Plus(Times(b,c),Times(Plus(a,b),d)),Power(Times(d,Plus(c,Times(d,Power(Cos(v),C2)))),CN1))),FreeQ(List(a,b,c,d),x))),
SetDelayed(ExpandExpression(Times(Plus(a_,Times($p(b,true),Power(Cos(v_),C2))),Power(Plus($p(c,true),Times($p(d,true),Power(Sin(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Times(CN1,b),Power(d,CN1)),Times(Plus(Times(b,c),Times(Plus(a,b),d)),Power(Times(d,Plus(c,Times(d,Power(Sin(v),C2)))),CN1))),FreeQ(List(a,b,c,d),x))),
SetDelayed(ExpandExpression(Times(Power(Tan(v_),$p(n,true)),Power(Plus(Times($p(a,true),Power(Sin(v_),$p(n,true))),Times($p(b,true),Power(Cos(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Sec(v),n),Power(a,CN1)),Times(CN1,Times(b,Power(Times(a,Plus(Times(a,Power(Sin(v),n)),Times(b,Power(Cos(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(Power(Cot(v_),$p(n,true)),Power(Plus(Times($p(a,true),Power(Sin(v_),$p(n,true))),Times($p(b,true),Power(Cos(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Csc(v),n),Power(b,CN1)),Times(CN1,Times(a,Power(Times(b,Plus(Times(a,Power(Sin(v),n)),Times(b,Power(Cos(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(Power(Sec(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Cot(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Sec(v),n),Power(a,CN1)),Times(CN1,Times(b,Power(Times(a,Plus(Times(a,Power(Sin(v),n)),Times(b,Power(Cos(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(Power(Csc(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Tan(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Csc(v),n),Power(a,CN1)),Times(CN1,Times(b,Power(Times(a,Plus(Times(b,Power(Sin(v),n)),Times(a,Power(Cos(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(u_,Power(Plus(a_,Times($p(b,true),Tan(v_))),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(u,Power(Plus(Times(Power(Cos(v),C2),Power(a,CN1)),Times(Cos(v),Times(Sin(v),Power(b,CN1)))),Times(CN1,n))),x),And(And(And(FreeQ(List(a,b),x),IntIntegerQ(n)),Less(n,C0)),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(ExpandExpression(Times(u_,Power(Plus(a_,Times($p(b,true),Cot(v_))),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(u,Power(Plus(Times(Power(Sin(v),C2),Power(a,CN1)),Times(Cos(v),Times(Sin(v),Power(b,CN1)))),Times(CN1,n))),x),And(And(And(FreeQ(List(a,b),x),IntIntegerQ(n)),Less(n,C0)),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(ExpandExpression(Times(Times(v_,Cos(u_)),Sin(u_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(v,Times(Sin(Dist(C2,u)),C1D2)),x),Or(MatchQ(v,Condition(Power(x,m_),RationalQ(m))),MatchQ(v,Condition(Power(f_,w_),And(FreeQ(f,x),LinearQ(w,x))))))),
SetDelayed(ExpandExpression(Power(Sinh(v_),n_),$p(x,SymbolHead)),
    Condition(Module(List(z),Expand(NormalForm(Subst(TrigReduce(Power(Sinh(z),n)),z,v),x),x)),And(IntIntegerQ(n),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Power(x_,$p(m,true)),Power(Sinh(v_),$p(n,true))),$p(x,SymbolHead)),
    Condition(Module(List(z),Expand(Times(Power(x,m),NormalForm(Subst(TrigReduce(Power(Sinh(z),n)),z,v),x)),x)),And(And(FreeQ(m,x),IntIntegerQ(n)),Greater(n,C0)))),
SetDelayed(ExpandExpression(Power(Cosh(v_),n_),$p(x,SymbolHead)),
    Condition(Module(List(z),Expand(NormalForm(Subst(TrigReduce(Power(Cosh(z),n)),z,v),x),x)),And(IntIntegerQ(n),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Power(x_,$p(m,true)),Power(Cosh(v_),$p(n,true))),$p(x,SymbolHead)),
    Condition(Module(List(z),Expand(Times(Power(x,m),NormalForm(Subst(TrigReduce(Power(Cosh(z),n)),z,v),x)),x)),And(And(FreeQ(m,x),IntIntegerQ(n)),Greater(n,C0)))),
SetDelayed(ExpandExpression(Times(Power(Sinh(v_),n_),Power(Plus($p(c,true),Times($p(d,true),Power(Cosh(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Sinh(v),Plus(n,Times(CN1,C2))),Power(d,CN1)),Times(CN1,Dist(Times(Plus(c,d),Power(d,CN1)),ExpandExpression(Times(Power(Sinh(v),Plus(n,Times(CN1,C2))),Power(Plus(c,Times(d,Power(Cosh(v),C2))),CN1)),x)))),And(And(FreeQ(List(c,d),x),EvenQ(n)),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Power(Cosh(v_),n_),Power(Plus($p(c,true),Times($p(d,true),Power(Sinh(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Cosh(v),Plus(n,Times(CN1,C2))),Power(d,CN1)),Times(CN1,Dist(Times(Plus(c,Times(CN1,d)),Power(d,CN1)),ExpandExpression(Times(Power(Cosh(v),Plus(n,Times(CN1,C2))),Power(Plus(c,Times(d,Power(Sinh(v),C2))),CN1)),x)))),And(And(FreeQ(List(c,d),x),EvenQ(n)),Greater(n,C1)))),
SetDelayed(ExpandExpression(Times(Plus(a_,Times($p(b,true),Power(Sinh(v_),C2))),Power(Plus($p(c,true),Times($p(d,true),Power(Cosh(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Power(d,CN1)),Times(CN1,Times(Plus(Times(b,c),Times(CN1,Times(Plus(a,Times(CN1,b)),d))),Power(Times(d,Plus(c,Times(d,Power(Cosh(v),C2)))),CN1)))),FreeQ(List(a,b,c,d),x))),
SetDelayed(ExpandExpression(Times(Plus(a_,Times($p(b,true),Power(Cosh(v_),C2))),Power(Plus($p(c,true),Times($p(d,true),Power(Sinh(v_),C2))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Power(d,CN1)),Times(CN1,Times(Plus(Times(b,c),Times(CN1,Times(Plus(a,b),d))),Power(Times(d,Plus(c,Times(d,Power(Sinh(v),C2)))),CN1)))),FreeQ(List(a,b,c,d),x))),
SetDelayed(ExpandExpression(Times(Power(Tanh(v_),$p(n,true)),Power(Plus(Times($p(a,true),Power(Sinh(v_),$p(n,true))),Times($p(b,true),Power(Cosh(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Sech(v),n),Power(a,CN1)),Times(CN1,Times(b,Power(Times(a,Plus(Times(a,Power(Sinh(v),n)),Times(b,Power(Cosh(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(Power(Coth(v_),$p(n,true)),Power(Plus(Times($p(a,true),Power(Sinh(v_),$p(n,true))),Times($p(b,true),Power(Cosh(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Csch(v),n),Power(b,CN1)),Times(CN1,Times(a,Power(Times(b,Plus(Times(a,Power(Sinh(v),n)),Times(b,Power(Cosh(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(Power(Sech(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Coth(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Sech(v),n),Power(a,CN1)),Times(CN1,Times(b,Power(Times(a,Plus(Times(a,Power(Sinh(v),n)),Times(b,Power(Cosh(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(Power(Csch(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Tanh(v_),$p(n,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Csch(v),n),Power(a,CN1)),Times(CN1,Times(b,Power(Times(a,Plus(Times(b,Power(Sinh(v),n)),Times(a,Power(Cosh(v),n)))),CN1)))),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),
SetDelayed(ExpandExpression(Times(u_,Power(Plus(a_,Times($p(b,true),Tanh(v_))),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(u,Power(Plus(Times(Power(Cosh(v),C2),Power(a,CN1)),Times(CN1,Times(Cosh(v),Times(Sinh(v),Power(b,CN1))))),Times(CN1,n))),x),And(And(And(FreeQ(List(a,b),x),IntIntegerQ(n)),Less(n,C0)),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(ExpandExpression(Times(u_,Power(Plus(a_,Times($p(b,true),Coth(v_))),n_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(u,Power(Plus(Times(Times(CN1,Power(Sinh(v),C2)),Power(a,CN1)),Times(Cosh(v),Times(Sinh(v),Power(b,CN1)))),Times(CN1,n))),x),And(And(And(FreeQ(List(a,b),x),IntIntegerQ(n)),Less(n,C0)),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(ExpandExpression(Times(Times(v_,Cosh(u_)),Sinh(u_)),$p(x,SymbolHead)),
    Condition(ExpandExpression(Times(v,Times(Sinh(Dist(C2,u)),C1D2)),x),Or(MatchQ(v,Condition(Power(x,m_),RationalQ(m))),MatchQ(v,Condition(Power(f_,w_),And(FreeQ(f,x),LinearQ(w,x))))))),
SetDelayed(ExpandExpression(Times($p(u,true),Power(v_,n_)),$p(x,SymbolHead)),
    Condition(Module(List(Set(w,ExpandExpression(u,x))),If(SumQ(w),Map(Function(RegularizeTerm(Times(Slot1,Power(v,n)),x)),w),Times(w,Power(v,n)))),And(FractionQ(n),Or(Less(n,C0),Greater(n,C1))))),
SetDelayed(SumFreeQ(u_),
    If(AtomQ(u),True,If(SumQ(u),False,Catch(CompoundExpression(Scan(Function(If(SumFreeQ(Slot1),Null,Throw(False))),u),True))))),
SetDelayed(ExpandExpression(u_,$p(x,SymbolHead)),
    If(Or(Or(Or(Or(Or(Or(SumQ(u),MatchQ(u,Condition(Times($p(c,true),Power(Plus(a_,Times($p(b,true),Power(x,$p(n,true)))),CN1)),And(FreeQ(List(a,b,c),x),IntIntegerQ(n))))),MatchQ(u,Condition(Times(Times($p(c,true),Power(x,$p(m,true))),Power(Plus(a_,Times($p(b,true),Power(x,$p(n,true)))),$p(p,true))),And(And(FreeQ(List(a,b,c),x),IntIntegerQ(List(m,n,p))),ZeroQ(Plus(Plus(m,Times(CN1,n)),C1)))))),MatchQ(u,Condition(Times(Times($p(c,true),Power(x,$p(m,true))),Power(Plus(v_,Times($p(b,true),Power(x,$p(n,true)))),$p(p,true))),And(And(And(And(FreeQ(List(b,c),x),Not(AlgebraicFunctionQ(v,x))),IntIntegerQ(List(m,n,p))),Less(p,C0)),And(Less(C0,n),LessEqual(n,m)))))),MatchQ(u,Condition(Times(Power(x,m_),Power($(f_,Plus($p(a,true),Times($p(b,true),x))),$p(n,true))),And(And(FreeQ(List(a,b,m,n),x),MemberQ(List($s("Tan"),$s("Cot"),$s("Tanh"),$s("Coth")),f)),Not(And(IntIntegerQ(m),Greater(m,C0))))))),MatchQ(u,Condition(Times($(f_,Plus(Plus($p(a,true),Times($p(b,true),x)),Times($p(c,true),Power(x,C2)))),Power(x,CN1)),And(FreeQ(List(a,b,c),x),MemberQ(List($s("Sin"),$s("Cos"),$s("Sinh"),$s("Cosh")),f))))),MatchQ(u,Condition(Power(Plus(a_,Times($p(b,true),Power($(f_,Plus($p(c,true),Times($p(d,true),x))),C2))),n_),And(And(FreeQ(List(a,b),x),MemberQ(List($s("Sin"),$s("Cos"),$s("Sinh"),$s("Cosh")),f)),IntIntegerQ(n))))),u,Module(List($s("tmp"),$s("lst")),CompoundExpression(Set($s("tmp"),FindKernel(u,x)),If(And(NotFalseQ($s("tmp")),FunctionOfKernelQ(u,$s("tmp"),x)),Subst(ExpandExpression(Subst(u,$s("tmp"),x),x),x,$s("tmp")),CompoundExpression(Set($s("tmp"),FunctionOfTrigQ(u,x,x)),If(And(And($s("tmp"),Or(ContainsQ(u,$s("Sin"),x),ContainsQ(u,$s("Csc"),x))),FunctionOfQ(Sin(x),u,x)),ExpandTrigExpression(u,Sin(x),x),If(And(And($s("tmp"),Or(ContainsQ(u,$s("Cos"),x),ContainsQ(u,$s("Sec"),x))),FunctionOfQ(Cos(x),u,x)),ExpandTrigExpression(u,Cos(x),x),If(And(And($s("tmp"),Or(ContainsQ(u,$s("Tan"),x),ContainsQ(u,$s("Cot"),x))),FunctionOfQ(Tan(x),u,x)),ExpandTrigExpression(u,Tan(x),x),CompoundExpression(Set($s("tmp"),FunctionOfHyperbolicQ(u,x,x)),If(And(And($s("tmp"),Or(ContainsQ(u,$s("Sinh"),x),ContainsQ(u,$s("Csch"),x))),FunctionOfQ(Sinh(x),u,x)),ExpandTrigExpression(u,Sinh(x),x),If(And(And($s("tmp"),Or(ContainsQ(u,$s("Cosh"),x),ContainsQ(u,$s("Sech"),x))),FunctionOfQ(Cosh(x),u,x)),ExpandTrigExpression(u,Cosh(x),x),If(And(And($s("tmp"),Or(ContainsQ(u,$s("Tanh"),x),ContainsQ(u,$s("Coth"),x))),FunctionOfQ(Tanh(x),u,x)),ExpandTrigExpression(u,Tanh(x),x),Module(List(v),If(And(AlgebraicFunctionQ(u,x),Not(RationalFunctionQ(u,x))),If(GoodExpansionQ(u,Set(v,ExpandExpressionAux(u,x)),x),RegularizeTerm(v,x),u),If(GoodExpansionQ(u,Set(v,Apart(u,x)),x),RegularizeTerm(v,x),If(GoodExpansionQ(u,Set(v,Apart(u)),x),RegularizeTerm(v,x),If(GoodExpansionQ(u,Set(v,ExpandExpressionAux(u,x)),x),RegularizeTerm(v,x),If(TrigHyperbolicFreeQ(u,x),CompoundExpression(Set(v,Apart(u,x)),RegularizeTerm(If(GoodExpansionQ(u,v,x),v,u),x)),CompoundExpression(CompoundExpression(Set($s("tmp"),TryTrigReduceQ(u)),If($s("tmp"),Set($s("lst"),SplitFreeFactors(TrigReduce(u),x)))),If(And($s("tmp"),GoodExpansionQ(u,Set(v,Apart(Part($s("lst"),C2),x)),x)),Map(Function(RegularizeTerm(Times(Part($s("lst"),C1),Slot1),x)),v),If(And($s("tmp"),GoodExpansionQ(u,Set(v,Apart(Part($s("lst"),C2))),x)),Map(Function(RegularizeTerm(Times(Part($s("lst"),C1),Slot1),x)),v),If(And($s("tmp"),GoodExpansionQ(u,Set(v,ExpandExpressionAux(Part($s("lst"),C2),x)),x)),Map(Function(RegularizeTerm(Times(Part($s("lst"),C1),Slot1),x)),v),CompoundExpression(Set(v,SmartTrigExpand(u,x)),If(SumQ(v),RegularizeTerm(v,x),CompoundExpression(Set(v,TrigExpand(u)),If(And(SumQ(v),SumQ(Set(v,Simplify(v)))),RegularizeTerm(v,x),CompoundExpression(Set(v,Apart(u,x)),RegularizeTerm(If(GoodExpansionQ(u,v,x),v,u),x))))))))))))))))))))))))))))),
SetDelayed(TryTrigReduceQ(u_),
    MatchQ(u,Condition(Times(v_,Power($(f_,w_),n_)),And(IntIntegerQ(n),MemberQ(List($s("Sin"),$s("Cos"),$s("Sinh"),$s("Cosh")),f))))),
SetDelayed(ExpandTrigExpression(u_,v_,$p(x,SymbolHead)),
    Module(List(Set(w,TrigSimplify(Subst(ExpandExpression(SubstFor(v,u,x),x),x,v)))),If(SumQ(w),Map(Function(ExpandTrigExpressionAux(Slot1,x)),w),w))),
SetDelayed(ExpandTrigExpressionAux(Times(u_,v_),$p(x,SymbolHead)),
    Condition(Map(Function(Times(u,Slot1)),v),And(And(SumQ(v),Not(FreeQ(u,x))),Not(FreeQ(v,x))))),
SetDelayed(ExpandTrigExpressionAux(u_,$p(x,SymbolHead)),
    u),
SetDelayed(GoodExpansionQ(u_,v_,$p(x,SymbolHead)),
    If(SumQ(v),If(IntPolynomialQ(u,x),True,If(RationalFunctionQ(u,x),If(RationalFunctionQ(v,x),Module(List(Set($s("lst"),RationalFunctionExponents(u,x))),Catch(CompoundExpression(Scan(Function(If(SimplerRationalFunctionQ($s("lst"),RationalFunctionExponents(Slot1,x)),Throw(False))),v),True))),False),True)),False)),
SetDelayed(SimplerRationalFunctionQ($p("lst1"),$p("lst2")),
    And(And(LessEqual(Part($s("lst1"),C1),Part($s("lst2"),C1)),LessEqual(Part($s("lst1"),C2),Part($s("lst2"),C2))),Or(Less(Part($s("lst1"),C1),Part($s("lst2"),C1)),Less(Part($s("lst1"),C2),Part($s("lst2"),C2))))),
SetDelayed(ExpandExpressionAux(Times(Plus(d_,Times($p(e,true),Power(x_,$p(k,true)))),Power(Plus(Plus(a_,Times($p(b,true),Power(x_,k_))),Times($p(c,true),Power(x_,j_))),n_)),$p(x,SymbolHead)),
    Condition(Plus(Times(d,Power(Plus(Plus(a,Times(b,Power(x,k))),Times(c,Power(x,j))),n)),Times(Times(e,Power(x,k)),Power(Plus(Plus(a,Times(b,Power(x,k))),Times(c,Power(x,j))),n))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),IntIntegerQ(List(n,k,j))),EvenQ(k)),Equal(j,Times(C2,k))),Less(n,CN1)))),
SetDelayed(ExpandExpressionAux(Times(u_,v_),$p(x,SymbolHead)),
    Condition(Map(Function(Times(Slot1,v)),u),And(SumQ(u),Not(FreeQ(u,x))))),
SetDelayed(ExpandExpressionAux(Times(Power(u_,n_),$p(v,true)),$p(x,SymbolHead)),
    Condition(Module(List(Set(w,Expand(Power(u,n),x))),Condition(Map(Function(Times(Slot1,v)),w),SumQ(w))),And(And(And(SumQ(u),IntIntegerQ(n)),Greater(n,C0)),Not(FreeQ(u,x))))),
SetDelayed(RegularizeTerm(Times($p(c,true),Times(u_,Power(Plus(a_,Times($p(b,true),Power(x_,n_))),CN1))),$p(x,SymbolHead)),
    Condition(If(IntPolynomialQ(u,x),Module(List(k),Sum(RegularizeTerm(Times(Times(c,Coefficient(u,x,k)),Times(Power(x,k),Power(Plus(a,Times(b,Power(x,n))),CN1))),x),List(k,C0,Exponent(u,x)))),Map(Function(RegularizeTerm(Times(c,Times(Slot1,Power(Plus(a,Times(b,Power(x,n))),CN1))),x)),u)),And(And(And(And(FreeQ(List(a,b,c),x),IntIntegerQ(n)),Greater(n,C0)),SumQ(u)),Not(FreeQ(u,x))))),
SetDelayed(RegularizeTerm(u_,$p(x,SymbolHead)),
    If(SumQ(u),Map(Function(RegularizeTerm(Slot1,x)),u),Module(List($s("lst1"),$s("lst2")),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("lst1"),SplitFreeFactors(NormalForm(u,x),x)),Set($s("lst2"),SplitFreeFactors(Regularize(Part($s("lst1"),C2),x),x))),Set($s("lst2"),List(Times(Part($s("lst1"),C1),Part($s("lst2"),C1)),Part($s("lst2"),C2)))),Set($s("lst2"),List(Times(Simplify(Numerator(Part($s("lst2"),C1))),Power(Simplify(Denominator(Part($s("lst2"),C1))),CN1)),Part($s("lst2"),C2)))),If(SumQ(Part($s("lst2"),C2)),Map(Function(Times(Part($s("lst2"),C1),Slot1)),Part($s("lst2"),C2)),Times(Part($s("lst2"),C1),Part($s("lst2"),C2))))))),
SetDelayed(ContainsQ(u_,f_,x_),
    Greater(Count(u,Condition($(f,Times($p(n,true),x)),IntIntegerQ(n)),CInfinity),C0)),
SetDelayed(FunctionOfKernelQ(u_,v_,x_),
    If(SameQ(u,v),True,If(AtomQ(u),UnsameQ(u,x),Catch(CompoundExpression(Scan(Function(If(Not(FunctionOfKernelQ(Slot1,v,x)),Throw(False))),u),True))))),
SetDelayed(FindKernel(u_,x_),
    If(AlgebraicFunctionQ(u,x),False,If(And(SameQ(Length(u),C1),AlgebraicFunctionQ(Part(u,C1),x)),u,If(And(And(SameQ(Length(u),C2),AlgebraicFunctionQ(Part(u,C1),x)),FreeQ(Part(u,C2),x)),u,If(And(And(SameQ(Length(u),C2),AlgebraicFunctionQ(Part(u,C2),x)),FreeQ(Part(u,C1),x)),u,Module(List($s("tmp")),Catch(CompoundExpression(Scan(Function(If(NotFalseQ(Set($s("tmp"),FindKernel(Slot1,x))),Throw($s("tmp")))),u),False)))))))),
SetDelayed(CommonNumericFactors($p("lst")),
    Module(List(Set($s("num"),Apply($s("GCD"),Map($s("Integrate::NumericFactor"),$s("lst"))))),Prepend(Map(Function(Times(Slot1,Power($s("num"),CN1))),$s("lst")),$s("num")))),
SetDelayed(NumericFactor(u_),
    If(NumberQ(u),If(ZeroQ(Im(u)),u,If(ZeroQ(Re(u)),Im(u),C1)),If(PowerQ(u),If(And(RationalQ(Part(u,C1)),FractionQ(Part(u,C2))),If(Greater(Part(u,C2),C0),Times(C1,Power(Denominator(Part(u,C1)),CN1)),Times(C1,Power(Denominator(Times(C1,Power(Part(u,C1),CN1))),CN1))),C1),If(ProductQ(u),Times(NumericFactor(First(u)),NumericFactor(Rest(u))),C1)))),
SetDelayed(NonnumericFactors(u_),
    If(NumberQ(u),If(ZeroQ(Im(u)),C1,If(ZeroQ(Re(u)),CI,u)),If(PowerQ(u),If(And(RationalQ(Part(u,C1)),FractionQ(Part(u,C2))),Times(u,Power(NumericFactor(u),CN1)),u),If(ProductQ(u),Times(NonnumericFactors(First(u)),NonnumericFactors(Rest(u))),u)))),
SetDelayed(ContentFactor($p("expn")),
    If(AtomQ($s("expn")),$s("expn"),If(ProductQ($s("expn")),Map($s("Integrate::ContentFactor"),$s("expn")),If(SumQ($s("expn")),Module(List(Set($s("lst"),CommonFactors(Apply($s("List"),$s("expn"))))),If(Or(SameQ(Part($s("lst"),C1),C1),SameQ(Part($s("lst"),C1),CN1)),$s("expn"),Times(Part($s("lst"),C1),Apply($s("Plus"),Rest($s("lst")))))),$s("expn"))))),
SetDelayed(CommonFactors($p("lst")),
    Module(List($s("lst1"),$s("lst2"),$s("lst3"),$s("lst4"),$s("common"),$s("base"),$s("num")),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("lst1"),Map($s("Integrate::NonnumericFactors"),$s("lst"))),Set($s("lst2"),Map($s("Integrate::NumericFactor"),$s("lst")))),Set($s("num"),Apply($s("GCD"),$s("lst2")))),If(MapAnd(Function(Less(Slot1,C0)),$s("lst2")),Set($s("num"),Times(CN1,$s("num"))))),Set($s("common"),$s("num"))),Set($s("lst2"),Map(Function(Times(Slot1,Power($s("num"),CN1))),$s("lst2")))),While(True,CompoundExpression(CompoundExpression(Set($s("lst3"),Map($s("Integrate::LeadFactor"),$s("lst1"))),If(Apply($s("SameQ"),$s("lst3")),CompoundExpression(Set($s("common"),Times($s("common"),Part($s("lst3"),C1))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),If(And(MapAnd(Function(And(And(LogQ(Slot1),IntIntegerQ(First(Slot1))),Greater(First(Slot1),C0))),$s("lst3")),MapAnd($s("Integrate::RationalQ"),Set($s("lst4"),Map(Function(FullSimplify(Times(Slot1,Power(First($s("lst3")),CN1)))),$s("lst3"))))),CompoundExpression(CompoundExpression(CompoundExpression(Set($s("num"),Apply($s("GCD"),$s("lst4"))),Set($s("common"),Times($s("common"),Log(Power(Part(First($s("lst3")),C1),$s("num")))))),Set($s("lst2"),Map2(Function(Times(Slot1,Times(Slot2,Power($s("num"),CN1)))),$s("lst2"),$s("lst4")))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),If(And(Apply($s("SameQ"),Map($s("Integrate::LeadBase"),$s("lst1"))),MapAnd($s("Integrate::RationalQ"),Set($s("lst4"),Map($s("Integrate::LeadDegree"),$s("lst1"))))),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("num"),Smallest($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C1)))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num")))))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Times(CN1,$s("num")))))),$s("lst2"),$s("lst4")))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),CompoundExpression(CompoundExpression(Set($s("num"),MostMainFactorPosition($s("lst3"))),Set($s("lst2"),ReplacePart($s("lst2"),Times(Part($s("lst3"),$s("num")),Part($s("lst2"),$s("num"))),$s("num")))),Set($s("lst1"),ReplacePart($s("lst1"),RemainingFactors(Part($s("lst1"),$s("num"))),$s("num")))))))),If(MapAnd(Function(SameQ(Slot1,C1)),$s("lst1")),Return(Prepend($s("lst2"),$s("common"))))))))),
SetDelayed(MostMainFactorPosition($p("lst",$s("List"))),
    Module(List(Set($s("factor"),C1),Set($s("num"),C1)),CompoundExpression(Do(If(Greater(FactorOrder(Part($s("lst"),i),$s("factor")),C0),CompoundExpression(Set($s("factor"),Part($s("lst"),i)),Set($s("num"),i))),List(i,Length($s("lst")))),$s("num")))),
SetDelayed(FactorOrder(u_,v_),
    If(SameQ(u,C1),If(SameQ(v,C1),C0,CN1),If(SameQ(v,C1),C1,Order(u,v)))),
SetDelayed(Smallest($p("num1"),$p("num2")),
    If(Greater($s("num1"),C0),If(Greater($s("num2"),C0),Min($s("num1"),$s("num2")),C0),If(Greater($s("num2"),C0),C0,Max($s("num1"),$s("num2"))))),
SetDelayed(Smallest($p("lst",$s("List"))),
    Module(List(Set($s("num"),Part($s("lst"),C1))),CompoundExpression(Scan(Function(Set($s("num"),Smallest($s("num"),Slot1))),Rest($s("lst"))),$s("num")))),
SetDelayed(MonomialFactor(u_,$p(x,SymbolHead)),
    If(AtomQ(u),If(SameQ(u,x),List(C1,C1),List(C0,u)),If(PowerQ(u),If(IntIntegerQ(Part(u,C2)),Module(List(Set($s("lst"),MonomialFactor(Part(u,C1),x))),List(Times(Part($s("lst"),C1),Part(u,C2)),Power(Part($s("lst"),C2),Part(u,C2)))),If(And(SameQ(Part(u,C1),x),FreeQ(Part(u,C2),x)),List(Part(u,C2),C1),List(C0,u))),If(ProductQ(u),Module(List(Set($s("lst1"),MonomialFactor(First(u),x)),Set($s("lst2"),MonomialFactor(Rest(u),x))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Times(Part($s("lst1"),C2),Part($s("lst2"),C2)))),If(SumQ(u),Module(List($s("lst"),$s("deg")),CompoundExpression(CompoundExpression(CompoundExpression(Set($s("lst"),Map(Function(MonomialFactor(Slot1,x)),Apply($s("List"),u))),Set($s("deg"),Part($s("lst"),C1,C1))),Scan(Function(Set($s("deg"),MinimumDegree($s("deg"),Part(Slot1,C1)))),Rest($s("lst")))),If(Or(ZeroQ($s("deg")),And(RationalQ($s("deg")),Less($s("deg"),C0))),List(C0,u),List($s("deg"),Apply($s("Plus"),Map(Function(Times(Power(x,Plus(Part(Slot1,C1),Times(CN1,$s("deg")))),Part(Slot1,C2))),$s("lst"))))))),List(C0,u)))))),
SetDelayed(MinimumDegree($p("deg1"),$p("deg2")),
    If(RationalQ($s("deg1")),If(RationalQ($s("deg2")),Min($s("deg1"),$s("deg2")),$s("deg1")),If(RationalQ($s("deg2")),$s("deg2"),Module(List(Set($s("deg"),Simplify(Plus($s("deg1"),Times(CN1,$s("deg2")))))),If(RationalQ($s("deg")),If(Greater($s("deg"),C0),$s("deg2"),$s("deg1")),If(OrderedQ(List($s("deg1"),$s("deg2"))),$s("deg1"),$s("deg2"))))))),
SetDelayed(ConstantFactor(u_,$p(x,SymbolHead)),
    If(FreeQ(u,x),List(u,C1),If(AtomQ(u),List(C1,u),If(And(PowerQ(u),FreeQ(Part(u,C2),x)),Module(List(Set($s("lst"),ConstantFactor(Part(u,C1),x))),If(IntIntegerQ(Part(u,C2)),List(Power(Part($s("lst"),C1),Part(u,C2)),Power(Part($s("lst"),C2),Part(u,C2))),List(Power(PositiveFactors(Part($s("lst"),C1)),Part(u,C2)),Power(Times(NonpositiveFactors(Part($s("lst"),C1)),Part($s("lst"),C2)),Part(u,C2))))),If(ProductQ(u),Module(List(Set($s("lst"),Map(Function(ConstantFactor(Slot1,x)),Apply($s("List"),u)))),List(Apply($s("Times"),Map($s("First"),$s("lst"))),Apply($s("Times"),Map($s("Integrate::Second"),$s("lst"))))),If(SumQ(u),Module(List(Set($s("lst1"),Map(Function(ConstantFactor(Slot1,x)),Apply($s("List"),u)))),If(Apply($s("SameQ"),Map($s("Integrate::Second"),$s("lst1"))),List(Apply($s("Plus"),Map($s("First"),$s("lst1"))),Part($s("lst1"),C1,C2)),Module(List(Set($s("lst2"),CommonFactors(Map($s("First"),$s("lst1"))))),List(First($s("lst2")),Apply($s("Plus"),Map2($s("Times"),Rest($s("lst2")),Map($s("Integrate::Second"),$s("lst1")))))))),List(C1,u))))))),
SetDelayed(PositiveFactors(u_),
    If(ZeroQ(u),C1,If(RationalQ(u),Abs(u),If(PositiveQ(u),u,If(ProductQ(u),Map($s("Integrate::PositiveFactors"),u),C1))))),
SetDelayed(NonpositiveFactors(u_),
    If(ZeroQ(u),u,If(RationalQ(u),Sign(u),If(PositiveQ(u),C1,If(ProductQ(u),Map($s("Integrate::NonpositiveFactors"),u),u))))),
SetDelayed(FunctionOfLinear(u_,$p(x,SymbolHead)),
    Module(List(Set($s("lst"),FunctionOfLinear(u,False,False,x,False))),If(Or(Or(FalseQ($s("lst")),FalseQ(Part($s("lst"),C1))),And(SameQ(Part($s("lst"),C1),C0),SameQ(Part($s("lst"),C2),C1))),False,List(FunctionOfLinearSubst(u,Part($s("lst"),C1),Part($s("lst"),C2),x),Part($s("lst"),C1),Part($s("lst"),C2))))),
SetDelayed(FunctionOfLinear(u_,a_,b_,x_,$p("flag")),
    If(FreeQ(u,x),List(a,b),If(CalculusQ(u),False,If(LinearQ(u,x),If(FalseQ(a),List(Coefficient(u,x,C0),Coefficient(u,x,C1)),Module(List(Set($s("lst"),CommonFactors(List(b,Coefficient(u,x,C1))))),If(And(ZeroQ(Coefficient(u,x,C0)),Not($s("flag"))),List(C0,Part($s("lst"),C1)),If(ZeroQ(Plus(Times(b,Coefficient(u,x,C0)),Times(CN1,Times(a,Coefficient(u,x,C1))))),List(Times(a,Power(Part($s("lst"),C2),CN1)),Part($s("lst"),C1)),List(C0,C1))))),If(And(PowerQ(u),FreeQ(Part(u,C1),x)),FunctionOfLinear(Times(Log(Part(u,C1)),Part(u,C2)),a,b,x,False),Module(List($s("lst")),If(And(ProductQ(u),NonzeroQ(Part(Set($s("lst"),MonomialFactor(u,x)),C1))),If(And(And(And(False,IntIntegerQ(Part($s("lst"),C1))),Unequal(Part($s("lst"),C1),CN1)),FreeQ(Part($s("lst"),C2),x)),If(And(RationalQ(LeadFactor(Part($s("lst"),C2))),Less(LeadFactor(Part($s("lst"),C2)),C0)),FunctionOfLinear(Times(DivideDegreesOfFactors(Times(CN1,Part($s("lst"),C2)),Part($s("lst"),C1)),x),a,b,x,False),FunctionOfLinear(Times(DivideDegreesOfFactors(Part($s("lst"),C2),Part($s("lst"),C1)),x),a,b,x,False)),False),CompoundExpression(Set($s("lst"),List(a,b)),Catch(CompoundExpression(Scan(Function(CompoundExpression(Set($s("lst"),FunctionOfLinear(Slot1,Part($s("lst"),C1),Part($s("lst"),C2),x,SumQ(u))),If(SameQ($s("lst"),False),Throw(False)))),u),$s("lst"))))))))))),
SetDelayed(FunctionOfLinearSubst(u_,a_,b_,x_),
    If(FreeQ(u,x),u,If(LinearQ(u,x),Module(List(Set($s("tmp"),Coefficient(u,x,C1))),CompoundExpression(Set($s("tmp"),If(SameQ($s("tmp"),b),C1,Times($s("tmp"),Power(b,CN1)))),Plus(Plus(Coefficient(u,x,C0),Times(CN1,Times(a,$s("tmp")))),Times($s("tmp"),x)))),If(And(PowerQ(u),FreeQ(Part(u,C1),x)),Power(E,FullSimplify(FunctionOfLinearSubst(Times(Log(Part(u,C1)),Part(u,C2)),a,b,x))),Module(List($s("lst")),If(And(ProductQ(u),NonzeroQ(Part(Set($s("lst"),MonomialFactor(u,x)),C1))),If(And(RationalQ(LeadFactor(Part($s("lst"),C2))),Less(LeadFactor(Part($s("lst"),C2)),C0)),Times(CN1,Power(FunctionOfLinearSubst(Times(DivideDegreesOfFactors(Times(CN1,Part($s("lst"),C2)),Part($s("lst"),C1)),x),a,b,x),Part($s("lst"),C1))),Power(FunctionOfLinearSubst(Times(DivideDegreesOfFactors(Part($s("lst"),C2),Part($s("lst"),C1)),x),a,b,x),Part($s("lst"),C1))),Map(Function(FunctionOfLinearSubst(Slot1,a,b,x)),u))))))),
SetDelayed(DivideDegreesOfFactors(u_,n_),
    If(ProductQ(u),Map(Function(Power(LeadBase(Slot1),Times(LeadDegree(Slot1),Power(n,CN1)))),u),Power(LeadBase(u),Times(LeadDegree(u),Power(n,CN1))))),
SetDelayed(FunctionOfInverseLinear(u_,$p(x,SymbolHead)),
    FunctionOfInverseLinear(u,Null,x)),
SetDelayed(FunctionOfInverseLinear(u_,$p("lst"),x_),
    If(FreeQ(u,x),$s("lst"),If(SameQ(u,x),False,If(QuotientOfLinearsQ(u,x),Module(List(Set($s("tmp"),Drop(QuotientOfLinearsParts(u,x),C2))),If(SameQ(Part($s("tmp"),C2),C0),False,If(SameQ($s("lst"),Null),$s("tmp"),If(ZeroQ(Plus(Times(Part($s("lst"),C1),Part($s("tmp"),C2)),Times(CN1,Times(Part($s("lst"),C2),Part($s("tmp"),C1))))),$s("lst"),False)))),If(CalculusQ(u),False,Module(List(Set($s("tmp"),$s("lst"))),Catch(CompoundExpression(Scan(Function(If(FalseQ(Set($s("tmp"),FunctionOfInverseLinear(Slot1,$s("tmp"),x))),Throw(False))),u),$s("tmp"))))))))),
SetDelayed(FunctionOfExponentialOfLinear(u_,$p(x,SymbolHead)),
    Module(List(Set($s("lst"),FunctionOfExponentialOfLinear(u,x,False,False,False)),a,b,f),If(Or(FalseQ($s("lst")),FalseQ(Part($s("lst"),C1))),False,CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set(a,Part($s("lst"),C1)),Set(b,Part($s("lst"),C2))),Set(f,Part($s("lst"),C3))),If(And(MatchQ(u,Condition(Times(v_,Power(g_,Plus($p(c,true),Times(d_,x)))),And(FreeQ(List(c,d,g),x),Less(NumericFactor(d),C0)))),Greater(NumericFactor(b),C0)),CompoundExpression(Set(a,Times(CN1,a)),Set(b,Times(CN1,b))))),List(FunctionOfExponentialOfLinearSubst(u,a,b,f,x),a,b,f))))),
SetDelayed(FunctionOfExponentialOfLinear(u_,x_,a_,b_,f_),
    If(FreeQ(u,x),List(a,b,f),If(Or(SameQ(u,x),CalculusQ(u)),False,If(And(And(PowerQ(u),FreeQ(Part(u,C1),x)),LinearQ(Part(u,C2),x)),FunctionOfExponentialOfLinearAux(a,b,f,Coefficient(Part(u,C2),x,C0),Coefficient(Part(u,C2),x,C1),Part(u,C1)),If(And(HyperbolicQ(u),LinearQ(Part(u,C1),x)),FunctionOfExponentialOfLinearAux(a,b,f,Coefficient(Part(u,C1),x,C0),Coefficient(Part(u,C1),x,C1),E),Module(List($s("lst")),If(And(And(PowerQ(u),FreeQ(Part(u,C1),x)),SumQ(Part(u,C2))),CompoundExpression(Set($s("lst"),FunctionOfExponentialOfLinear(Power(Part(u,C1),First(Part(u,C2))),x,a,b,f)),If(SameQ($s("lst"),False),False,FunctionOfExponentialOfLinear(Power(Part(u,C1),Rest(Part(u,C2))),x,Part($s("lst"),C1),Part($s("lst"),C2),Part($s("lst"),C3)))),CompoundExpression(Set($s("lst"),List(a,b,f)),Catch(CompoundExpression(Scan(Function(CompoundExpression(Set($s("lst"),FunctionOfExponentialOfLinear(Slot1,x,Part($s("lst"),C1),Part($s("lst"),C2),Part($s("lst"),C3))),If(SameQ($s("lst"),False),Throw(False)))),u),$s("lst"))))))))))),
SetDelayed(FunctionOfExponentialOfLinearAux(a_,b_,f_,c_,d_,g_),
    If(FalseQ(a),List(c,d,g),If(ZeroQ(Plus(Times(Log(f),NonnumericFactors(b)),Times(CN1,Times(Log(g),NonnumericFactors(d))))),Module(List(Set($s("gcd"),GCD(NumericFactor(b),NumericFactor(d)))),CompoundExpression(If(And(Less(NumericFactor(b),C0),Less(NumericFactor(d),C0)),Set($s("gcd"),Times(CN1,$s("gcd")))),If(Equal($s("gcd"),NumericFactor(b)),List(a,b,f),If(Equal($s("gcd"),NumericFactor(d)),List(c,d,g),List(C0,Times($s("gcd"),NonnumericFactors(b)),f))))),False)))
  );
}
