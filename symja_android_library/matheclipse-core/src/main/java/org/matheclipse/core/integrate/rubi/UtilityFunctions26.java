package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;

import org.matheclipse.core.interfaces.IAST;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions26 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
ISetDelayed(582,ReduceInertTrig($p("func"),m_,u_),
    Condition(If(Less(m,C0),If(GreaterEqual(m,CN1D4),$($s("func"),Plus(Times(m,Pi),u)),Switch($s("func"),$s("§sin"),Negate(ReduceInertTrig($s("§sin"),Negate(m),Negate(u))),$s("§cos"),ReduceInertTrig($s("§cos"),Negate(m),Negate(u)),$s("§tan"),Negate(ReduceInertTrig($s("§tan"),Negate(m),Negate(u))),$s("§cot"),Negate(ReduceInertTrig($s("§cot"),Negate(m),Negate(u))),$s("§sec"),ReduceInertTrig($s("§sec"),Negate(m),Negate(u)),$s("§csc"),Negate(ReduceInertTrig($s("§csc"),Negate(m),Negate(u))))),If(GreaterEqual(m,C2),ReduceInertTrig($s("func"),Mod(m,C2),u),If(GreaterEqual(m,C1),Switch($s("func"),$s("§sin"),Negate(ReduceInertTrig($s("§sin"),Subtract(m,C1),u)),$s("§cos"),Negate(ReduceInertTrig($s("§cos"),Subtract(m,C1),u)),$s("§tan"),ReduceInertTrig($s("§tan"),Subtract(m,C1),u),$s("§cot"),ReduceInertTrig($s("§cot"),Subtract(m,C1),u),$s("§sec"),Negate(ReduceInertTrig($s("§sec"),Subtract(m,C1),u)),$s("§csc"),Negate(ReduceInertTrig($s("§csc"),Subtract(m,C1),u))),If(GreaterEqual(m,C1D2),Switch($s("func"),$s("§sin"),ReduceInertTrig($s("§cos"),Subtract(m,C1D2),u),$s("§cos"),Negate(ReduceInertTrig($s("§sin"),Subtract(m,C1D2),u)),$s("§tan"),Negate(ReduceInertTrig($s("§cot"),Subtract(m,C1D2),u)),$s("§cot"),Negate(ReduceInertTrig($s("§tan"),Subtract(m,C1D2),u)),$s("§sec"),Negate(ReduceInertTrig($s("§csc"),Subtract(m,C1D2),u)),$s("§csc"),ReduceInertTrig($s("§sec"),Subtract(m,C1D2),u)),$($s("func"),Plus(Times(m,Pi),u)))))),RationalQ(m)));
ISetDelayed(583,UnifyInertTrigFunction(Times(a_,u_),x_),
    Condition(Times(a,UnifyInertTrigFunction(u,x)),FreeQ(a,x)));
ISetDelayed(584,UnifyInertTrigFunction(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_),
    Condition(Times(Power(Times(a,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),m),Power(Times(CN1,b,$($s("§sec"),Plus(e,CPiHalf,Times(f,x)))),n)),FreeQ(List(a,b,e,f,m,n),x)));
