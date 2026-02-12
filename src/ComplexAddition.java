import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    Complex(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    static Complex add(Complex c1,Complex c2){
        int newReal=c1.real+c2.real;
        int newImag=c1.imaginary+c2.imaginary;
        return new Complex(newReal, newImag);
    }
    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)
}

public class ComplexAddition { 
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int real1=sc.nextInt();
            int imag1=sc.nextInt();

            int real2=sc.nextInt();
            int imag2=sc.nextInt();
            
            Complex c1=new Complex(real1, imag1);
            Complex c2=new Complex(real2,imag2);

            Complex result=Complex.add(c1, c2);

            System.out.println(result.real +" + " +result.imaginary + "i");

        }
    
        // TODO: Read real1, imag1
        // TODO: Read real2, imag2
        
        // TODO: Create two Complex objects
        
        // TODO: Add them
        
        // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")
    
}
