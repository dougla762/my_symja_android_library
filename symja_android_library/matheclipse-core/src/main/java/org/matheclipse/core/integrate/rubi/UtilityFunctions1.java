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
public class UtilityFunctions1 { 
  public static IAST RULES = List( 
SetDelayed(MonomialSumQ(u_,$p(x,SymbolHead)),
    And(SumQ(u),Catch(CompoundExpression(Scan(Function(If(Or(FreeQ(Slot1,x),MonomialQ(Part(SplitFreeFactors(Slot1,x),C2),x)),Null,Throw(False))),u),True)))),
SetDelayed(PolynomialTermQ(u_,$p(x,SymbolHead)),
    Or(FreeQ(u,x),MatchQ(u,Condition(Times($p(a,true),Power(x,$p(n,true))),And(And(FreeQ(a,x),IntIntegerQ(n)),Greater(n,C0)))))),
SetDelayed(PolynomialTerms(u_,$p(x,SymbolHead)),
    Map(Function(If(PolynomialTermQ(Slot1,x),Slot1,C0)),u)),
SetDelayed(NonpolynomialTerms(u_,$p(x,SymbolHead)),
    Map(Function(If(PolynomialTermQ(Slot1,x),C0,Slot1)),u)),
SetDelayed(BinomialTest(u_,$p(x,SymbolHead)),
    If(SameQ(u,x),List(C0,C1,C1),If(FreeQ(u,x),List(C0,u,C0),If(PowerQ(u),If(And(SameQ(Part(u,C1),x),FreeQ(Part(u,C2),x)),List(C0,C1,Part(u,C2)),False),Module(List($s("lst1"),$s("lst2")),If(ProductQ(u),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,Module(List(a,b,c,d,m,n),CompoundExpression(CompoundExpression(Set(List(a,b,m),$s("lst1")),Set(List(c,d,n),$s("lst2"))),If(SameQ(m,C0),List(Times(b,c),Times(b,d),n),If(SameQ(n,C0),List(Times(a,d),Times(b,d),m),If(SameQ(a,C0),If(SameQ(c,C0),List(C0,Times(b,d),Plus(m,n)),If(SameQ(Plus(m,n),C0),List(Times(b,d),Times(b,c),m),False)),If(SameQ(c,C0),If(SameQ(Plus(m,n),C0),List(Times(b,d),Times(a,d),n),False),False)))))))))),If(SumQ(u),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,Module(List(a,b,c,d,m,n),CompoundExpression(CompoundExpression(Set(List(a,b,m),$s("lst1")),Set(List(c,d,n),$s("lst2"))),If(SameQ(m,C0),List(Plus(b,c),d,n),If(SameQ(n,C0),List(Plus(a,d),b,m),If(SameQ(m,n),List(Plus(a,c),Plus(b,d),m),False))))))))),False))))))),
SetDelayed(PerfectPowerTest(u_,$p(x,SymbolHead)),
    If(IntPolynomialQ(u,x),Module(List(Set($s("lst"),FactorSquareFreeList(u)),Set($s("gcd"),C0),Set(v,C1)),CompoundExpression(CompoundExpression(If(SameQ(Part($s("lst"),C1),List(C1,C1)),Set($s("lst"),Rest($s("lst")))),Scan(Function(Set($s("gcd"),GCD($s("gcd"),Part(Slot1,C2)))),$s("lst"))),If(Greater($s("gcd"),C1),CompoundExpression(Scan(Function(Set(v,Times(v,Power(Part(Slot1,C1),Times(Part(Slot1,C2),Power($s("gcd"),CN1)))))),$s("lst")),Power(Expand(v),$s("gcd"))),False))),False)),
SetDelayed(RationalFunctionQ(u_,$p(x,SymbolHead)),
    If(AtomQ(u),True,If(IntegerPowerQ(u),RationalFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(RationalFunctionQ(Slot1,x),Null,Throw(False))),u),True)),If(FreeQ(u,x),True,False))))),
SetDelayed(RationalFunctionExponents(u_,$p(x,SymbolHead)),
    If(IntPolynomialQ(u,x),List(Exponent(u,x),C0),If(IntegerPowerQ(u),If(Greater(Part(u,C2),C0),Times(Part(u,C2),RationalFunctionExponents(Part(u,C1),x)),Times(Times(CN1,Part(u,C2)),Reverse(RationalFunctionExponents(Part(u,C1),x)))),If(ProductQ(u),Plus(RationalFunctionExponents(First(u),x),RationalFunctionExponents(Rest(u),x)),If(SumQ(u),Module(List(Set(v,Together(u))),If(SumQ(v),Module(List($s("lst1"),$s("lst2")),CompoundExpression(CompoundExpression(Set($s("lst1"),RationalFunctionExponents(First(u),x)),Set($s("lst2"),RationalFunctionExponents(Rest(u),x))),List(Max(Plus(Part($s("lst1"),C1),Part($s("lst2"),C2)),Plus(Part($s("lst2"),C1),Part($s("lst1"),C2))),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))))),RationalFunctionExponents(v,x))),List(C0,C0)))))),
