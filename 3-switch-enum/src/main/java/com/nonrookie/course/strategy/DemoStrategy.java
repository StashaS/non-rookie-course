package com.nonrookie.course.strategy;

import com.nonrookie.course.enum_example.SimpleContactType;

public class DemoStrategy {

    public static void demonstration() {
        System.out.println("STRATEGY");

        // switch strategy
        BaseDeclarant declarant = createDeclarant(SimpleContactType.DECLARANT);

        // enum strategy
        BaseDeclarant declarant1 = StrategyContactType.DECLARANT.createDeclarant();
    }

    private static BaseDeclarant createDeclarant(SimpleContactType contact){
        return switch (contact){
            case TRUSTEE -> new TrusteeDeclarant();
            case LEGAL_REPRESENTATIVE -> new LegalRepresentativeDeclarant();
            default -> new DefaultDeclarant();
        };
    }

}
