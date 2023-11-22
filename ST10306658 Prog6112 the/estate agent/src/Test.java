import estate.agent.EstateAgent;
import junit.jupiter.api.Test;

class TestEstateAgent {
    @Test
    
               // test the SAles
       void testEstateAgentSales() {
        EstateAgent estateAgent = new EstateAgent();
        double[] propertySales = {800000, 1500000, 2000000};
        double totalSales = estateAgent.estateAgentSales(propertySales);
        assertEquals(4300000, totalSales);
    }

    @Test
            // test the commission
    void testEstateAgentCommission() {
        EstateAgent estateAgent = new EstateAgent();
        double commission = estateAgent.estateAgentCommission(4300000);
        assertEquals(86000, commission);
    }

    @Test
            // test the top estate 
    void testTopEstateAgent() {
        EstateAgent estateAgent = new EstateAgent();
        double[] totalSales = {4300000, 3800000};
        int topAgentIndex = estateAgent.TopAgent(totalSales);
        assertEquals(0, topAgentIndex);
    }
}
    