SetDelayed(AlgebraicFunctionQ(u_,$p(x,SymbolHead)),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(RationalPowerQ(u),AlgebraicFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(AlgebraicFunctionQ(Slot1,x),Null,Throw(False))),u),True)),False)))),
SetDelayed(QuotientOfLinearsQ(Times(a_,u_),x_),
    Condition(QuotientOfLinearsQ(u,x),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsQ(Plus(a_,u_),x_),
    Condition(QuotientOfLinearsQ(u,x),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsQ(Times(C1,Power(u_,CN1)),x_),
    QuotientOfLinearsQ(u,x)),
SetDelayed(QuotientOfLinearsQ(u_,x_),
    Condition(True,LinearQ(u,x))),
SetDelayed(QuotientOfLinearsQ(Times(u_,Power(v_,CN1)),x_),
    Condition(True,And(LinearQ(u,x),LinearQ(v,x)))),
SetDelayed(QuotientOfLinearsQ(u_,x_),
    Or(SameQ(u,x),FreeQ(u,x))),
SetDelayed(QuotientOfLinearsParts(Times(a_,u_),x_),
    Condition(Apply(Function(List(Times(a,Slot1),Times(a,Slot2),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsParts(Plus(a_,u_),x_),
    Condition(Apply(Function(List(Plus(Slot1,Times(a,Slot(C3))),Plus(Slot2,Times(a,Slot(C4))),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsParts(Times(C1,Power(u_,CN1)),x_),
    Apply(Function(List(Slot(C3),Slot(C4),Slot1,Slot2)),QuotientOfLinearsParts(u,x))),
SetDelayed(QuotientOfLinearsParts(u_,x_),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),C1,C0),LinearQ(u,x))),
SetDelayed(QuotientOfLinearsParts(Times(u_,Power(v_,CN1)),x_),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),Coefficient(v,x,C0),Coefficient(v,x,C1)),And(LinearQ(u,x),LinearQ(v,x)))),
SetDelayed(QuotientOfLinearsParts(u_,x_),
    If(SameQ(u,x),List(C0,C1,C1,C0),If(FreeQ(u,x),List(u,C0,C1,C0),CompoundExpression(Print(stringx("QuotientOfLinearParts error!")),List(u,C0,C1,C0))))),
SetDelayed(ImproperRationalFunctionQ(u_,v_,$p(x,SymbolHead)),
    And(And(And(IntPolynomialQ(u,x),IntPolynomialQ(v,x)),Not(And(MatchQ(u,Condition(Power(Plus($p(a,true),Times($p(b,true),x)),$p(n,true)),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),MatchQ(v,Condition(Power(Plus($p(a,true),Times($p(b,true),x)),$p(n,true)),And(FreeQ(List(a,b),x),IntIntegerQ(n))))))),Or(And(QuadraticQ(v,x),GreaterEqual(Exponent(u,x),C2)),MatchQ(v,Condition(Plus(a_,Times($p(b,true),Power(x,$p(n,true)))),And(And(FreeQ(List(a,b),x),IntIntegerQ(n)),And(Less(C0,n),LessEqual(n,Exponent(u,x))))))))),
SetDelayed(ExpandImproperFraction(u_,$p(x,SymbolHead)),
    Module(List($s("tmp")),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator(u),Denominator(u),x))),$s("tmp"),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(SmartNumerator(u),SmartDenominator(u),x))),$s("tmp"),If(FunctionOfQ(Sin(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Sin(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Sin(x)),False)),If(FunctionOfQ(Cos(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Cos(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Cos(x)),False)),If(FunctionOfQ(Sinh(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Sinh(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Sinh(x)),False)),If(FunctionOfQ(Cosh(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Cosh(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Cosh(x)),False)),False)))))))),
SetDelayed(ExpandImproperFraction(u_,v_,$p(x,SymbolHead)),
    Module(List($s("lst1"),$s("lst2")),CompoundExpression(CompoundExpression(Set($s("lst1"),PolynomialFunctionOf(u,x)),Set($s("lst2"),PolynomialFunctionOf(v,x))),If(And(SameQ(Part($s("lst1"),C1),Part($s("lst2"),C1)),GreaterEqual(Exponent(Part($s("lst1"),C2),x),Exponent(Part($s("lst2"),C2),x))),ReplaceAll(PolynomialDivide(Part($s("lst1"),C2),Part($s("lst2"),C2),x),Rule(x,Part($s("lst1"),C1))),False)))),
SetDelayed(PolynomialDivide(u_,v_,$p(x,SymbolHead)),
    Prepend(SplitFreeFactors(Regularize(Times(PolynomialRemainder(u,v,x),Power(v,CN1)),x),x),PolynomialQuotient(u,v,x))),
SetDelayed(SmartNumerator(u_),
    If(MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(u)),C1,If(And(And(PowerQ(u),IntIntegerQ(Part(u,C2))),MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(Part(u,C1)))),C1,If(And(And(PowerQ(u),RationalQ(Part(u,C2))),Less(Part(u,C2),C0)),C1,If(ProductQ(u),Map($s("Integrate::SmartNumerator"),u),u))))),
