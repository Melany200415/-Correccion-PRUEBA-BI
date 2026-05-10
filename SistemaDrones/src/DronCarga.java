class DronCarga extends Dron {

    private double costoPorKg;

    public DronCarga() {
        codigo = "DC-000";
        modelo = "Carga";
        distanciaKm = 5;
        pesoPaquete = 2;
        horasVuelo = 1;
        costoBase = 6.0;
        costoPorKg = 1.5;
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete > 30) {
            System.out.println("Peso excede límite de dron carga");
            return false;
        }

        return true;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 0.7) + (pesoPaquete * costoPorKg);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n====== DRON CARGA ======");
        super.mostrarInformacion();
        System.out.println("Carga maxima : 30 kg");
    }
}
