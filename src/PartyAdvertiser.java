public class PartyAdvertiser {

    Party party;

    protected PartyAdvertiser(Party party) {
        this.party = party;
    }

    public String advertiseParty() {
        return "Party at " + party.getLocation() + " for "
                + party.getEnterncePrice() + " USD!";
    }


}
