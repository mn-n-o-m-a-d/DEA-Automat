package org.fogl.automat;

import org.fogl.constants.DEAHelpers;
import org.fogl.constants.DEAStates;
import org.fogl.constants.DEATransitions;

public class DEAAutomat {

    public static boolean DEA(String input) {

        char state = DEAStates.STATE_START;
        // char transitions = DEATransitions.INPUT_0;

        for (char c : input.toCharArray()) {

            // state wo ich gerade bin
            switch (state) {

                case DEAStates.STATE_S -> {
                    // c was ich für einen input habe und wo ich hin kann
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_OpenBrack -> state = DEAStates.STATE_C;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_A -> {
                    switch (c) {
                        case DEATransitions.INPUT_Result -> state = DEAStates.STATE_B;
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_Plus -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Minus -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Multi -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Divid -> state = DEAStates.STATE_START;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_B -> {
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_Z;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_C -> {
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_D;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_D -> {
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_D;
                        case DEATransitions.INPUT_CloseBrack -> state = DEAStates.STATE_G;
                        case DEATransitions.INPUT_Plus -> state = DEAStates.STATE_E;
                        case DEATransitions.INPUT_Minus -> state = DEAStates.STATE_E;
                        case DEATransitions.INPUT_Multi -> state = DEAStates.STATE_E;
                        case DEATransitions.INPUT_Divid -> state = DEAStates.STATE_E;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_E -> {
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_F;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_F -> {
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_F;
                        case DEATransitions.INPUT_Plus -> state = DEAStates.STATE_C;
                        case DEATransitions.INPUT_Minus -> state = DEAStates.STATE_C;
                        case DEATransitions.INPUT_Multi -> state = DEAStates.STATE_C;
                        case DEATransitions.INPUT_Divid -> state = DEAStates.STATE_C;
                        case DEATransitions.INPUT_CloseBrack -> state = DEAStates.STATE_G;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_G -> {
                    switch (c) {
                        case DEATransitions.INPUT_Plus -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Minus -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Multi -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Divid -> state = DEAStates.STATE_START;
                        case DEATransitions.INPUT_Result -> state = DEAStates.STATE_B;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_Z -> {
                    switch (c) {
                        case DEATransitions.INPUT_0 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_1 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_2 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_3 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_4 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_5 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_6 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_7 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_8 -> state = DEAStates.STATE_Z;
                        case DEATransitions.INPUT_9 -> state = DEAStates.STATE_Z;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
            }
        }

        if (state == DEAStates.STATE_END) {
            System.out.println(DEAHelpers.ANSI_GREEN + "Die Eingabe war gültig! " + input + DEAHelpers.ANSI_GREEN);
        } else {
            System.out.println(DEAHelpers.ANSI_RED + "Die Eingabe war nicht gültig... " + input + DEAHelpers.ANSI_RED);
        }

        return state == DEAStates.STATE_END;
    }
}
