 class DronLiviano extends Dron {

        private double limiteHoras;

        public DronLiviano() {
            codigo = "DL-000";
            modelo = "Liviano";
            distanciaKm = 5;
            pesoPaquete = 2;
            horasVuelo = 1;
            costoBase = 3.0;
            limiteHoras = 2;
        }

        @Override
        public boolean validarDatos() {

            if (pesoPaquete > 5) {
                System.out.println("Peso excede límite de dron liviano");
                return false;
            }

            return true;
        }

        @Override
        public double calcularCostoEntrega() {
            return costoBase + (distanciaKm * 0.5) + (pesoPaquete * 0.8);
        }

        @Override
        public void mostrarInformacion() {

            System.out.println("\n====== DRON LIVIANO ======");
            super.mostrarInformacion();
            System.out.println("Carga maxima : 5 kg");
        }
    }
