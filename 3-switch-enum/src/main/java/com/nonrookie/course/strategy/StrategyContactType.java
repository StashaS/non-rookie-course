package com.nonrookie.course.strategy;

public enum StrategyContactType {

    DECLARANT {
        @Override
        public BaseDeclarant createDeclarant() {
            return new DefaultDeclarant();
        }
    },
    TRUSTEE {
        @Override
        public BaseDeclarant createDeclarant() {
            return new TrusteeDeclarant();
        }
    },
    LEGAL_REPRESENTATIVE {
        @Override
        public BaseDeclarant createDeclarant() {
            return new LegalRepresentativeDeclarant();
        }
    };

    public abstract BaseDeclarant createDeclarant();

}
