package templateMethod;

public class ServiceTest {

    public static void main(String[] args) {

        // preparing BigMac
        BigMacService bigmac = new BigMacService();
        bigmac.prepareBigMac();

        // preparing McChicken
        McChickenService mcChickenService = new McChickenService();
        mcChickenService.prepareMcChicken();
    }
}