SetDelayed(SmartDenominator(u_),
    If(MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(u)),Times(C1,Power(u,CN1)),If(And(And(PowerQ(u),IntIntegerQ(Part(u,C2))),MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(Part(u,C1)))),Times(C1,Power(u,CN1)),If(And(And(PowerQ(u),RationalQ(Part(u,C2))),Less(Part(u,C2),C0)),Times(C1,Power(u,CN1)),If(ProductQ(u),Map($s("Integrate::SmartDenominator"),u),C1))))),
SetDelayed(PolynomialFunctionOf(u_,$p(x,SymbolHead)),
    If(AtomQ(u),If(SameQ(u,x),List(x,x),List(C1,u)),If(PositiveIntegerPowerQ(u),Module(List(Set($s("lst"),PolynomialFunctionOf(Part(u,C1),x))),List(Part($s("lst"),C1),Power(Part($s("lst"),C2),Part(u,C2)))),If(ProductQ(u),Module(List(Set($s("lst1"),PolynomialFunctionOf(First(u),x)),Set($s("lst2"),PolynomialFunctionOf(Rest(u),x))),If(SameQ(Part($s("lst1"),C1),C1),List(Part($s("lst2"),C1),Times(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst2"),C1),C1),List(Part($s("lst1"),C1),Times(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst1"),C1),Part($s("lst2"),C1)),List(Part($s("lst1"),C1),Times(Part($s("lst1"),C2),Part($s("lst2"),C2))),List(u,x))))),If(SumQ(u),Module(List(Set($s("lst1"),PolynomialFunctionOf(First(u),x)),Set($s("lst2"),PolynomialFunctionOf(Rest(u),x))),If(SameQ(Part($s("lst1"),C1),C1),List(Part($s("lst2"),C1),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst2"),C1),C1),List(Part($s("lst1"),C1),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst1"),C1),Part($s("lst2"),C1)),List(Part($s("lst1"),C1),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))),List(u,x))))),If(FreeQ(u,x),List(C1,u),List(u,x))))))),
SetDelayed(Dist(C1,v_),
    v),
SetDelayed(Dist(u_,v_),
    Condition(Times(CN1,Dist(Times(CN1,u),v)),Less(NumericFactor(u),C0))),
SetDelayed(Dist(u_,Dist(v_,w_)),
    Dist(Times(u,v),w)),
SetDelayed(Dist(u_,v_),
    Condition(Map(Function(Dist(u,Slot1)),v),SumQ(v))),
SetDelayed(Dist(u_,v_),
    Condition(Times(u,v),Or(FreeQ(v,$s("Int")),UnsameQ($s("ShowSteps"),True)))),
SetDelayed(Dist(u_,Times(v_,w_)),
    Condition(Dist(Times(u,v),w),FreeQ(v,$s("Int")))),
SetDelayed(Regularize(u_,$p(x,SymbolHead)),
    If(RecognizedFormQ(u,x),u,NormalForm(NormalForm(NormalForm(Simplify(u),x),x),x))),
SetDelayed(RecognizedFormQ(u_,$p(x,SymbolHead)),
    Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(FreeQ(u,x),MonomialQ(u,x)),MatchQ(u,Condition(Times(a_,v_),And(FreeQ(a,x),RecognizedFormQ(v,x))))),MatchQ(u,Condition(Power($(f_,Plus($p(a,true),Times($p(b,true),x))),$p(n,true)),And(FreeQ(List(a,b,f),x),IntIntegerQ(n))))),MatchQ(u,Condition(Power(Plus(a_,Times($p(b,true),Power(x,$p(n,true)))),$p(p,true)),And(And(FreeQ(List(a,b,n,p),x),IntIntegerQ(n)),Greater(n,C0))))),MatchQ(u,Condition(Times(Power(x,$p(m,true)),Power(Plus(a_,Times($p(b,true),Power(x,$p(n,true)))),$p(p,true))),And(And(FreeQ(List(a,b,m,n,p),x),IntIntegerQ(n)),Greater(n,C0))))),MatchQ(u,Condition(Times(Power(Plus($p(a,true),Times($p(b,true),x)),$p(m,true)),Power(Plus($p(c,true),Times($p(d,true),x)),$p(n,true))),FreeQ(List(a,b,c,d,m,n),x)))),MatchQ(u,Condition(Times(Times(Power(x,$p(p,true)),Power(Plus($p(a,true),Times($p(b,true),x)),$p(m,true))),Power(Plus($p(c,true),Times($p(d,true),x)),$p(n,true))),FreeQ(List(a,b,c,d,m,n,p),x)))),MatchQ(u,Condition(Times(Power(x,$p(m,true)),Power(Plus(Times($p(b,true),x),Times($p(c,true),Power(x,C2))),n_)),And(FreeQ(List(b,c,m,n),x),Not(IntIntegerQ(n)))))),MatchQ(u,Condition(Power(Plus(Plus($p(a,true),Times($p(b,true),x)),Times($p(c,true),Power(x,C2))),$p(n,true)),FreeQ(List(a,b,c,n),x)))),MatchQ(u,Condition(Times(Power(x,$p(m,true)),Power(Plus(Plus(a_,Times($p(b,true),x)),Times($p(c,true),Power(x,C2))),$p(n,true))),FreeQ(List(a,b,c,m,n),x)))),MatchQ(u,Condition(Times(Plus(d_,Times($p(e,true),x)),Power(Plus(Plus(a_,Times($p(b,true),x)),Times($p(c,true),Power(x,C2))),CN1)),FreeQ(List(a,b,c,d,e),x)))),MatchQ(u,Condition(Times(Power(x,$p(m,true)),Times(Plus(d_,Times($p(e,true),x)),Power(Plus(Plus(a_,Times($p(b,true),x)),Times($p(c,true),Power(x,C2))),CN1))),FreeQ(List(a,b,c,d,e),x)))),MatchQ(u,Condition(Times(v_,Plus(a_,Times($p(b,true),x))),And(FreeQ(List(a,b),x),FunctionOfQ(Plus(Times(a,x),Times(b,Times(Power(x,C2),C1D2))),v,x))))),MatchQ(u,Condition(Times(Plus(Times($p(a,true),Power(v_,$p(m,true))),Times($p(b,true),Power(v_,$p(n,true)))),Power(Plus(Times($p(c,true),Power(v_,$p(m,true))),Times($p(d,true),Power(v_,$p(n,true)))),CN1)),FreeQ(List(a,b,c,d,m,n),x))))),
