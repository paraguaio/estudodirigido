*
 * 
 */
package estudodirigido;


public class Exe01 
{
        public String nome;
        private int peso;
        private Double altura;
        double CalcularIMC;

        public String getNome() 
        {
            return nome;
        }

        public int getPeso() 
        {
            return peso;
        }

        public void setPeso(int peso) 
        {
            this.peso = peso;
        }

        public Double getAltura() 
        {
            return altura;
        }

        public void setAltura(Double altura) 
        {
            this.altura = altura;
        }
        public Double getCalcularIMC() 
        {
            return (this.peso / (this.altura * this.altura));
        }

    double CalcularIMC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
