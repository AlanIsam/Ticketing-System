public class Dataset {
  private String Name;
  private int Age;
  private String MemberID;
  private String TicketID;
  private String TicketType;
  private String GiftType;

  public Dataset() {
    this.Name = null;
    this.Age = 0;
    this.MemberID = null;
    this.TicketID = null;
    this.TicketType = null;
    this.GiftType = null;
  }

  public Dataset(String Name, int Age, String MemberID, String TicketID, String TicketType, String GiftType) {
    this.Name = Name;
    this.Age = Age;
    this.MemberID = MemberID;
    this.TicketID = TicketID;
    this.TicketType = TicketType;
    this.GiftType = GiftType;
  }

  // setters
  public void setName(String Name) {
    this.Name = Name;
  }

  public void setAge(int Age) {
    this.Age = Age;
  }

  public void setMemberID(String MemberID) {
    this.MemberID = MemberID;
  }

  public void setTicketID(String TicketID) {
    this.TicketID = TicketID;
  }

  public void setTicketType(String TicketType) {
    this.TicketType = TicketType;
  }

  public void setGiftType(String GiftType) {
    this.GiftType = GiftType;
  }

  // getters
  public String getName() {
    return Name;
  }

  public int getAge() {
    return Age;
  }

  public String getMemberID() {
    return MemberID;
  }

  public String getTicketID() {
    return TicketID;
  }

  public String getTicketType() {
    return TicketType;
  }

  public String getGiftType() {
    return GiftType;
  }

  // printer
  public String toString() {
    return ("\n Customer Name: " + Name +
        "\n Customer Age: " + Age +
        "\n Customer Member ID: " + MemberID +
        "\nCustomer Ticket ID: " + TicketID +
        "\nCustomer Ticket Type: " + TicketType +
        "\n Customer Gift: "+ GiftType);
  }

}