SetDelayed(NormalForm(Times(Power(u_,m_),Power(v_,n_)),$p(x,SymbolHead)),
    Condition(NormalForm(Times(Power(Map(Function(Times(CN1,Slot1)),u),m),Power(Map(Function(Times(CN1,Slot1)),v),n)),x),And(And(And(And(OddQ(List(m,n)),SumQ(u)),SumQ(v)),NegativeCoefficientQ(u)),NegativeCoefficientQ(v)))),
SetDelayed(NormalForm(u_,$p(x,SymbolHead)),
    Condition(Plus(Coefficient(u,x,C0),Times(Coefficient(u,x,C1),x)),LinearQ(u,x))),
SetDelayed(NormalForm(Times(a_,u_),$p(x,SymbolHead)),
    Condition(NormalForm(Map(Function(Times(a,Slot1)),u),x),And(FreeQ(a,x),SumQ(u)))),
SetDelayed(NormalForm(Times(Times($p(b,true),x_),Plus(c_,Times($p(d,true),x_))),$p(x,SymbolHead)),
    Condition(Plus(Times(Times(b,c),x),Times(Times(b,d),Power(x,C2))),FreeQ(List(b,c,d),x))),
SetDelayed(NormalForm(Plus(a_,Times(Times($p(b,true),Power(x_,$p(n,true))),Plus(c_,Times($p(d,true),Power(x_,$p(n,true)))))),$p(x,SymbolHead)),
    Condition(Plus(Plus(a,Times(Times(b,c),Power(x,n))),Times(Times(b,d),Power(x,Times(C2,n)))),FreeQ(List(a,b,c,d,n),x))),
SetDelayed(NormalForm(Plus(c_,Times($p(d,true),Power(Plus(a_,Times($p(b,true),Power(x_,$p(n,true)))),C2))),$p(x,SymbolHead)),
    Condition(Plus(Plus(Plus(c,Times(Power(a,C2),d)),Times(Times(Times(Times(C2,a),b),d),Power(x,n))),Times(Times(Power(b,C2),d),Power(x,Times(C2,n)))),FreeQ(List(a,b,c,d,n),x))),
SetDelayed(NormalForm(Plus(Plus($p(c,true),Times($p(e,true),Power(x_,$p(n,true)))),Times($p(d,true),Power(Plus(a_,Times($p(b,true),Power(x_,$p(n,true)))),C2))),$p(x,SymbolHead)),
    Condition(Plus(Plus(Plus(c,Times(Power(a,C2),d)),Times(Plus(e,Times(Times(Times(C2,a),b),d)),Power(x,n))),Times(Times(Power(b,C2),d),Power(x,Times(C2,n)))),FreeQ(List(a,b,c,d,e,n),x))),
SetDelayed(NormalForm(Plus(a_,Times(Times($p(b,true),Power(f_,Plus($p(e,true),Times($p(g,true),x_)))),Plus(c_,Times($p(d,true),Power(f_,Plus($p(e,true),Times($p(g,true),x_))))))),$p(x,SymbolHead)),
    Condition(Plus(Plus(a,Times(Times(b,c),Power(f,Plus(e,Times(g,x))))),Times(Times(b,d),Power(f,Plus(Times(C2,e),Times(Times(C2,g),x))))),FreeQ(List(a,b,c,d,e,f,g),x))),
SetDelayed(NormalForm(Times(Times($p(c,true),Power(x_,$p(m,true))),Plus(a_,Times($p(b,true),Power(x_,$p(n,true))))),$p(x,SymbolHead)),
    Condition(Times(c,Plus(b,Times(a,Power(x,m)))),And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(m,n))))),
SetDelayed(NormalForm($(f_,Times(Times($p(c,true),Power(x_,$p(m,true))),Power(Plus(a_,Times($p(b,true),Power(x_,$p(n,true)))),p_))),$p(x,SymbolHead)),
    Condition($(f,Times(c,Power(Plus(b,Times(a,Power(Power(x,n),CN1))),p))),And(And(FreeQ(List(a,b,c,f,m,n),x),IntIntegerQ(p)),ZeroQ(Plus(m,Times(n,p)))))),
