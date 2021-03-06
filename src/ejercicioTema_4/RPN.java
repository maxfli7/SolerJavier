package ejercicioTema_4;

import ejercicioTema_4.NodoPila;

public class RPN {
		
		public void pushPila(double nuevo_dato) {
			
			NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
			
			arriba = nuevo_nodo;
		}
		
		public double popPila() {
			
			double dato_arriba = arriba.dato;
			
			arriba = arriba.abajo;
			
			return dato_arriba;
		}
		
		public RPN(String commando) {
			
			arriba = null;

			this.commando = commando;

		}
		
		public double resultado() {
			
			
			if(arriba != null) {
					
				throw new IllegalArgumentException("error");
				
				
			
			}else {
				
				numerosOperacion();
				
				double val = popPila();
				
				return val;
				
			}

			
			
			}	

		private void numerosOperacion( ) {

			double a, b;

			int j;

			for(int i = 0; i < commando.length( ); i++) {

				// si es un digito

				if(Character.isDigit(commando.charAt(i))) {

					double numero;

					// obtener un string a partir del numero

					String temp = "";

					for(j = 0; (j < 100) && (Character.isDigit(commando.charAt(i)) || (commando.charAt(i) == '.')); j++, i++) {

						temp = temp + String.valueOf(commando.charAt(i));

					}

					// convertir a double y a�adir a la pila

					numero = Double.parseDouble(temp);

					pushPila(numero);

				} else {
					
					Calculos(i);
					
				}

			}

		}
		
		private void Calculos(int i) {
			
			double a, b;
			
			if(commando.charAt(i) == '+') {
				
				b = popPila( );
				a = popPila( );
				pushPila(a + b);
				
			} else if(commando.charAt(i) == '-') {
				
				b = popPila( );
				a = popPila( );
				pushPila(a - b);
				
			} else if(commando.charAt(i) == '*') {
				
				b = popPila( );
				a = popPila( );
				pushPila(a * b);
				
			} else if(commando.charAt(i) == '/') {
				
				b = popPila( );
				a = popPila( );
				pushPila(a / b);
				
			}else if(commando.charAt(i) == '^') {
				
				b = popPila( );
				a = popPila( );
				pushPila(Math.pow(a, b));
				
			}else if(commando.charAt(i) == '%') {
				
				b = popPila( );
				a = popPila( );
				pushPila(a%b);
				
			} else if(commando.charAt(i) != ' ') {
				
				throw new IllegalArgumentException( );
				
			}
				
		}

		private String commando;

		private NodoPila arriba;
}