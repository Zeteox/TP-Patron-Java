public class CommandeValidationFacade {
    public static void validateCommand() {
        UserVerificationService.verify();
        IngredientsVerificationService.verify();
        PrepTimeVerificationService.verify();
        DeliveryVerificationService.verify();
        AddressVerificationService.verify();
        System.out.println("\nCommand completed !!!!!");
    }
}
