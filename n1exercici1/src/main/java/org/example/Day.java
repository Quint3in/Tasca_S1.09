package org.example;

public enum Day {
    Monday {
        @Override
        public boolean isLaborable() {
            return true;
        }
    },
    Tuesday {
        @Override
        public boolean isLaborable() {
            return true;
        }
    },
    Wednesday {
        @Override
        public boolean isLaborable() {
            return true;
        }
    },
    Thursday {
        @Override
        public boolean isLaborable() {
            return true;
        }
    },
    Friday {
        @Override
        public boolean isLaborable() {
            return true;
        }
    },
    Saturday {
        @Override
        public boolean isLaborable() {
            return false;
        }
    },
    Sunday {
        @Override
        public boolean isLaborable() {
            return false;
        }
    };

    public abstract boolean isLaborable();
}
