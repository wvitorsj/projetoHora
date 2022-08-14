package core;

public class Time {
		
		private int hora;
		private int minuto;
		private int segundo;
		public int getHora() {
			return hora;
		}
			
		
		public Time(int hora, int minuto, int segundo) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
		
		public Time(int hora, int minuto) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = 0;
		}
		
		public Time(int hora) {
			this.hora = hora;
			this.minuto = 0;
			this.segundo = 0;
		}


		public void setHora(int hora) {
			this.hora = hora;
		}
		public int getMinuto() {
			return minuto;
		}
		public void setMinuto(int minuto) {
			this.minuto = minuto;
		}
		public int getSegundo() {
			return segundo;
		}
		public void setSegundo(int segundo) {
			this.segundo = segundo;
		}
		
		/*AQUI TEREMOS UMA SOBRECARGA - QUANDO TEMOS VÁRIAS DEFINIÇÕES DO MESMO 
			NOME DE MÉTODO DENTRO DA MESMA CLASSE*/
		public void setTime(int hora, int minuto, int segundo){
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
		
		//SOBRECARGA - MESMA DEFICIÇÃO DO MÉTODO ACIMA MUDANDO A LISTA DE PARÂMETROS
		public void setTime(int hora, int minuto){
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = 0;
		}
		
		//SOBRECARGA - MESMA DEFICIÇÃO DOS MÉTODOS ACIMA MUDANDO A LISTA DE PARÂMETROS
		public void setTime(int hora){
			this.hora = hora;
			this.minuto = 0;
			this.segundo = 0;
		}
		public String exibirHoraUniversal() {
			System.out.println("-----Hora Universal-----");
			return formatarHora(hora) + ":" + formatarHora(this.minuto) + ":" + formatarHora(this.segundo);
		}
		
		public String exibirHoraPadrao() {
			/* 4 casos
			 *  0h - 12AM
			 *  12h - 12PM
			 * 01-11 - HORA AM
			 * 13-23 - (HORA - 12)PM  
			 */
			
			System.out.println("-----Hora Padrão-----");
			String sufixo;
			String horaPadrao;
			if(hora == 0) {
				horaPadrao = String.valueOf(12);
				sufixo = "am";
			}
			else if(hora == 12) {
				horaPadrao = String.valueOf(12);
				sufixo = "pm";
				
			}
			else if(hora > 0 && hora < 12) {
				horaPadrao = String.valueOf(formatarHora(hora));
				sufixo = "am";
				
			}
			else {
				horaPadrao = String.valueOf(formatarHora(hora - 12));
				sufixo = "pm";
			}			
			return horaPadrao + ":" + formatarHora(this.minuto) + ":" + formatarHora(this.segundo) + sufixo;		
			
		}
		public String formatarHora(int num) {
			if(num < 10 ) {
				return "0" + num;
			}
			return String.valueOf(num);
		}
		
		
}