SetDelayed(NormalForm(Power(Times(Times($p(e,true),Plus(a_,Times($p(b,true),x_))),Plus(c_,Times($p(d,true),x_))),n_),$p(x,SymbolHead)),
    Condition(Power(Plus(Plus(Times(Times(a,c),e),Times(Plus(Times(Times(a,d),e),Times(Times(b,c),e)),x)),Times(Times(Times(b,d),e),Power(x,C2))),n),And(FreeQ(List(a,b,c,d,e),x),FractionQ(n)))),
SetDelayed(NormalForm($(f_,u_),$p(x,SymbolHead)),
    Condition($(f,ExpandPolynomial(u,x)),And(FreeQ(f,x),QuadraticPolynomialQ(u,x)))),
SetDelayed(NormalForm(Power(f_,u_),$p(x,SymbolHead)),
    Condition(Power(f,ExpandPolynomial(u,x)),And(FreeQ(f,x),QuadraticPolynomialQ(u,x)))),
SetDelayed(NormalForm(Times(Times($p(u,true),Power(f_,v_)),Power(g_,w_)),$p(x,SymbolHead)),
    Condition(Times(u,Power(E,Sum(Times(Plus(Times(Log(f),Coefficient(v,x,k)),Times(Log(g),Coefficient(w,x,k))),Power(x,k)),List(k,C0,C2)))),And(And(And(And(FreeQ(List(f,g),x),IntPolynomialQ(v,x)),LessEqual(LessEqual(C1,Exponent(v,x)),C2)),IntPolynomialQ(w,x)),LessEqual(LessEqual(C1,Exponent(w,x)),C2)))),
SetDelayed(NormalForm(Times(Times($p(u,true),Power(f_,Plus($p(a,true),Times($p(b,true),Power(x_,$p(n,true)))))),Power(g_,Plus($p(c,true),Times($p(d,true),Power(x_,$p(n,true)))))),$p(x,SymbolHead)),
    Condition(Times(u,Power(E,Plus(Plus(Times(a,Log(f)),Times(c,Log(g))),Times(Plus(Times(b,Log(f)),Times(d,Log(g))),Power(x,n))))),FreeQ(List(a,b,c,d,f,g,n),x))),
SetDelayed(QuadraticPolynomialQ(u_,$p(x,SymbolHead)),
    And(And(IntPolynomialQ(u,x),LessEqual(Exponent(u,x),C2)),Not(MatchQ(u,Condition(Times($p(a,true),Power(v_,C2)),FreeQ(a,x)))))),
SetDelayed(ExpandPolynomial(u_,$p(x,SymbolHead)),
    Module(List(k),Sum(Times(Coefficient(u,x,k),Power(x,k)),List(k,C0,Exponent(u,x))))),
SetDelayed(NormalForm(Power(Plus(Times($p(a,true),Power(x_,$p(m,true))),Times($p(b,true),Power(x_,$p(n,true)))),p_),$p(x,SymbolHead)),
    Condition(Power(Times(Power(x,m),Plus(a,Times(b,Power(x,Plus(n,Times(CN1,m)))))),p),And(And(And(FreeQ(List(a,b),x),RationalQ(List(m,n,p))),LessEqual(m,n)),Not(Equal(Equal(Times(C2,m),n),C2))))),
SetDelayed(NormalForm(Plus(Plus($p(u,true),Times($p(a,true),v_)),Times($p(b,true),v_)),$p(x,SymbolHead)),
    Condition(Plus(u,Times(Plus(a,b),v)),And(FreeQ(List(a,b),x),Not(FreeQ(v,x))))),
SetDelayed(NormalForm(Power(u_,n_),$p(x,SymbolHead)),
    Condition(Module(List(Set(v,Together(u))),Condition(Power(v,n),Not(SumQ(v)))),And(And(SumQ(u),FractionQ(n)),Not(MonomialSumQ(u,x))))),
SetDelayed(NormalForm(Times(Cos(Times(C2,u_)),Power(Sec(u_),C2)),$p(x,SymbolHead)),
    Condition(Plus(C1,Times(CN1,Power(Tan(u),C2))),Not(FreeQ(u,x)))),
SetDelayed(NormalForm(Times($p(u,true),Times(Plus(c_,d_),Power(Power(Plus(a_,b_),C2),CN1))),$p(x,SymbolHead)),
    Condition(NormalForm(Times(u,Times(Plus(a,Times(CN1,b)),Power(Plus(a,b),CN1))),x),And(ZeroQ(Plus(c,Times(CN1,Power(a,C2)))),ZeroQ(Plus(d,Power(b,C2)))))),
SetDelayed(NormalForm(u_,$p(x,SymbolHead)),
    If(AtomQ(u),u,If(MatchQ(u,Condition(Plus($p(a,true),Times($p(b,true),Power(x,$p(n,true)))),FreeQ(List(a,b,n),x))),u,If(MatchQ(u,Condition(Plus(Plus($p(a,true),Times($p(b,true),Power(x,$p(n,true)))),Times($p(c,true),Power(x,$p(m,true)))),And(FreeQ(List(a,b,c,m,n),x),SameQ(Times(C2,n),m)))),u,Module(List($s("tmp")),CompoundExpression(Set($s("tmp"),MonomialFactor(u,x)),If(NonzeroQ(Part($s("tmp"),C1)),Times(Power(x,Part($s("tmp"),C1)),NormalForm(Part($s("tmp"),C2),x)),Map(Function(NormalForm(Slot1,x)),u)))))))),
