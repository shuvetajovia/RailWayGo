class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargo) {
        // ❌ Unsafe rule
        if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Petroleum cannot be assigned to Rectangular bogie");
        }
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{type='" + type + "', cargo='" + cargo + "'}";
    }
}