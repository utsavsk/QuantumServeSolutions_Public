package com.quantumserve;

import java.util.List;

public class ValueProposition {
    private record Highlight(String focus, String outcome) {}

    public static void main(String[] args) {
        List<Highlight> highlights = List.of(
            new Highlight("Accuracy", "Deliver 99%+ error-free invoices through disciplined validation."),
            new Highlight("Velocity", "Turn invoices around within T+2 days to accelerate cash flow."),
            new Highlight("Insight", "Provide dashboards and analytics that reveal billing trends and risks.")
        );

        System.out.println("Quantum Serve Solutions | Billing Excellence Highlights\n");
        highlights.forEach(highlight ->
            System.out.printf("%-10s : %s%n", highlight.focus(), highlight.outcome())
        );
    }
}