SetDelayed(SimplifyExpression(Times(Power(x_,m_),Power(Plus(a_,Times($p(b,true),Power(x_,n_))),$p(p,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(b,Times(a,Power(x,Times(CN1,n)))),p)),And(And(And(FreeQ(List(a,b),x),IntIntegerQ(List(m,n,p))),Less(n,C0)),Or(Equal(Plus(Plus(m,Times(n,p)),C1),C0),And(And(Less(p,CN1),Greater(Times(CN1,n),C1)),And(LessEqual(Times(CN1,n),Plus(m,Times(n,p))),Less(Plus(m,Times(n,p)),Plus(Times(integer(-2L),n),Times(CN1,C1))))))))),
SetDelayed(SimplifyExpression(Times(C1,Power(Plus(Plus(Times($p(a,true),x_),Times($p(b,true),Power(x_,m_))),Times($p(c,true),Power(x_,n_))),CN1)),$p(x,SymbolHead)),
    Condition(Times(C1,Power(Times(x,Plus(Plus(a,Times(b,Power(x,Plus(m,Times(CN1,C1))))),Times(c,Power(x,Plus(n,Times(CN1,C1)))))),CN1)),And(And(And(FreeQ(List(a,b,c),x),IntIntegerQ(List(m,n))),Greater(m,C2)),Equal(Plus(n,Times(CN1,C1)),Times(C2,Plus(m,Times(CN1,C1))))))),
SetDelayed(SimplifyExpression(Times(Plus($p(a,true),Times($p(b,true),Power(x_,C2))),Power(Plus(Plus(c_,Times($p(d,true),Power(x_,C2))),Times($p(e,true),Sqrt(Plus(f_,Times($p(g,true),Power(x_,C2)))))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Times(CN1,c),Power(f,CN1)),Times(e,Power(Sqrt(Plus(f,Times(g,Power(x,C2)))),CN1))),And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(c,g),Times(CN1,Times(f,d))))),ZeroQ(Plus(b,Times(Power(d,C2),Power(g,CN1))))),ZeroQ(Plus(Plus(a,Times(CN1,Power(e,C2))),Times(Power(c,C2),Power(f,CN1))))))),
SetDelayed(SimplifyExpression(Times(C1,Power(Times(x_,Plus(Plus(Times($p(a,true),Power(x_,CN1)),b_),Times($p(c,true),x_))),CN1)),$p(x,SymbolHead)),
    Condition(Times(C1,Power(Plus(Plus(a,Times(b,x)),Times(c,Power(x,C2))),CN1)),FreeQ(List(a,b,c),x))),
SetDelayed(SimplifyExpression(Times(C1,Power(Times(Power(x_,C2),Plus(Plus(Times($p(a,true),Power(Power(x_,C2),CN1)),Times($p(b,true),Power(x_,CN1))),c_)),CN1)),$p(x,SymbolHead)),
    Condition(Times(C1,Power(Plus(Plus(a,Times(b,x)),Times(c,Power(x,C2))),CN1)),FreeQ(List(a,b,c),x))),
SetDelayed(SimplifyExpression(Times(Power(x_,$p(m,true)),Power(Plus(Plus(Times($p(a,true),Power(x_,$p(m,true))),Times($p(b,true),Power(x_,$p(p,true)))),Times($p(c,true),Power(x_,$p(q,true)))),CN1)),$p(x,SymbolHead)),
    Condition(Times(C1,Power(Plus(Plus(a,Times(b,x)),Times(c,Power(x,C2))),CN1)),And(And(And(FreeQ(List(a,b,c),x),IntIntegerQ(List(m,p,q))),Equal(p,Plus(m,C1))),Equal(q,Plus(m,C2))))),
SetDelayed(SimplifyExpression(u_,$p(x,SymbolHead)),
    If(MatchQ(u,Condition(Times(Times($p(w,true),Power(Plus($p(a,true),Times($p(b,true),v_)),$p(m,true))),Power(Plus($p(c,true),Times($p(d,true),v_)),$p(n,true))),And(And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(List(m,n))),Less(m,C0)),Less(n,C0)))),u,Module(List(v),CompoundExpression(Set(v,Regularize(u,x)),If(SimplerExpressionQ(v,u,x),v,CompoundExpression(Set(v,Regularize(Cancel(u),x)),If(SimplerExpressionQ(v,u,x),v,u))))))),
SetDelayed(SimplerExpressionQ(u_,v_,x_),
    Or(LessEqual(SmartLeafCount(u),Times(fraction(2L,3L),SmartLeafCount(v))),And(And(And(And(And(And(IntPolynomialQ(Numerator(u),x),IntPolynomialQ(Denominator(u),x)),IntPolynomialQ(Numerator(v),x)),IntPolynomialQ(Denominator(v),x)),Less(Exponent(Numerator(u),x),Exponent(Numerator(v),x))),Less(Exponent(Denominator(u),x),Exponent(Denominator(v),x))),LessEqual(SmartLeafCount(u),Plus(SmartLeafCount(v),C5))))),
