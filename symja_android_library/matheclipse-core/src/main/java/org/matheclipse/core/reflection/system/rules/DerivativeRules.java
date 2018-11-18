package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface DerivativeRules {
  final public static IAST RULES1 = List(
    // ArcCos->-1/Sqrt(1-#1^2)
    Rule(ArcCos,
      Negate(Power(Plus(C1,Negate(Sqr(Slot1))),CN1D2))),
    // ArcCosh->1/Sqrt(-1+#1^2)
    Rule(ArcCosh,
      Power(Plus(CN1,Sqr(Slot1)),CN1D2)),
    // ArcCot->-1/(1+#1^2)
    Rule(ArcCot,
      Negate(Power(Plus(C1,Sqr(Slot1)),-1))),
    // ArcCoth->1/(1-#1^2)
    Rule(ArcCoth,
      Power(Plus(C1,Negate(Sqr(Slot1))),-1)),
    // ArcCsc->-1/(#1^2*Sqrt(1-1/#1^2))
    Rule(ArcCsc,
      Times(CN1,Power(Plus(C1,Negate(Power(Slot1,-2))),CN1D2),Power(Slot1,-2))),
    // ArcCsch->-1/(Abs(#1)*Sqrt(1+#1^2))
    Rule(ArcCsch,
      Times(CN1,Power(Abs(Slot1),-1),Power(Plus(C1,Sqr(Slot1)),CN1D2))),
    // ArcSin->1/Sqrt(1-#1^2)
    Rule(ArcSin,
      Power(Plus(C1,Negate(Sqr(Slot1))),CN1D2)),
    // ArcSinh->1/Sqrt(1+#1^2)
    Rule(ArcSinh,
      Power(Plus(C1,Sqr(Slot1)),CN1D2)),
    // ArcTan->1/(1+#1^2)
    Rule(ArcTan,
      Power(Plus(C1,Sqr(Slot1)),-1)),
    // ArcTanh->1/(1-#1^2)
    Rule(ArcTanh,
      Power(Plus(C1,Negate(Sqr(Slot1))),-1)),
    // ArcSec->1/(#1^2*Sqrt(1-1/#1^2))
    Rule(ArcSec,
      Times(Power(Plus(C1,Negate(Power(Slot1,-2))),CN1D2),Power(Slot1,-2))),
    // ArcSech->-1/(#1*Sqrt(1-#1^2))
    Rule(ArcSech,
      Times(CN1,Power(Slot1,-1),Power(Plus(C1,Negate(Sqr(Slot1))),CN1D2))),
    // Ceiling->Piecewise({{0,#1<Ceiling(#1)}},Indeterminate)
    Rule(Ceiling,
      Piecewise(List(List(C0,Less(Slot1,Ceiling(Slot1)))),Indeterminate)),
    // EllipticE->(EllipticE(#1)-EllipticK(#1))/(2*#1)
    Rule(EllipticE,
      Times(C1D2,Plus(EllipticE(Slot1),Negate(EllipticK(Slot1))),Power(Slot1,-1))),
    // EllipticK->(EllipticE(#1)-EllipticK(#1)*(1-#1))/(2*(1-#1)*#1)
    Rule(EllipticK,
      Times(C1D2,Power(Plus(C1,Negate(Slot1)),-1),Power(Slot1,-1),Plus(EllipticE(Slot1),Times(CN1,EllipticK(Slot1),Plus(C1,Negate(Slot1)))))),
    // Erf->2*1/(E^#1^2*Sqrt(Pi))
    Rule(Erf,
      Times(C2,Exp(Negate(Sqr(Slot1))),Power(Pi,CN1D2))),
    // Erfc->-2*1/(E^#1^2*Sqrt(Pi))
    Rule(Erfc,
      Times(CN2,Exp(Negate(Sqr(Slot1))),Power(Pi,CN1D2))),
    // Erfi->2*E^#1^2/Sqrt(Pi)
    Rule(Erfi,
      Times(C2,Exp(Sqr(Slot1)),Power(Pi,CN1D2))),
    // ExpIntegralEi->E^#1/#1
    Rule(ExpIntegralEi,
      Times(Exp(Slot1),Power(Slot1,-1))),
    // Floor->Piecewise({{0,#1>Floor(#1)}},Indeterminate)
    Rule(Floor,
      Piecewise(List(List(C0,Greater(Slot1,Floor(Slot1)))),Indeterminate)),
    // FractionalPart->1
    Rule(FractionalPart,
      C1),
    // FresnelC->Cos(1/2*Pi*#1^2)
    Rule(FresnelC,
      Cos(Times(C1D2,Pi,Sqr(Slot1)))),
    // FresnelS->Sin(1/2*Pi*#1^2)
    Rule(FresnelS,
      Sin(Times(C1D2,Pi,Sqr(Slot1)))),
    // Gamma->Gamma(#1)*PolyGamma(#1)
    Rule(Gamma,
      Times(Gamma(Slot1),PolyGamma(Slot1))),
    // HarmonicNumber->Pi^2/6-HarmonicNumber(#1,2)
    Rule(HarmonicNumber,
      Plus(Times(QQ(1L,6L),Sqr(Pi)),Negate(HarmonicNumber(Slot1,C2)))),
    // HeavisideTheta->DiracDelta(#1)
    Rule(HeavisideTheta,
      DiracDelta(Slot1)),
    // IntegerPart->0
    Rule(IntegerPart,
      C0),
    // InverseErf->1/2*Sqrt(Pi)*E^InverseErf(x)^2
    Rule(InverseErf,
      Times(C1D2,Exp(Sqr(InverseErf(x))),Sqrt(Pi))),
    // InverseErfc->-1/2*E^InverseErfc(#1)^2*Sqrt(Pi)
    Rule(InverseErfc,
      Times(CN1D2,Exp(Sqr(InverseErfc(Slot1))),Sqrt(Pi))),
    // Log->1/#1
    Rule(Log,
      Power(Slot1,-1)),
    // LogGamma->PolyGamma(0,#1)
    Rule(LogGamma,
      PolyGamma(C0,Slot1)),
    // LogisticSigmoid->LogisticSigmoid(#1)*(1-LogisticSigmoid(#1))
    Rule(LogisticSigmoid,
      Times(Plus(C1,Negate(LogisticSigmoid(Slot1))),LogisticSigmoid(Slot1))),
    // PolyGamma->PolyGamma(1,#1)
    Rule(PolyGamma,
      PolyGamma(C1,Slot1)),
    // Cot->-Csc(#1)^2
    Rule(Cot,
      Negate(Sqr(Csc(Slot1)))),
    // Coth->-1/Sinh(#1)^2
    Rule(Coth,
      Negate(Sqr(Csch(Slot1)))),
    // Cos->-Sin(#1)
    Rule(Cos,
      Negate(Sin(Slot1))),
    // Cosh->Sinh(#1)
    Rule(Cosh,
      Sinh(Slot1)),
    // Csc->-Cot(#1)*Csc(#1)
    Rule(Csc,
      Times(CN1,Cot(Slot1),Csc(Slot1))),
    // Csch->-Coth(#1)*Csch(#1)
    Rule(Csch,
      Times(CN1,Coth(Slot1),Csch(Slot1))),
    // Round->Piecewise({{0,NotElement(-1/2+Re(#1),Integers)&&NotElement(-1/2+Im(#1),Integers)}},Indeterminate)
    Rule(Round,
      Piecewise(List(List(C0,And(NotElement(Plus(CN1D2,Re(Slot1)),Integers),NotElement(Plus(CN1D2,Im(Slot1)),Integers)))),Indeterminate)),
    // Sin->Cos(#1)
    Rule(Sin,
      Cos(Slot1)),
    // Sinc->-Sin(#1)/#1^2+Cos(#1)/#1
    Rule(Sinc,
      Plus(Times(CN1,Sin(Slot1),Power(Slot1,-2)),Times(Cos(Slot1),Power(Slot1,-1)))),
    // Sinh->Cosh(#1)
    Rule(Sinh,
      Cosh(Slot1)),
    // Tan->Sec(#1)^2
    Rule(Tan,
      Sqr(Sec(Slot1))),
    // Tanh->Sech(#1)^2
    Rule(Tanh,
      Sqr(Sech(Slot1))),
    // Sec->Sec(#1)*Tan(#1)
    Rule(Sec,
      Times(Sec(Slot1),Tan(Slot1))),
    // Sech->-Tanh(#1)*Sech(#1)
    Rule(Sech,
      Times(CN1,Sech(Slot1),Tanh(Slot1))),
    // SinIntegral->Sinc(#1)
    Rule(SinIntegral,
      Sinc(Slot1)),
    // SinhIntegral->Sinh(#1)/#1
    Rule(SinhIntegral,
      Times(Sinh(Slot1),Power(Slot1,-1))),
    // CosIntegral->Cos(#1)/#1
    Rule(CosIntegral,
      Times(Cos(Slot1),Power(Slot1,-1))),
    // CoshIntegral->Cosh(#1)/#1
    Rule(CoshIntegral,
      Times(Cosh(Slot1),Power(Slot1,-1)))
  );
  final public static IAST RULES2 = List(
    // ArcSin->#1/(1-#1^2)^(3/2)
    Rule(ArcSin,
      Times(Slot1,Power(Plus(C1,Negate(Sqr(Slot1))),QQ(-3L,2L)))),
    // Gamma->Gamma(#1)*PolyGamma(#1)^2+Gamma(#1)*PolyGamma(1,#1)
    Rule(Gamma,
      Plus(Times(Gamma(Slot1),PolyGamma(C1,Slot1)),Times(Gamma(Slot1),Sqr(PolyGamma(Slot1))))),
    // Log->-1/#1^2
    Rule(Log,
      Negate(Power(Slot1,-2))),
    // PolyGamma->PolyGamma(2,#1)
    Rule(PolyGamma,
      PolyGamma(C2,Slot1)),
    // Cot->2*Csc(#1)^2*Cot(#1)
    Rule(Cot,
      Times(C2,Cot(Slot1),Sqr(Csc(Slot1)))),
    // Tan->2*Sec(#1)^2*Tan(#1)
    Rule(Tan,
      Times(C2,Sqr(Sec(Slot1)),Tan(Slot1)))
  );
  final public static IAST RULES3 = List(
    // Log->(-1+#2)!/((-1)^(1-#2)*#1^#2)
    Rule(Log,
      Times(Power(CN1,Plus(CN1,Slot2)),Factorial(Plus(CN1,Slot2)),Power(Slot1,Negate(Slot2)))),
    // PolyGamma->PolyGamma(#2,#1)
    Rule(PolyGamma,
      PolyGamma(Slot2,Slot1)),
    // Cos->Cos(#1+1/2*Pi*#2)
    Rule(Cos,
      Cos(Plus(Slot1,Times(C1D2,Pi,Slot2)))),
    // Sin->Sin(#1+1/2*Pi*#2)
    Rule(Sin,
      Sin(Plus(Slot1,Times(C1D2,Pi,Slot2))))
  );
  final public static IAST RULES4 = List(
    // {BesselJ,0,1}->1/2*(BesselJ(-1+#1,#2)-BesselJ(1+#1,#2))
    Rule(List(BesselJ,C0,C1),
      Times(C1D2,Plus(BesselJ(Plus(CN1,Slot1),Slot2),Negate(BesselJ(Plus(C1,Slot1),Slot2))))),
    // {Gamma,0,1}->-E^(-#2)/#2^(1-#1)
    Rule(List(Gamma,C0,C1),
      Times(CN1,Exp(Negate(Slot2)),Power(Slot2,Plus(CN1,Slot1)))),
    // {Gamma,1,0}->Gamma(#1,#2)*Log(#2)+MeijerG({{},{1,1}},{{0,0,#1},{}},#2)
    Rule(List(Gamma,C1,C0),
      Plus(Times(Gamma(Slot1,Slot2),Log(Slot2)),MeijerG(List(List(),List(C1,C1)),List(List(C0,C0,Slot1),List()),Slot2))),
    // {Power,1,0}->#2/#1^(1-#2)
    Rule(List(Power,C1,C0),
      Times(Power(Slot1,Plus(CN1,Slot2)),Slot2)),
    // {Power,0,1}->Log(#1)*#1^#2
    Rule(List(Power,C0,C1),
      Times(Log(Slot1),Power(Slot1,Slot2))),
    // {Power,1,1}->#1^(-1+#2)+(Log(#1)*#2)/#1^(1-#2)
    Rule(List(Power,C1,C1),
      Plus(Power(Slot1,Plus(CN1,Slot2)),Times(Log(Slot1),Power(Slot1,Plus(CN1,Slot2)),Slot2))),
    // {PolyLog,0,1}->PolyLog(-1+#2,#1)/#1
    Rule(List(PolyLog,C0,C1),
      Times(PolyLog(Plus(CN1,Slot2),Slot1),Power(Slot1,-1))),
    // {ProductLog,0,1}->ProductLog(#1,#2)/#2*(1+ProductLog(#1,#2))
    Rule(List(ProductLog,C0,C1),
      Times(ProductLog(Slot1,Slot2),Plus(C1,ProductLog(Slot1,Slot2)),Power(Slot2,-1)))
  );
}
