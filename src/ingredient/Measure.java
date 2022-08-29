package ingredient;

public enum Measure {
    GRAM("g.") {
        public double ratioOfConversion(Measure measure) throws Exception {
            Measure.validateParameter(measure);
            double returnValue = 0d;
            switch (measure) {
                case KILOGRAM,LITER: {
                    returnValue = 1000d;
                    break;
                }
                case GRAM,PIECE,MILLILITER: {
                    returnValue = 1d;
                    break;
                }
            }
            return returnValue;
        }
    },
    KILOGRAM("kg.") {
        public double ratioOfConversion(Measure measure) throws Exception {
            Measure.validateParameter(measure);
            double returnValue = 0d;
            switch (measure) {
                case KILOGRAM,PIECE,LITER: {
                    returnValue = 1d;
                    break;
                }
                case GRAM,MILLILITER: {
                    returnValue = 0.001d;
                    break;
                }
            }
            return returnValue;
        }
    },
    LITER("l.") {
        public double ratioOfConversion(Measure measure) throws Exception {
            Measure.validateParameter(measure);
            double returnValue = 0d;
            switch (measure) {
                case KILOGRAM,PIECE,LITER: {
                    returnValue = 1d;
                    break;
                }
                case GRAM,MILLILITER: {
                    returnValue = 0.001d;
                    break;
                }
            }
            return returnValue;
        }
    },
    PIECE("p.") {
                public double ratioOfConversion(Measure measure) throws Exception {
                    Measure.validateParameter(measure);
                    return 1d;
                }
            },    //штуки
    MILLILITER("ml.") {
        public double ratioOfConversion(Measure measure) throws Exception {
            Measure.validateParameter(measure);
            double returnValue = 0d;
            switch (measure) {
                case KILOGRAM,LITER: {
                    returnValue = 1000d;
                    break;
                }
                case GRAM,PIECE,MILLILITER: {
                    returnValue = 1d;
                    break;
                }
            }
            return returnValue;
        }
    };

    final String name;

    Measure(String name) {
        this.name = name;
    }

    private static void validateParameter(Measure measure) throws Exception {
        if (measure == null) {
            throw new Exception("The measure to which the current measure will be converted is null.");
        }
    }

    //Метод принимает параметр measure - объект перечисления Measure, к которой будет конвертироваться текущая мера ингридиента.
    //Метод возвращает коэффициент корвертации между текущей мерой ингридиента и мерой, переданой в параметре.
    public abstract double ratioOfConversion(Measure measure) throws Exception;
}