SetDelayed(SmartLeafCount(u_),
    If(AtomQ(u),C1,Plus(Apply($s("Plus"),Map($s("Integrate::SmartLeafCount"),Apply($s("List"),u))),C1))),
SetDelayed(TrigSimplify(u_),
    If(AtomQ(u),u,If(SameQ(Head(u),$s("If")),u,TrigSimplifyAux(Map($s("Integrate::TrigSimplify"),u))))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Power(Plus(Times($p(a,true),Power(v_,$p(m,true))),Times($p(b,true),Power(v_,$p(n,true)))),p_))),
    Condition(Times(Times(u,Power(v,Times(m,p))),Power(TrigSimplifyAux(Plus(a,Times(b,Power(v,Plus(n,Times(CN1,m)))))),p)),And(And(And(Or(TrigQ(v),HyperbolicQ(v)),IntIntegerQ(p)),RationalQ(List(m,n))),Less(m,n)))),
SetDelayed(TrigSimplifyAux(Plus(Plus(Times($p(u,true),Power(Cos(z_),C2)),Times($p(v,true),Power(Sin(z_),C2))),$p(w,true))),
    Condition(Plus(u,w),SameQ(u,v))),
SetDelayed(TrigSimplifyAux(Plus(Plus(Times($p(u,true),Power(Sec(z_),C2)),Times($p(v,true),Power(Tan(z_),C2))),$p(w,true))),
    Condition(Plus(u,w),SameQ(u,Times(CN1,v)))),
SetDelayed(TrigSimplifyAux(Plus(Plus(Times($p(u,true),Power(Csc(z_),C2)),Times($p(v,true),Power(Cot(z_),C2))),$p(w,true))),
    Condition(Plus(u,w),SameQ(u,Times(CN1,v)))),
SetDelayed(TrigSimplifyAux(Plus(Plus(u_,Times($p(v,true),Power(Sin(z_),C2))),$p(w,true))),
    Condition(Plus(Times(u,Power(Cos(z),C2)),w),SameQ(u,Times(CN1,v)))),
SetDelayed(TrigSimplifyAux(Plus(Plus(u_,Times($p(v,true),Power(Cos(z_),C2))),$p(w,true))),
    Condition(Plus(Times(u,Power(Sin(z),C2)),w),SameQ(u,Times(CN1,v)))),
SetDelayed(TrigSimplifyAux(Plus(Plus(u_,Times($p(v,true),Power(Tan(z_),C2))),$p(w,true))),
    Condition(Plus(Times(u,Power(Sec(z),C2)),w),SameQ(u,v))),
SetDelayed(TrigSimplifyAux(Plus(Plus(u_,Times($p(v,true),Power(Cot(z_),C2))),$p(w,true))),
    Condition(Plus(Times(u,Power(Csc(z),C2)),w),SameQ(u,v))),
SetDelayed(TrigSimplifyAux(Plus(Plus(u_,Times($p(v,true),Power(Sec(z_),C2))),$p(w,true))),
    Condition(Plus(Times(v,Power(Tan(z),C2)),w),SameQ(u,Times(CN1,v)))),
SetDelayed(TrigSimplifyAux(Plus(Plus(u_,Times($p(v,true),Power(Csc(z_),C2))),$p(w,true))),
    Condition(Plus(Times(v,Power(Cot(z),C2)),w),SameQ(u,Times(CN1,v)))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Sin(v_),C2),Power(Plus(a_,Times($p(b,true),Cos(v_))),CN1)))),
    Condition(Times(u,Plus(Times(C1,Power(a,CN1)),Times(CN1,Times(Cos(v),Power(b,CN1))))),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2)))))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Cos(v_),C2),Power(Plus(a_,Times($p(b,true),Sin(v_))),CN1)))),
    Condition(Times(u,Plus(Times(C1,Power(a,CN1)),Times(CN1,Times(Sin(v),Power(b,CN1))))),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2)))))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Tan(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Tan(v_),$p(n,true)))),CN1)))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Cot(v),n))),CN1)),And(And(IntIntegerQ(n),Greater(n,C0)),NonsumQ(a)))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Cot(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Cot(v_),$p(n,true)))),CN1)))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Tan(v),n))),CN1)),And(And(IntIntegerQ(n),Greater(n,C0)),NonsumQ(a)))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Sec(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Sec(v_),$p(n,true)))),CN1)))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Cos(v),n))),CN1)),And(And(IntIntegerQ(n),Greater(n,C0)),NonsumQ(a)))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Csc(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Csc(v_),$p(n,true)))),CN1)))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Sin(v),n))),CN1)),And(And(IntIntegerQ(n),Greater(n,C0)),NonsumQ(a)))),
SetDelayed(TrigSimplifyAux(Power(Plus(Times($p(a,true),Csc(v_)),Times($p(b,true),Cot(v_))),n_)),
    Condition(Times(Power(a,n),Power(Cot(Times(v,C1D2)),n)),And(EvenQ(n),ZeroQ(Plus(a,Times(CN1,b)))))),
