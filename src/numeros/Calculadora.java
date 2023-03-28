package numeros;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora(int a,int b) {
		a = 20;
		b = 10;
		num1 = a;
		num2 = b;
	}
	public int suma() {
		int result = num1+num2;
		return result;
	}
	public int resta() {
		int result = num1-num2;
		if (resta2())
			result=num1-num2;
		else
			result=num2-num1;
		return result;
	}
	public boolean resta2() {
		 if (num1>= num2)
			 return true;
		else
			 return false;
		 }
	public int multiplica() {
		int result = num1*num2;
		return result;
	}
	public int divide() {
		int result = num1/num2;
		return result;
	}
	public Integer divide2(){
		 if (num2==0) return null;
		 int resul =num1/num2;
		 return resul;
		 }
}
