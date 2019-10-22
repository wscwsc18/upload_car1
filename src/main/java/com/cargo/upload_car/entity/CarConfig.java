package com.cargo.upload_car.entity;

import java.util.Date;
import java.util.Objects;

public class CarConfig extends BaseEntity {

    private static final long serialVersionUID = 6916880876093508997L;

    private Integer Id;
    private String SetOutProvince;
    private String SetOutCity;
    private String SetOutCounty;
    private String DestinationProvince;
    private String DestinationCity;
    private String DestCounty;
    private Date SendTime;
    private String InfoClass;
    private String Info;
    private String PhoneNumber;
    private Integer UserNumber;
    private String Source;
    private String Cargoinfoid;
    private String Username;
    private String CWeight;
    private String CType;
    private String TNum;
    private String TType;
    private String TLength;
    private String Price;
    private String Currlocal;
    private Byte Lan;
    private Byte Lat;
    private String Geocode;
    private Integer Repcount;
    private String Phone2;
    private String Phone3;
    private String shortPhone;
    private String usernameB;
    private String note;
    private String depart;
    private String agentID;
    private String midCity;
    private String contractCode;
    private Integer status;
    private Date Updatetime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSetOutProvince() {
        return SetOutProvince;
    }

    public void setSetOutProvince(String setOutProvince) {
        SetOutProvince = setOutProvince;
    }

    public String getSetOutCity() {
        return SetOutCity;
    }

    public void setSetOutCity(String setOutCity) {
        SetOutCity = setOutCity;
    }

    public String getSetOutCounty() {
        return SetOutCounty;
    }

    public void setSetOutCounty(String setOutCounty) {
        SetOutCounty = setOutCounty;
    }

    public String getDestinationProvince() {
        return DestinationProvince;
    }

    public void setDestinationProvince(String destinationProvince) {
        DestinationProvince = destinationProvince;
    }

    public String getDestinationCity() {
        return DestinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        DestinationCity = destinationCity;
    }

    public String getDestCounty() {
        return DestCounty;
    }

    public void setDestCounty(String destCounty) {
        DestCounty = destCounty;
    }

    public Date getSendTime() {
        return SendTime;
    }

    public void setSendTime(Date sendTime) {
        SendTime = sendTime;
    }

    public String getInfoClass() {
        return InfoClass;
    }

    public void setInfoClass(String infoClass) {
        InfoClass = infoClass;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Integer getUserNumber() {
        return UserNumber;
    }

    public void setUserNumber(Integer userNumber) {
        UserNumber = userNumber;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getCargoinfoid() {
        return Cargoinfoid;
    }

    public void setCargoinfoid(String cargoinfoid) {
        Cargoinfoid = cargoinfoid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getCWeight() {
        return CWeight;
    }

    public void setCWeight(String CWeight) {
        this.CWeight = CWeight;
    }

    public String getCType() {
        return CType;
    }

    public void setCType(String CType) {
        this.CType = CType;
    }

    public String getTNum() {
        return TNum;
    }

    public void setTNum(String TNum) {
        this.TNum = TNum;
    }

    public String getTType() {
        return TType;
    }

    public void setTType(String TType) {
        this.TType = TType;
    }

    public String getTLength() {
        return TLength;
    }

    public void setTLength(String TLength) {
        this.TLength = TLength;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getCurrlocal() {
        return Currlocal;
    }

    public void setCurrlocal(String currlocal) {
        Currlocal = currlocal;
    }

    public Byte getLan() {
        return Lan;
    }

    public void setLan(Byte lan) {
        Lan = lan;
    }

    public Byte getLat() {
        return Lat;
    }

    public void setLat(Byte lat) {
        Lat = lat;
    }

    public String getGeocode() {
        return Geocode;
    }

    public void setGeocode(String geocode) {
        Geocode = geocode;
    }

    public Integer getRepcount() {
        return Repcount;
    }

    public void setRepcount(Integer repcount) {
        Repcount = repcount;
    }

    public String getPhone2() {
        return Phone2;
    }

    public void setPhone2(String phone2) {
        Phone2 = phone2;
    }

    public String getPhone3() {
        return Phone3;
    }

    public void setPhone3(String phone3) {
        Phone3 = phone3;
    }

    public String getShortPhone() {
        return shortPhone;
    }

    public void setShortPhone(String shortPhone) {
        this.shortPhone = shortPhone;
    }

    public String getUsernameB() {
        return usernameB;
    }

    public void setUsernameB(String usernameB) {
        this.usernameB = usernameB;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getMidCity() {
        return midCity;
    }

    public void setMidCity(String midCity) {
        this.midCity = midCity;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return Updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        Updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "CarConfig{" +
                "Id=" + Id +
                ", SetOutProvince='" + SetOutProvince + '\'' +
                ", SetOutCity='" + SetOutCity + '\'' +
                ", SetOutCounty='" + SetOutCounty + '\'' +
                ", DestinationProvince='" + DestinationProvince + '\'' +
                ", DestinationCity='" + DestinationCity + '\'' +
                ", DestCounty='" + DestCounty + '\'' +
                ", SendTime=" + SendTime +
                ", InfoClass='" + InfoClass + '\'' +
                ", Info='" + Info + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", UserNumber=" + UserNumber +
                ", Source='" + Source + '\'' +
                ", Cargoinfoid='" + Cargoinfoid + '\'' +
                ", Username='" + Username + '\'' +
                ", CWeight='" + CWeight + '\'' +
                ", CType='" + CType + '\'' +
                ", TNum='" + TNum + '\'' +
                ", TType='" + TType + '\'' +
                ", TLength='" + TLength + '\'' +
                ", Price='" + Price + '\'' +
                ", Currlocal='" + Currlocal + '\'' +
                ", Lan=" + Lan +
                ", Lat=" + Lat +
                ", Geocode='" + Geocode + '\'' +
                ", Repcount=" + Repcount +
                ", Phone2='" + Phone2 + '\'' +
                ", Phone3='" + Phone3 + '\'' +
                ", shortPhone='" + shortPhone + '\'' +
                ", usernameB='" + usernameB + '\'' +
                ", note='" + note + '\'' +
                ", depart='" + depart + '\'' +
                ", agentID='" + agentID + '\'' +
                ", midCity='" + midCity + '\'' +
                ", contractCode='" + contractCode + '\'' +
                ", status=" + status +
                ", Updatetime=" + Updatetime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarConfig carConfig = (CarConfig) o;
        return Objects.equals(Id, carConfig.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