SetDelayed(TrigSimplifyAux(Power(Plus(Times($p(a,true),Csc(v_)),Times($p(b,true),Cot(v_))),n_)),
    Condition(Times(Power(a,n),Power(Tan(Times(v,C1D2)),n)),And(EvenQ(n),ZeroQ(Plus(a,b))))),
SetDelayed(TrigSimplifyAux(Times(Times($p(u,true),Power(Sin(v_),$p(m,true))),Power(Plus($p(a,true),Times($p(b,true),Power(Cot(v_),$p(n,true)))),$p(p,true)))),
    Condition(Times(Times(u,Power(Sin(v),Plus(m,Times(CN1,Times(n,p))))),Power(Plus(Times(b,Power(Cos(v),n)),Times(a,Power(Sin(v),n))),p)),IntIntegerQ(List(m,n,p)))),
SetDelayed(TrigSimplifyAux(Times(Times($p(u,true),Power(Cos(v_),$p(m,true))),Power(Plus($p(a,true),Times($p(b,true),Power(Tan(v_),$p(n,true)))),$p(p,true)))),
    Condition(Times(Times(u,Power(Cos(v),Plus(m,Times(CN1,Times(n,p))))),Power(Plus(Times(b,Power(Sin(v),n)),Times(a,Power(Cos(v),n))),p)),IntIntegerQ(List(m,n,p)))),
SetDelayed(TrigSimplifyAux(Times(Times(u_,Power(Sec(v_),$p(m,true))),Power(Plus($p(a,true),Times($p(b,true),Power(Tan(v_),C2))),$p(p,true)))),
    Condition(Times(u,Power(Plus(Times(b,Power(Sin(v),C2)),Times(a,Power(Cos(v),C2))),p)),And(IntIntegerQ(List(m,p)),Equal(Plus(m,Times(C2,p)),C0)))),
SetDelayed(TrigSimplifyAux(Times(Times(u_,Power(Csc(v_),$p(m,true))),Power(Plus($p(a,true),Times($p(b,true),Power(Cot(v_),C2))),$p(p,true)))),
    Condition(Times(u,Power(Plus(Times(b,Power(Cos(v),C2)),Times(a,Power(Sin(v),C2))),p)),And(IntIntegerQ(List(m,p)),Equal(Plus(m,Times(C2,p)),C0)))),
SetDelayed(TrigSimplifyAux(Times(Times($p(u,true),Power(Cos(v_),$p(m,true))),Power(Plus(Plus($p(a,true),Times($p(b,true),Power(Tan(v_),$p(n,true)))),Times($p(c,true),Power(Sec(v_),$p(n,true)))),$p(p,true)))),
    Condition(Times(Times(u,Power(Cos(v),Plus(m,Times(CN1,Times(n,p))))),Power(Plus(Plus(c,Times(b,Power(Sin(v),n))),Times(a,Power(Cos(v),n))),p)),IntIntegerQ(List(m,n,p)))),
SetDelayed(TrigSimplifyAux(Times(Times($p(u,true),Power(Sec(v_),$p(m,true))),Power(Plus(Plus($p(a,true),Times($p(b,true),Power(Tan(v_),$p(n,true)))),Times($p(c,true),Power(Sec(v_),$p(n,true)))),$p(p,true)))),
    Condition(Times(Times(u,Power(Sec(v),Plus(m,Times(n,p)))),Power(Plus(Plus(c,Times(b,Power(Sin(v),n))),Times(a,Power(Cos(v),n))),p)),IntIntegerQ(List(m,n,p)))),
SetDelayed(TrigSimplifyAux(Times(Times($p(u,true),Power(Sin(v_),$p(m,true))),Power(Plus(Plus($p(a,true),Times($p(b,true),Power(Cot(v_),$p(n,true)))),Times($p(c,true),Power(Csc(v_),$p(n,true)))),$p(p,true)))),
    Condition(Times(Times(u,Power(Sin(v),Plus(m,Times(CN1,Times(n,p))))),Power(Plus(Plus(c,Times(b,Power(Cos(v),n))),Times(a,Power(Sin(v),n))),p)),IntIntegerQ(List(m,n,p)))),
SetDelayed(TrigSimplifyAux(Times(Times($p(u,true),Power(Csc(v_),$p(m,true))),Power(Plus(Plus($p(a,true),Times($p(b,true),Power(Cot(v_),$p(n,true)))),Times($p(c,true),Power(Csc(v_),$p(n,true)))),$p(p,true)))),
    Condition(Times(Times(u,Power(Csc(v),Plus(m,Times(n,p)))),Power(Plus(Plus(c,Times(b,Power(Cos(v),n))),Times(a,Power(Sin(v),n))),p)),IntIntegerQ(List(m,n,p)))),
SetDelayed(TrigSimplifyAux(Times($p(u,true),Times(Power(Tan(v_),$p(n,true)),Power(Plus(a_,Times($p(b,true),Power(Sec(v_),$p(n,true)))),CN1)))),
    Condition(Times(u,Times(Power(Sin(v),n),Power(Plus(b,Times(a,Power(Cos(v),n))),CN1))),And(And(IntIntegerQ(n),Greater(n,C0)),NonsumQ(a))))
  );
}
