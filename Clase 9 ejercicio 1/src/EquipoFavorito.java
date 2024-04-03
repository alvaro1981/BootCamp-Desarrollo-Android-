public class EquipoFavorito {
   private int partidosGanados, partidosEmpatados , partidosPerdidos;
   private int puntosPartidosGanados, puntosPartidosEmpatados, puntosTotales;

   public EquipoFavorito(int partidosGanados,
                         int partidosEmpatados,
                         int partidosPerdidos) {
      this.partidosGanados    = partidosGanados;
      this.partidosEmpatados  = partidosEmpatados;
      this.partidosPerdidos   = partidosPerdidos;
      this.puntosPartidosGanados   =   partidosGanados * 3;
      this.puntosPartidosEmpatados = partidosEmpatados;
      this.puntosTotales = this.puntosPartidosGanados + this.puntosPartidosEmpatados;
   }

   public int getPuntosPartidosGanados() {
      return puntosPartidosGanados;
   }

   public int getPuntosPartidosEmpatados() {
      return puntosPartidosEmpatados;
   }

   public int getPartidosGanados() {
      return partidosGanados;
   }

   public int getPartidosEmpatados() {
      return partidosEmpatados;
   }

   public int getPartidosPerdidos() {
      return partidosPerdidos;
   }

   public int getPuntosTotales() {
      return puntosTotales;
   }

   public void setPartidosGanados(int partidosGanados) {
      this.partidosGanados = partidosGanados;
   }

   public void setPartidosEmpatados(int partidosEmpatados) {
      this.partidosEmpatados = partidosEmpatados;
   }

   public void setPartidosPerdidos(int partidosPerdidos) {
      this.partidosPerdidos = partidosPerdidos;
   }

   public void setPuntosPartidosGanados(int puntosPartidosGanados) {
      this.puntosPartidosGanados = puntosPartidosGanados;
   }

   public void setPuntosPartidosEmpatados(int puntosPartidosEmpatados) {
      this.puntosPartidosEmpatados = puntosPartidosEmpatados;
   }

   public void setPuntosTotales(int puntosTotales) {
      this.puntosTotales = puntosTotales;
   }
}
