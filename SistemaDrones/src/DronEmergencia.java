class DronEmergencia extends Dron {

    private double recargoUrgencia;

    public DronEmergencia() {
        codigo = "DE-000";
        modelo = "Emergencia";
        distanciaKm = 5;
        pesoPaquete = 2;
        horasVuelo = 1;
        costoBase = 8.0;
        recargoUrgencia = 10;
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete > 10) {
            System.out.println("Peso excede límite de dron emergencia");
            return false;
        }

        if (horasVuelo > 3) {
            System.out.println("Horas exceden límite permitido");
            return false;
        }

        return true;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 1.0) + recargoUrgencia;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n====== DRON EMERGENCIA ======");
        super.mostrarInformacion();
        System.out.println("Carga maxima : 10 kg");
    }
}