ISetDelayed(585,UnifyInertTrigFunction(Times(Power(Times(a_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_),
    Condition(Times(Power(Times(a,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),m),Power(Times(b,$($s("§csc"),Plus(e,CPiHalf,Times(f,x)))),n)),FreeQ(List(a,b,e,f,m,n),x)));
ISetDelayed(586,UnifyInertTrigFunction(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),x_),
    Condition(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n),FreeQ(List(a,b,e,f,n),x)));
ISetDelayed(587,UnifyInertTrigFunction(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§cos"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x)))),p),Power(Subtract(a,Times(b,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),m)),FreeQ(List(a,b,e,f,g,m,p),x)));
ISetDelayed(588,UnifyInertTrigFunction(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§sec"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x)))),p),Power(Subtract(a,Times(b,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),m)),FreeQ(List(a,b,e,f,g,m,p),x)));
ISetDelayed(589,UnifyInertTrigFunction(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(If(True,Times(Power(Times(CN1,g,$($s("§tan"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x)))),p),Power(Subtract(a,Times(b,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),m)),Times(Power(Times(CN1,g,$($s("§tan"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m))),FreeQ(List(a,b,e,f,g,m,p),x)));
ISetDelayed(590,UnifyInertTrigFunction(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(Times(Power(Times(CN1,g,$($s("§cot"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m)),FreeQ(List(a,b,e,f,g,m,p),x)));
ISetDelayed(591,UnifyInertTrigFunction(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,m,n),x)));
ISetDelayed(592,UnifyInertTrigFunction(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§csc"),Plus(e,CPiHalf,Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,m,n),x)));
ISetDelayed(593,UnifyInertTrigFunction(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(If(And(IntegerQ(Times(C2,p)),Less(p,C0),IntegerQ(Times(C2,n))),Times(Power(Times(g,$($s("§cos"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x)))),p),Power(Subtract(a,Times(b,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),m),Power(Subtract(c,Times(d,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),n)),Times(Power(Times(CN1,g,$($s("§cos"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n))),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
ISetDelayed(594,UnifyInertTrigFunction(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§sec"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x)))),p),Power(Subtract(a,Times(b,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),m),Power(Subtract(c,Times(d,$($s("§sin"),Plus(e,Times(CN1,C1D2,Pi),Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
ISetDelayed(595,UnifyInertTrigFunction(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
ISetDelayed(596,UnifyInertTrigFunction(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§csc"),Plus(e,CPiHalf,Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
ISetDelayed(597,UnifyInertTrigFunction(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§csc"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
ISetDelayed(598,UnifyInertTrigFunction(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Times(g,$($s("§csc"),Plus(e,CPiHalf,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§csc"),Plus(e,CPiHalf,Times(f,x))))),n)),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
ISetDelayed(599,UnifyInertTrigFunction(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n),Plus(ASymbol,Times(BSymbol,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))))),FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,m,n),x)));
ISetDelayed(600,UnifyInertTrigFunction(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Plus(ASymbol,Times(BSymbol,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),Times(C,Sqr($($s("§sin"),Plus(e,CPiHalf,Times(f,x))))))),FreeQ(List(a,b,c,e,f,ASymbol,BSymbol,C,m),x)));
ISetDelayed(601,UnifyInertTrigFunction(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Plus(ASymbol,Times(C,Sqr($($s("§sin"),Plus(e,CPiHalf,Times(f,x))))))),FreeQ(List(a,b,c,e,f,ASymbol,C,m),x)));
ISetDelayed(602,UnifyInertTrigFunction(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n),Plus(ASymbol,Times(BSymbol,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),Times(C,Sqr($($s("§sin"),Plus(e,CPiHalf,Times(f,x))))))),FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,C,m,n),x)));
ISetDelayed(603,UnifyInertTrigFunction(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_),
    Condition(Times(Power(Plus(a,Times(b,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x))))),n),Plus(ASymbol,Times(C,Sqr($($s("§sin"),Plus(e,CPiHalf,Times(f,x))))))),FreeQ(List(a,b,c,d,e,f,ASymbol,C,m,n),x)));
ISetDelayed(604,UnifyInertTrigFunction(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_),x_),
    Condition(Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),n))),p),And(FreeQ(List(a,b,e,f,n,p),x),Not(And(EqQ(a,C0),IntegerQ(p))))));
ISetDelayed(605,UnifyInertTrigFunction(Times(Power(Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times(c_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_))),p_DEFAULT)),x_),
    Condition(Times(Power(Times(d,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),m),Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),Plus(e,CPiHalf,Times(f,x)))),n))),p)),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(And(EqQ(a,C0),IntegerQ(p))))));
  }
}
}