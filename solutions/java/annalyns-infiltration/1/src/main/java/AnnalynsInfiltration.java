class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake && !prisonerIsAwake) {
            return false;
        }

        if (!archerIsAwake && prisonerIsAwake) {
            return true;
        }

        if (!archerIsAwake && !prisonerIsAwake) {
            return false;
        }

        return !(archerIsAwake && prisonerIsAwake);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if ((knightIsAwake && archerIsAwake && prisonerIsAwake) && (petDogIsPresent || !petDogIsPresent)) {
            return false;
        }

        if ((!knightIsAwake && !archerIsAwake && !prisonerIsAwake) && petDogIsPresent) {
            return true;
        }

        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake && !petDogIsPresent) {
            return false;
        }

        if (archerIsAwake || (knightIsAwake && !petDogIsPresent)) {
            return false;
        }

        if (knightIsAwake) {
            return true;
        }
        

        return true;
    }
}
