package builderPattern;

import builderPattern.enums.Color;
import builderPattern.enums.MetalType;

public class Clothing {
    private String type;
    private String material;
    private Color color;
    private boolean modifications;
    private MetalType metalType;

    private Clothing(ClothingBuilder builder) {
        this.type = builder.type;
        this.material = builder.material;
        this.color = builder.color;
        this.modifications = builder.modifications;
        this.metalType = builder.metalType;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    public boolean isModifications() {
        return modifications;
    }

    public MetalType getMetalType() {
        return metalType;
    }

    public static class ClothingBuilder {
        private String type = "Dress";
        private String material = "Satin";
        private Color color = Color.WHITE;
        private boolean modifications = false;
        private MetalType metalType = MetalType.AQUAMARINE;

        public ClothingBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public ClothingBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public ClothingBuilder setColor(Color color) {
            this.color = color;
            return this;
        }

        public ClothingBuilder setModifications(boolean modifications) {
            this.modifications = modifications;
            return this;
        }

        public ClothingBuilder setMetalType(MetalType metalType) {
            this.metalType = metalType;
            return this;
        }

        public Clothing build() {
            return new Clothing(this);
        }
    }

}
