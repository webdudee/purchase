
package com.ai1tutorial.json.employee.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The Rates Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AED",
    "AFN",
    "ALL",
    "AMD",
    "ANG",
    "AOA",
    "ARS",
    "AUD",
    "AWG",
    "AZN",
    "BAM",
    "BBD",
    "BDT",
    "BGN",
    "BHD",
    "BIF",
    "BMD",
    "BND",
    "BOB",
    "BRL",
    "BSD",
    "BTC",
    "BTN",
    "BWP",
    "BYN",
    "BYR",
    "BZD",
    "CAD",
    "CDF",
    "CHF",
    "CLF",
    "CLP",
    "CNY",
    "COP",
    "CRC",
    "CUC",
    "CUP",
    "CVE",
    "CZK",
    "DJF",
    "DKK",
    "DOP",
    "DZD",
    "EGP",
    "ERN",
    "ETB",
    "EUR",
    "FJD",
    "FKP",
    "GBP",
    "GEL",
    "GGP",
    "GHS",
    "GIP",
    "GMD",
    "GNF",
    "GTQ",
    "GYD",
    "HKD",
    "HNL",
    "HRK",
    "HTG",
    "HUF",
    "IDR",
    "ILS",
    "IMP",
    "INR",
    "IQD",
    "IRR",
    "ISK",
    "JEP",
    "JMD",
    "JOD",
    "JPY",
    "KES",
    "KGS",
    "KHR",
    "KMF",
    "KPW",
    "KRW",
    "KWD",
    "KYD",
    "KZT",
    "LAK",
    "LBP",
    "LKR",
    "LRD",
    "LSL",
    "LTL",
    "LVL",
    "LYD",
    "MAD",
    "MDL",
    "MGA",
    "MKD",
    "MMK",
    "MNT",
    "MOP",
    "MRO",
    "MUR",
    "MVR",
    "MWK",
    "MXN",
    "MYR",
    "MZN",
    "NAD",
    "NGN",
    "NIO",
    "NOK",
    "NPR",
    "NZD",
    "OMR",
    "PAB",
    "PEN",
    "PGK",
    "PHP",
    "PKR",
    "PLN",
    "PYG",
    "QAR",
    "RON",
    "RSD",
    "RUB",
    "RWF",
    "SAR",
    "SBD",
    "SCR",
    "SDG",
    "SEK",
    "SGD",
    "SHP",
    "SLL",
    "SOS",
    "SRD",
    "STD",
    "SVC",
    "SYP",
    "SZL",
    "THB",
    "TJS",
    "TMT",
    "TND",
    "TOP",
    "TRY",
    "TTD",
    "TWD",
    "TZS",
    "UAH",
    "UGX",
    "USD",
    "UYU",
    "UZS",
    "VEF",
    "VND",
    "VUV",
    "WST",
    "XAF",
    "XAG",
    "XAU",
    "XCD",
    "XDR",
    "XOF",
    "XPF",
    "YER",
    "ZAR",
    "ZMK",
    "ZMW",
    "ZWL"
})
public class Rates {

    /**
     * The Aed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AED")
    private Double aED = 0.0D;
    /**
     * The Afn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AFN")
    private Double aFN = 0.0D;
    /**
     * The All Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ALL")
    private Double aLL = 0.0D;
    /**
     * The Amd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMD")
    private Double aMD = 0.0D;
    /**
     * The Ang Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ANG")
    private Double aNG = 0.0D;
    /**
     * The Aoa Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AOA")
    private Double aOA = 0.0D;
    /**
     * The Ars Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARS")
    private Double aRS = 0.0D;
    /**
     * The Aud Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUD")
    private Double aUD = 0.0D;
    /**
     * The Awg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AWG")
    private Double aWG = 0.0D;
    /**
     * The Azn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AZN")
    private Double aZN = 0.0D;
    /**
     * The Bam Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BAM")
    private Double bAM = 0.0D;
    /**
     * The Bbd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BBD")
    private Double bBD = 0.0D;
    /**
     * The Bdt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BDT")
    private Double bDT = 0.0D;
    /**
     * The Bgn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BGN")
    private Double bGN = 0.0D;
    /**
     * The Bhd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BHD")
    private Double bHD = 0.0D;
    /**
     * The Bif Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIF")
    private Double bIF = 0.0D;
    /**
     * The Bmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BMD")
    private Double bMD = 0.0D;
    /**
     * The Bnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BND")
    private Double bND = 0.0D;
    /**
     * The Bob Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BOB")
    private Double bOB = 0.0D;
    /**
     * The Brl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BRL")
    private Double bRL = 0.0D;
    /**
     * The Bsd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BSD")
    private Double bSD = 0.0D;
    /**
     * The Btc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BTC")
    private Double bTC = 0.0D;
    /**
     * The Btn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BTN")
    private Double bTN = 0.0D;
    /**
     * The Bwp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BWP")
    private Double bWP = 0.0D;
    /**
     * The Byn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BYN")
    private Double bYN = 0.0D;
    /**
     * The Byr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BYR")
    private Double bYR = 0.0D;
    /**
     * The Bzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BZD")
    private Double bZD = 0.0D;
    /**
     * The Cad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CAD")
    private Double cAD = 0.0D;
    /**
     * The Cdf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CDF")
    private Double cDF = 0.0D;
    /**
     * The Chf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CHF")
    private Double cHF = 0.0D;
    /**
     * The Clf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CLF")
    private Double cLF = 0.0D;
    /**
     * The Clp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CLP")
    private Double cLP = 0.0D;
    /**
     * The Cny Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNY")
    private Double cNY = 0.0D;
    /**
     * The Cop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COP")
    private Double cOP = 0.0D;
    /**
     * The Crc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRC")
    private Double cRC = 0.0D;
    /**
     * The Cuc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUC")
    private Double cUC = 0.0D;
    /**
     * The Cup Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUP")
    private Double cUP = 0.0D;
    /**
     * The Cve Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE")
    private Double cVE = 0.0D;
    /**
     * The Czk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CZK")
    private Double cZK = 0.0D;
    /**
     * The Djf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DJF")
    private Double dJF = 0.0D;
    /**
     * The Dkk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DKK")
    private Double dKK = 0.0D;
    /**
     * The Dop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DOP")
    private Double dOP = 0.0D;
    /**
     * The Dzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DZD")
    private Double dZD = 0.0D;
    /**
     * The Egp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EGP")
    private Double eGP = 0.0D;
    /**
     * The Ern Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERN")
    private Double eRN = 0.0D;
    /**
     * The Etb Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ETB")
    private Double eTB = 0.0D;
    /**
     * The Eur Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EUR")
    private Integer eUR = 0;
    /**
     * The Fjd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FJD")
    private Double fJD = 0.0D;
    /**
     * The Fkp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FKP")
    private Double fKP = 0.0D;
    /**
     * The Gbp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GBP")
    private Double gBP = 0.0D;
    /**
     * The Gel Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GEL")
    private Double gEL = 0.0D;
    /**
     * The Ggp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GGP")
    private Double gGP = 0.0D;
    /**
     * The Ghs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GHS")
    private Double gHS = 0.0D;
    /**
     * The Gip Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GIP")
    private Double gIP = 0.0D;
    /**
     * The Gmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GMD")
    private Double gMD = 0.0D;
    /**
     * The Gnf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GNF")
    private Double gNF = 0.0D;
    /**
     * The Gtq Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GTQ")
    private Double gTQ = 0.0D;
    /**
     * The Gyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GYD")
    private Double gYD = 0.0D;
    /**
     * The Hkd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HKD")
    private Double hKD = 0.0D;
    /**
     * The Hnl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HNL")
    private Double hNL = 0.0D;
    /**
     * The Hrk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HRK")
    private Double hRK = 0.0D;
    /**
     * The Htg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HTG")
    private Double hTG = 0.0D;
    /**
     * The Huf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HUF")
    private Double hUF = 0.0D;
    /**
     * The Idr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IDR")
    private Double iDR = 0.0D;
    /**
     * The Ils Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILS")
    private Double iLS = 0.0D;
    /**
     * The Imp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IMP")
    private Double iMP = 0.0D;
    /**
     * The Inr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INR")
    private Double iNR = 0.0D;
    /**
     * The Iqd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IQD")
    private Double iQD = 0.0D;
    /**
     * The Irr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IRR")
    private Double iRR = 0.0D;
    /**
     * The Isk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISK")
    private Double iSK = 0.0D;
    /**
     * The Jep Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JEP")
    private Double jEP = 0.0D;
    /**
     * The Jmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JMD")
    private Double jMD = 0.0D;
    /**
     * The Jod Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JOD")
    private Double jOD = 0.0D;
    /**
     * The Jpy Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JPY")
    private Double jPY = 0.0D;
    /**
     * The Kes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KES")
    private Double kES = 0.0D;
    /**
     * The Kgs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KGS")
    private Double kGS = 0.0D;
    /**
     * The Khr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KHR")
    private Double kHR = 0.0D;
    /**
     * The Kmf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KMF")
    private Double kMF = 0.0D;
    /**
     * The Kpw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KPW")
    private Double kPW = 0.0D;
    /**
     * The Krw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KRW")
    private Double kRW = 0.0D;
    /**
     * The Kwd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KWD")
    private Double kWD = 0.0D;
    /**
     * The Kyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KYD")
    private Double kYD = 0.0D;
    /**
     * The Kzt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KZT")
    private Double kZT = 0.0D;
    /**
     * The Lak Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAK")
    private Double lAK = 0.0D;
    /**
     * The Lbp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LBP")
    private Double lBP = 0.0D;
    /**
     * The Lkr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LKR")
    private Double lKR = 0.0D;
    /**
     * The Lrd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LRD")
    private Double lRD = 0.0D;
    /**
     * The Lsl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LSL")
    private Double lSL = 0.0D;
    /**
     * The Ltl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LTL")
    private Double lTL = 0.0D;
    /**
     * The Lvl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LVL")
    private Double lVL = 0.0D;
    /**
     * The Lyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LYD")
    private Double lYD = 0.0D;
    /**
     * The Mad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MAD")
    private Double mAD = 0.0D;
    /**
     * The Mdl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MDL")
    private Double mDL = 0.0D;
    /**
     * The Mga Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MGA")
    private Double mGA = 0.0D;
    /**
     * The Mkd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MKD")
    private Double mKD = 0.0D;
    /**
     * The Mmk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MMK")
    private Double mMK = 0.0D;
    /**
     * The Mnt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MNT")
    private Double mNT = 0.0D;
    /**
     * The Mop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOP")
    private Double mOP = 0.0D;
    /**
     * The Mro Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRO")
    private Double mRO = 0.0D;
    /**
     * The Mur Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MUR")
    private Double mUR = 0.0D;
    /**
     * The Mvr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MVR")
    private Double mVR = 0.0D;
    /**
     * The Mwk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MWK")
    private Double mWK = 0.0D;
    /**
     * The Mxn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MXN")
    private Double mXN = 0.0D;
    /**
     * The Myr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MYR")
    private Double mYR = 0.0D;
    /**
     * The Mzn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MZN")
    private Double mZN = 0.0D;
    /**
     * The Nad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NAD")
    private Double nAD = 0.0D;
    /**
     * The Ngn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NGN")
    private Double nGN = 0.0D;
    /**
     * The Nio Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NIO")
    private Double nIO = 0.0D;
    /**
     * The Nok Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NOK")
    private Double nOK = 0.0D;
    /**
     * The Npr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NPR")
    private Double nPR = 0.0D;
    /**
     * The Nzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NZD")
    private Double nZD = 0.0D;
    /**
     * The Omr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("OMR")
    private Double oMR = 0.0D;
    /**
     * The Pab Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAB")
    private Double pAB = 0.0D;
    /**
     * The Pen Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEN")
    private Double pEN = 0.0D;
    /**
     * The Pgk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGK")
    private Double pGK = 0.0D;
    /**
     * The Php Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PHP")
    private Double pHP = 0.0D;
    /**
     * The Pkr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PKR")
    private Double pKR = 0.0D;
    /**
     * The Pln Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PLN")
    private Double pLN = 0.0D;
    /**
     * The Pyg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PYG")
    private Double pYG = 0.0D;
    /**
     * The Qar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("QAR")
    private Double qAR = 0.0D;
    /**
     * The Ron Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RON")
    private Double rON = 0.0D;
    /**
     * The Rsd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSD")
    private Double rSD = 0.0D;
    /**
     * The Rub Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RUB")
    private Double rUB = 0.0D;
    /**
     * The Rwf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RWF")
    private Double rWF = 0.0D;
    /**
     * The Sar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAR")
    private Double sAR = 0.0D;
    /**
     * The Sbd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SBD")
    private Double sBD = 0.0D;
    /**
     * The Scr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCR")
    private Double sCR = 0.0D;
    /**
     * The Sdg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SDG")
    private Double sDG = 0.0D;
    /**
     * The Sek Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEK")
    private Double sEK = 0.0D;
    /**
     * The Sgd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SGD")
    private Double sGD = 0.0D;
    /**
     * The Shp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SHP")
    private Double sHP = 0.0D;
    /**
     * The Sll Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SLL")
    private Double sLL = 0.0D;
    /**
     * The Sos Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SOS")
    private Double sOS = 0.0D;
    /**
     * The Srd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SRD")
    private Double sRD = 0.0D;
    /**
     * The Std Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STD")
    private Double sTD = 0.0D;
    /**
     * The Svc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SVC")
    private Double sVC = 0.0D;
    /**
     * The Syp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SYP")
    private Double sYP = 0.0D;
    /**
     * The Szl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SZL")
    private Double sZL = 0.0D;
    /**
     * The Thb Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("THB")
    private Double tHB = 0.0D;
    /**
     * The Tjs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TJS")
    private Double tJS = 0.0D;
    /**
     * The Tmt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TMT")
    private Double tMT = 0.0D;
    /**
     * The Tnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TND")
    private Double tND = 0.0D;
    /**
     * The Top Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TOP")
    private Double tOP = 0.0D;
    /**
     * The Try Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRY")
    private Double tRY = 0.0D;
    /**
     * The Ttd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TTD")
    private Double tTD = 0.0D;
    /**
     * The Twd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TWD")
    private Double tWD = 0.0D;
    /**
     * The Tzs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TZS")
    private Double tZS = 0.0D;
    /**
     * The Uah Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAH")
    private Double uAH = 0.0D;
    /**
     * The Ugx Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UGX")
    private Double uGX = 0.0D;
    /**
     * The Usd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USD")
    private Double uSD = 0.0D;
    /**
     * The Uyu Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UYU")
    private Double uYU = 0.0D;
    /**
     * The Uzs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UZS")
    private Double uZS = 0.0D;
    /**
     * The Vef Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VEF")
    private Double vEF = 0.0D;
    /**
     * The Vnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VND")
    private Double vND = 0.0D;
    /**
     * The Vuv Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VUV")
    private Double vUV = 0.0D;
    /**
     * The Wst Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WST")
    private Double wST = 0.0D;
    /**
     * The Xaf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAF")
    private Double xAF = 0.0D;
    /**
     * The Xag Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAG")
    private Double xAG = 0.0D;
    /**
     * The Xau Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAU")
    private Double xAU = 0.0D;
    /**
     * The Xcd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XCD")
    private Double xCD = 0.0D;
    /**
     * The Xdr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XDR")
    private Double xDR = 0.0D;
    /**
     * The Xof Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XOF")
    private Double xOF = 0.0D;
    /**
     * The Xpf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XPF")
    private Double xPF = 0.0D;
    /**
     * The Yer Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("YER")
    private Double yER = 0.0D;
    /**
     * The Zar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZAR")
    private Double zAR = 0.0D;
    /**
     * The Zmk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZMK")
    private Double zMK = 0.0D;
    /**
     * The Zmw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZMW")
    private Double zMW = 0.0D;
    /**
     * The Zwl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZWL")
    private Double zWL = 0.0D;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Aed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AED")
    public Double getAED() {
        return aED;
    }

    /**
     * The Aed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AED")
    public void setAED(Double aED) {
        this.aED = aED;
    }

    public Rates withAED(Double aED) {
        this.aED = aED;
        return this;
    }

    /**
     * The Afn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AFN")
    public Double getAFN() {
        return aFN;
    }

    /**
     * The Afn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AFN")
    public void setAFN(Double aFN) {
        this.aFN = aFN;
    }

    public Rates withAFN(Double aFN) {
        this.aFN = aFN;
        return this;
    }

    /**
     * The All Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ALL")
    public Double getALL() {
        return aLL;
    }

    /**
     * The All Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ALL")
    public void setALL(Double aLL) {
        this.aLL = aLL;
    }

    public Rates withALL(Double aLL) {
        this.aLL = aLL;
        return this;
    }

    /**
     * The Amd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMD")
    public Double getAMD() {
        return aMD;
    }

    /**
     * The Amd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMD")
    public void setAMD(Double aMD) {
        this.aMD = aMD;
    }

    public Rates withAMD(Double aMD) {
        this.aMD = aMD;
        return this;
    }

    /**
     * The Ang Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ANG")
    public Double getANG() {
        return aNG;
    }

    /**
     * The Ang Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ANG")
    public void setANG(Double aNG) {
        this.aNG = aNG;
    }

    public Rates withANG(Double aNG) {
        this.aNG = aNG;
        return this;
    }

    /**
     * The Aoa Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AOA")
    public Double getAOA() {
        return aOA;
    }

    /**
     * The Aoa Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AOA")
    public void setAOA(Double aOA) {
        this.aOA = aOA;
    }

    public Rates withAOA(Double aOA) {
        this.aOA = aOA;
        return this;
    }

    /**
     * The Ars Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARS")
    public Double getARS() {
        return aRS;
    }

    /**
     * The Ars Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARS")
    public void setARS(Double aRS) {
        this.aRS = aRS;
    }

    public Rates withARS(Double aRS) {
        this.aRS = aRS;
        return this;
    }

    /**
     * The Aud Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUD")
    public Double getAUD() {
        return aUD;
    }

    /**
     * The Aud Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUD")
    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Rates withAUD(Double aUD) {
        this.aUD = aUD;
        return this;
    }

    /**
     * The Awg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AWG")
    public Double getAWG() {
        return aWG;
    }

    /**
     * The Awg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AWG")
    public void setAWG(Double aWG) {
        this.aWG = aWG;
    }

    public Rates withAWG(Double aWG) {
        this.aWG = aWG;
        return this;
    }

    /**
     * The Azn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AZN")
    public Double getAZN() {
        return aZN;
    }

    /**
     * The Azn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AZN")
    public void setAZN(Double aZN) {
        this.aZN = aZN;
    }

    public Rates withAZN(Double aZN) {
        this.aZN = aZN;
        return this;
    }

    /**
     * The Bam Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BAM")
    public Double getBAM() {
        return bAM;
    }

    /**
     * The Bam Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BAM")
    public void setBAM(Double bAM) {
        this.bAM = bAM;
    }

    public Rates withBAM(Double bAM) {
        this.bAM = bAM;
        return this;
    }

    /**
     * The Bbd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BBD")
    public Double getBBD() {
        return bBD;
    }

    /**
     * The Bbd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BBD")
    public void setBBD(Double bBD) {
        this.bBD = bBD;
    }

    public Rates withBBD(Double bBD) {
        this.bBD = bBD;
        return this;
    }

    /**
     * The Bdt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BDT")
    public Double getBDT() {
        return bDT;
    }

    /**
     * The Bdt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BDT")
    public void setBDT(Double bDT) {
        this.bDT = bDT;
    }

    public Rates withBDT(Double bDT) {
        this.bDT = bDT;
        return this;
    }

    /**
     * The Bgn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BGN")
    public Double getBGN() {
        return bGN;
    }

    /**
     * The Bgn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BGN")
    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    public Rates withBGN(Double bGN) {
        this.bGN = bGN;
        return this;
    }

    /**
     * The Bhd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BHD")
    public Double getBHD() {
        return bHD;
    }

    /**
     * The Bhd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BHD")
    public void setBHD(Double bHD) {
        this.bHD = bHD;
    }

    public Rates withBHD(Double bHD) {
        this.bHD = bHD;
        return this;
    }

    /**
     * The Bif Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIF")
    public Double getBIF() {
        return bIF;
    }

    /**
     * The Bif Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIF")
    public void setBIF(Double bIF) {
        this.bIF = bIF;
    }

    public Rates withBIF(Double bIF) {
        this.bIF = bIF;
        return this;
    }

    /**
     * The Bmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BMD")
    public Double getBMD() {
        return bMD;
    }

    /**
     * The Bmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BMD")
    public void setBMD(Double bMD) {
        this.bMD = bMD;
    }

    public Rates withBMD(Double bMD) {
        this.bMD = bMD;
        return this;
    }

    /**
     * The Bnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BND")
    public Double getBND() {
        return bND;
    }

    /**
     * The Bnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BND")
    public void setBND(Double bND) {
        this.bND = bND;
    }

    public Rates withBND(Double bND) {
        this.bND = bND;
        return this;
    }

    /**
     * The Bob Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BOB")
    public Double getBOB() {
        return bOB;
    }

    /**
     * The Bob Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BOB")
    public void setBOB(Double bOB) {
        this.bOB = bOB;
    }

    public Rates withBOB(Double bOB) {
        this.bOB = bOB;
        return this;
    }

    /**
     * The Brl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BRL")
    public Double getBRL() {
        return bRL;
    }

    /**
     * The Brl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BRL")
    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    public Rates withBRL(Double bRL) {
        this.bRL = bRL;
        return this;
    }

    /**
     * The Bsd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BSD")
    public Double getBSD() {
        return bSD;
    }

    /**
     * The Bsd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BSD")
    public void setBSD(Double bSD) {
        this.bSD = bSD;
    }

    public Rates withBSD(Double bSD) {
        this.bSD = bSD;
        return this;
    }

    /**
     * The Btc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BTC")
    public Double getBTC() {
        return bTC;
    }

    /**
     * The Btc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BTC")
    public void setBTC(Double bTC) {
        this.bTC = bTC;
    }

    public Rates withBTC(Double bTC) {
        this.bTC = bTC;
        return this;
    }

    /**
     * The Btn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BTN")
    public Double getBTN() {
        return bTN;
    }

    /**
     * The Btn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BTN")
    public void setBTN(Double bTN) {
        this.bTN = bTN;
    }

    public Rates withBTN(Double bTN) {
        this.bTN = bTN;
        return this;
    }

    /**
     * The Bwp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BWP")
    public Double getBWP() {
        return bWP;
    }

    /**
     * The Bwp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BWP")
    public void setBWP(Double bWP) {
        this.bWP = bWP;
    }

    public Rates withBWP(Double bWP) {
        this.bWP = bWP;
        return this;
    }

    /**
     * The Byn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BYN")
    public Double getBYN() {
        return bYN;
    }

    /**
     * The Byn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BYN")
    public void setBYN(Double bYN) {
        this.bYN = bYN;
    }

    public Rates withBYN(Double bYN) {
        this.bYN = bYN;
        return this;
    }

    /**
     * The Byr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BYR")
    public Double getBYR() {
        return bYR;
    }

    /**
     * The Byr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BYR")
    public void setBYR(Double bYR) {
        this.bYR = bYR;
    }

    public Rates withBYR(Double bYR) {
        this.bYR = bYR;
        return this;
    }

    /**
     * The Bzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BZD")
    public Double getBZD() {
        return bZD;
    }

    /**
     * The Bzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BZD")
    public void setBZD(Double bZD) {
        this.bZD = bZD;
    }

    public Rates withBZD(Double bZD) {
        this.bZD = bZD;
        return this;
    }

    /**
     * The Cad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CAD")
    public Double getCAD() {
        return cAD;
    }

    /**
     * The Cad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CAD")
    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Rates withCAD(Double cAD) {
        this.cAD = cAD;
        return this;
    }

    /**
     * The Cdf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CDF")
    public Double getCDF() {
        return cDF;
    }

    /**
     * The Cdf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CDF")
    public void setCDF(Double cDF) {
        this.cDF = cDF;
    }

    public Rates withCDF(Double cDF) {
        this.cDF = cDF;
        return this;
    }

    /**
     * The Chf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CHF")
    public Double getCHF() {
        return cHF;
    }

    /**
     * The Chf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CHF")
    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Rates withCHF(Double cHF) {
        this.cHF = cHF;
        return this;
    }

    /**
     * The Clf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CLF")
    public Double getCLF() {
        return cLF;
    }

    /**
     * The Clf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CLF")
    public void setCLF(Double cLF) {
        this.cLF = cLF;
    }

    public Rates withCLF(Double cLF) {
        this.cLF = cLF;
        return this;
    }

    /**
     * The Clp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CLP")
    public Double getCLP() {
        return cLP;
    }

    /**
     * The Clp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CLP")
    public void setCLP(Double cLP) {
        this.cLP = cLP;
    }

    public Rates withCLP(Double cLP) {
        this.cLP = cLP;
        return this;
    }

    /**
     * The Cny Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNY")
    public Double getCNY() {
        return cNY;
    }

    /**
     * The Cny Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNY")
    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Rates withCNY(Double cNY) {
        this.cNY = cNY;
        return this;
    }

    /**
     * The Cop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COP")
    public Double getCOP() {
        return cOP;
    }

    /**
     * The Cop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COP")
    public void setCOP(Double cOP) {
        this.cOP = cOP;
    }

    public Rates withCOP(Double cOP) {
        this.cOP = cOP;
        return this;
    }

    /**
     * The Crc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRC")
    public Double getCRC() {
        return cRC;
    }

    /**
     * The Crc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRC")
    public void setCRC(Double cRC) {
        this.cRC = cRC;
    }

    public Rates withCRC(Double cRC) {
        this.cRC = cRC;
        return this;
    }

    /**
     * The Cuc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUC")
    public Double getCUC() {
        return cUC;
    }

    /**
     * The Cuc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUC")
    public void setCUC(Double cUC) {
        this.cUC = cUC;
    }

    public Rates withCUC(Double cUC) {
        this.cUC = cUC;
        return this;
    }

    /**
     * The Cup Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUP")
    public Double getCUP() {
        return cUP;
    }

    /**
     * The Cup Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUP")
    public void setCUP(Double cUP) {
        this.cUP = cUP;
    }

    public Rates withCUP(Double cUP) {
        this.cUP = cUP;
        return this;
    }

    /**
     * The Cve Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE")
    public Double getCVE() {
        return cVE;
    }

    /**
     * The Cve Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE")
    public void setCVE(Double cVE) {
        this.cVE = cVE;
    }

    public Rates withCVE(Double cVE) {
        this.cVE = cVE;
        return this;
    }

    /**
     * The Czk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CZK")
    public Double getCZK() {
        return cZK;
    }

    /**
     * The Czk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CZK")
    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    public Rates withCZK(Double cZK) {
        this.cZK = cZK;
        return this;
    }

    /**
     * The Djf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DJF")
    public Double getDJF() {
        return dJF;
    }

    /**
     * The Djf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DJF")
    public void setDJF(Double dJF) {
        this.dJF = dJF;
    }

    public Rates withDJF(Double dJF) {
        this.dJF = dJF;
        return this;
    }

    /**
     * The Dkk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DKK")
    public Double getDKK() {
        return dKK;
    }

    /**
     * The Dkk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DKK")
    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    public Rates withDKK(Double dKK) {
        this.dKK = dKK;
        return this;
    }

    /**
     * The Dop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DOP")
    public Double getDOP() {
        return dOP;
    }

    /**
     * The Dop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DOP")
    public void setDOP(Double dOP) {
        this.dOP = dOP;
    }

    public Rates withDOP(Double dOP) {
        this.dOP = dOP;
        return this;
    }

    /**
     * The Dzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DZD")
    public Double getDZD() {
        return dZD;
    }

    /**
     * The Dzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DZD")
    public void setDZD(Double dZD) {
        this.dZD = dZD;
    }

    public Rates withDZD(Double dZD) {
        this.dZD = dZD;
        return this;
    }

    /**
     * The Egp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EGP")
    public Double getEGP() {
        return eGP;
    }

    /**
     * The Egp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EGP")
    public void setEGP(Double eGP) {
        this.eGP = eGP;
    }

    public Rates withEGP(Double eGP) {
        this.eGP = eGP;
        return this;
    }

    /**
     * The Ern Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERN")
    public Double getERN() {
        return eRN;
    }

    /**
     * The Ern Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERN")
    public void setERN(Double eRN) {
        this.eRN = eRN;
    }

    public Rates withERN(Double eRN) {
        this.eRN = eRN;
        return this;
    }

    /**
     * The Etb Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ETB")
    public Double getETB() {
        return eTB;
    }

    /**
     * The Etb Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ETB")
    public void setETB(Double eTB) {
        this.eTB = eTB;
    }

    public Rates withETB(Double eTB) {
        this.eTB = eTB;
        return this;
    }

    /**
     * The Eur Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EUR")
    public Integer getEUR() {
        return eUR;
    }

    /**
     * The Eur Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EUR")
    public void setEUR(Integer eUR) {
        this.eUR = eUR;
    }

    public Rates withEUR(Integer eUR) {
        this.eUR = eUR;
        return this;
    }

    /**
     * The Fjd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FJD")
    public Double getFJD() {
        return fJD;
    }

    /**
     * The Fjd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FJD")
    public void setFJD(Double fJD) {
        this.fJD = fJD;
    }

    public Rates withFJD(Double fJD) {
        this.fJD = fJD;
        return this;
    }

    /**
     * The Fkp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FKP")
    public Double getFKP() {
        return fKP;
    }

    /**
     * The Fkp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FKP")
    public void setFKP(Double fKP) {
        this.fKP = fKP;
    }

    public Rates withFKP(Double fKP) {
        this.fKP = fKP;
        return this;
    }

    /**
     * The Gbp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GBP")
    public Double getGBP() {
        return gBP;
    }

    /**
     * The Gbp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GBP")
    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    public Rates withGBP(Double gBP) {
        this.gBP = gBP;
        return this;
    }

    /**
     * The Gel Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GEL")
    public Double getGEL() {
        return gEL;
    }

    /**
     * The Gel Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GEL")
    public void setGEL(Double gEL) {
        this.gEL = gEL;
    }

    public Rates withGEL(Double gEL) {
        this.gEL = gEL;
        return this;
    }

    /**
     * The Ggp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GGP")
    public Double getGGP() {
        return gGP;
    }

    /**
     * The Ggp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GGP")
    public void setGGP(Double gGP) {
        this.gGP = gGP;
    }

    public Rates withGGP(Double gGP) {
        this.gGP = gGP;
        return this;
    }

    /**
     * The Ghs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GHS")
    public Double getGHS() {
        return gHS;
    }

    /**
     * The Ghs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GHS")
    public void setGHS(Double gHS) {
        this.gHS = gHS;
    }

    public Rates withGHS(Double gHS) {
        this.gHS = gHS;
        return this;
    }

    /**
     * The Gip Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GIP")
    public Double getGIP() {
        return gIP;
    }

    /**
     * The Gip Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GIP")
    public void setGIP(Double gIP) {
        this.gIP = gIP;
    }

    public Rates withGIP(Double gIP) {
        this.gIP = gIP;
        return this;
    }

    /**
     * The Gmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GMD")
    public Double getGMD() {
        return gMD;
    }

    /**
     * The Gmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GMD")
    public void setGMD(Double gMD) {
        this.gMD = gMD;
    }

    public Rates withGMD(Double gMD) {
        this.gMD = gMD;
        return this;
    }

    /**
     * The Gnf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GNF")
    public Double getGNF() {
        return gNF;
    }

    /**
     * The Gnf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GNF")
    public void setGNF(Double gNF) {
        this.gNF = gNF;
    }

    public Rates withGNF(Double gNF) {
        this.gNF = gNF;
        return this;
    }

    /**
     * The Gtq Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GTQ")
    public Double getGTQ() {
        return gTQ;
    }

    /**
     * The Gtq Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GTQ")
    public void setGTQ(Double gTQ) {
        this.gTQ = gTQ;
    }

    public Rates withGTQ(Double gTQ) {
        this.gTQ = gTQ;
        return this;
    }

    /**
     * The Gyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GYD")
    public Double getGYD() {
        return gYD;
    }

    /**
     * The Gyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("GYD")
    public void setGYD(Double gYD) {
        this.gYD = gYD;
    }

    public Rates withGYD(Double gYD) {
        this.gYD = gYD;
        return this;
    }

    /**
     * The Hkd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HKD")
    public Double getHKD() {
        return hKD;
    }

    /**
     * The Hkd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HKD")
    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Rates withHKD(Double hKD) {
        this.hKD = hKD;
        return this;
    }

    /**
     * The Hnl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HNL")
    public Double getHNL() {
        return hNL;
    }

    /**
     * The Hnl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HNL")
    public void setHNL(Double hNL) {
        this.hNL = hNL;
    }

    public Rates withHNL(Double hNL) {
        this.hNL = hNL;
        return this;
    }

    /**
     * The Hrk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HRK")
    public Double getHRK() {
        return hRK;
    }

    /**
     * The Hrk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HRK")
    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    public Rates withHRK(Double hRK) {
        this.hRK = hRK;
        return this;
    }

    /**
     * The Htg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HTG")
    public Double getHTG() {
        return hTG;
    }

    /**
     * The Htg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HTG")
    public void setHTG(Double hTG) {
        this.hTG = hTG;
    }

    public Rates withHTG(Double hTG) {
        this.hTG = hTG;
        return this;
    }

    /**
     * The Huf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HUF")
    public Double getHUF() {
        return hUF;
    }

    /**
     * The Huf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HUF")
    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    public Rates withHUF(Double hUF) {
        this.hUF = hUF;
        return this;
    }

    /**
     * The Idr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IDR")
    public Double getIDR() {
        return iDR;
    }

    /**
     * The Idr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IDR")
    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    public Rates withIDR(Double iDR) {
        this.iDR = iDR;
        return this;
    }

    /**
     * The Ils Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILS")
    public Double getILS() {
        return iLS;
    }

    /**
     * The Ils Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILS")
    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    public Rates withILS(Double iLS) {
        this.iLS = iLS;
        return this;
    }

    /**
     * The Imp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IMP")
    public Double getIMP() {
        return iMP;
    }

    /**
     * The Imp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IMP")
    public void setIMP(Double iMP) {
        this.iMP = iMP;
    }

    public Rates withIMP(Double iMP) {
        this.iMP = iMP;
        return this;
    }

    /**
     * The Inr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INR")
    public Double getINR() {
        return iNR;
    }

    /**
     * The Inr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INR")
    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Rates withINR(Double iNR) {
        this.iNR = iNR;
        return this;
    }

    /**
     * The Iqd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IQD")
    public Double getIQD() {
        return iQD;
    }

    /**
     * The Iqd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IQD")
    public void setIQD(Double iQD) {
        this.iQD = iQD;
    }

    public Rates withIQD(Double iQD) {
        this.iQD = iQD;
        return this;
    }

    /**
     * The Irr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IRR")
    public Double getIRR() {
        return iRR;
    }

    /**
     * The Irr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IRR")
    public void setIRR(Double iRR) {
        this.iRR = iRR;
    }

    public Rates withIRR(Double iRR) {
        this.iRR = iRR;
        return this;
    }

    /**
     * The Isk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISK")
    public Double getISK() {
        return iSK;
    }

    /**
     * The Isk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISK")
    public void setISK(Double iSK) {
        this.iSK = iSK;
    }

    public Rates withISK(Double iSK) {
        this.iSK = iSK;
        return this;
    }

    /**
     * The Jep Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JEP")
    public Double getJEP() {
        return jEP;
    }

    /**
     * The Jep Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JEP")
    public void setJEP(Double jEP) {
        this.jEP = jEP;
    }

    public Rates withJEP(Double jEP) {
        this.jEP = jEP;
        return this;
    }

    /**
     * The Jmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JMD")
    public Double getJMD() {
        return jMD;
    }

    /**
     * The Jmd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JMD")
    public void setJMD(Double jMD) {
        this.jMD = jMD;
    }

    public Rates withJMD(Double jMD) {
        this.jMD = jMD;
        return this;
    }

    /**
     * The Jod Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JOD")
    public Double getJOD() {
        return jOD;
    }

    /**
     * The Jod Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JOD")
    public void setJOD(Double jOD) {
        this.jOD = jOD;
    }

    public Rates withJOD(Double jOD) {
        this.jOD = jOD;
        return this;
    }

    /**
     * The Jpy Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JPY")
    public Double getJPY() {
        return jPY;
    }

    /**
     * The Jpy Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("JPY")
    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Rates withJPY(Double jPY) {
        this.jPY = jPY;
        return this;
    }

    /**
     * The Kes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KES")
    public Double getKES() {
        return kES;
    }

    /**
     * The Kes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KES")
    public void setKES(Double kES) {
        this.kES = kES;
    }

    public Rates withKES(Double kES) {
        this.kES = kES;
        return this;
    }

    /**
     * The Kgs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KGS")
    public Double getKGS() {
        return kGS;
    }

    /**
     * The Kgs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KGS")
    public void setKGS(Double kGS) {
        this.kGS = kGS;
    }

    public Rates withKGS(Double kGS) {
        this.kGS = kGS;
        return this;
    }

    /**
     * The Khr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KHR")
    public Double getKHR() {
        return kHR;
    }

    /**
     * The Khr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KHR")
    public void setKHR(Double kHR) {
        this.kHR = kHR;
    }

    public Rates withKHR(Double kHR) {
        this.kHR = kHR;
        return this;
    }

    /**
     * The Kmf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KMF")
    public Double getKMF() {
        return kMF;
    }

    /**
     * The Kmf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KMF")
    public void setKMF(Double kMF) {
        this.kMF = kMF;
    }

    public Rates withKMF(Double kMF) {
        this.kMF = kMF;
        return this;
    }

    /**
     * The Kpw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KPW")
    public Double getKPW() {
        return kPW;
    }

    /**
     * The Kpw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KPW")
    public void setKPW(Double kPW) {
        this.kPW = kPW;
    }

    public Rates withKPW(Double kPW) {
        this.kPW = kPW;
        return this;
    }

    /**
     * The Krw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KRW")
    public Double getKRW() {
        return kRW;
    }

    /**
     * The Krw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KRW")
    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    public Rates withKRW(Double kRW) {
        this.kRW = kRW;
        return this;
    }

    /**
     * The Kwd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KWD")
    public Double getKWD() {
        return kWD;
    }

    /**
     * The Kwd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KWD")
    public void setKWD(Double kWD) {
        this.kWD = kWD;
    }

    public Rates withKWD(Double kWD) {
        this.kWD = kWD;
        return this;
    }

    /**
     * The Kyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KYD")
    public Double getKYD() {
        return kYD;
    }

    /**
     * The Kyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KYD")
    public void setKYD(Double kYD) {
        this.kYD = kYD;
    }

    public Rates withKYD(Double kYD) {
        this.kYD = kYD;
        return this;
    }

    /**
     * The Kzt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KZT")
    public Double getKZT() {
        return kZT;
    }

    /**
     * The Kzt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KZT")
    public void setKZT(Double kZT) {
        this.kZT = kZT;
    }

    public Rates withKZT(Double kZT) {
        this.kZT = kZT;
        return this;
    }

    /**
     * The Lak Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAK")
    public Double getLAK() {
        return lAK;
    }

    /**
     * The Lak Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAK")
    public void setLAK(Double lAK) {
        this.lAK = lAK;
    }

    public Rates withLAK(Double lAK) {
        this.lAK = lAK;
        return this;
    }

    /**
     * The Lbp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LBP")
    public Double getLBP() {
        return lBP;
    }

    /**
     * The Lbp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LBP")
    public void setLBP(Double lBP) {
        this.lBP = lBP;
    }

    public Rates withLBP(Double lBP) {
        this.lBP = lBP;
        return this;
    }

    /**
     * The Lkr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LKR")
    public Double getLKR() {
        return lKR;
    }

    /**
     * The Lkr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LKR")
    public void setLKR(Double lKR) {
        this.lKR = lKR;
    }

    public Rates withLKR(Double lKR) {
        this.lKR = lKR;
        return this;
    }

    /**
     * The Lrd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LRD")
    public Double getLRD() {
        return lRD;
    }

    /**
     * The Lrd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LRD")
    public void setLRD(Double lRD) {
        this.lRD = lRD;
    }

    public Rates withLRD(Double lRD) {
        this.lRD = lRD;
        return this;
    }

    /**
     * The Lsl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LSL")
    public Double getLSL() {
        return lSL;
    }

    /**
     * The Lsl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LSL")
    public void setLSL(Double lSL) {
        this.lSL = lSL;
    }

    public Rates withLSL(Double lSL) {
        this.lSL = lSL;
        return this;
    }

    /**
     * The Ltl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LTL")
    public Double getLTL() {
        return lTL;
    }

    /**
     * The Ltl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LTL")
    public void setLTL(Double lTL) {
        this.lTL = lTL;
    }

    public Rates withLTL(Double lTL) {
        this.lTL = lTL;
        return this;
    }

    /**
     * The Lvl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LVL")
    public Double getLVL() {
        return lVL;
    }

    /**
     * The Lvl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LVL")
    public void setLVL(Double lVL) {
        this.lVL = lVL;
    }

    public Rates withLVL(Double lVL) {
        this.lVL = lVL;
        return this;
    }

    /**
     * The Lyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LYD")
    public Double getLYD() {
        return lYD;
    }

    /**
     * The Lyd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LYD")
    public void setLYD(Double lYD) {
        this.lYD = lYD;
    }

    public Rates withLYD(Double lYD) {
        this.lYD = lYD;
        return this;
    }

    /**
     * The Mad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MAD")
    public Double getMAD() {
        return mAD;
    }

    /**
     * The Mad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MAD")
    public void setMAD(Double mAD) {
        this.mAD = mAD;
    }

    public Rates withMAD(Double mAD) {
        this.mAD = mAD;
        return this;
    }

    /**
     * The Mdl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MDL")
    public Double getMDL() {
        return mDL;
    }

    /**
     * The Mdl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MDL")
    public void setMDL(Double mDL) {
        this.mDL = mDL;
    }

    public Rates withMDL(Double mDL) {
        this.mDL = mDL;
        return this;
    }

    /**
     * The Mga Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MGA")
    public Double getMGA() {
        return mGA;
    }

    /**
     * The Mga Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MGA")
    public void setMGA(Double mGA) {
        this.mGA = mGA;
    }

    public Rates withMGA(Double mGA) {
        this.mGA = mGA;
        return this;
    }

    /**
     * The Mkd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MKD")
    public Double getMKD() {
        return mKD;
    }

    /**
     * The Mkd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MKD")
    public void setMKD(Double mKD) {
        this.mKD = mKD;
    }

    public Rates withMKD(Double mKD) {
        this.mKD = mKD;
        return this;
    }

    /**
     * The Mmk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MMK")
    public Double getMMK() {
        return mMK;
    }

    /**
     * The Mmk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MMK")
    public void setMMK(Double mMK) {
        this.mMK = mMK;
    }

    public Rates withMMK(Double mMK) {
        this.mMK = mMK;
        return this;
    }

    /**
     * The Mnt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MNT")
    public Double getMNT() {
        return mNT;
    }

    /**
     * The Mnt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MNT")
    public void setMNT(Double mNT) {
        this.mNT = mNT;
    }

    public Rates withMNT(Double mNT) {
        this.mNT = mNT;
        return this;
    }

    /**
     * The Mop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOP")
    public Double getMOP() {
        return mOP;
    }

    /**
     * The Mop Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOP")
    public void setMOP(Double mOP) {
        this.mOP = mOP;
    }

    public Rates withMOP(Double mOP) {
        this.mOP = mOP;
        return this;
    }

    /**
     * The Mro Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRO")
    public Double getMRO() {
        return mRO;
    }

    /**
     * The Mro Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRO")
    public void setMRO(Double mRO) {
        this.mRO = mRO;
    }

    public Rates withMRO(Double mRO) {
        this.mRO = mRO;
        return this;
    }

    /**
     * The Mur Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MUR")
    public Double getMUR() {
        return mUR;
    }

    /**
     * The Mur Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MUR")
    public void setMUR(Double mUR) {
        this.mUR = mUR;
    }

    public Rates withMUR(Double mUR) {
        this.mUR = mUR;
        return this;
    }

    /**
     * The Mvr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MVR")
    public Double getMVR() {
        return mVR;
    }

    /**
     * The Mvr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MVR")
    public void setMVR(Double mVR) {
        this.mVR = mVR;
    }

    public Rates withMVR(Double mVR) {
        this.mVR = mVR;
        return this;
    }

    /**
     * The Mwk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MWK")
    public Double getMWK() {
        return mWK;
    }

    /**
     * The Mwk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MWK")
    public void setMWK(Double mWK) {
        this.mWK = mWK;
    }

    public Rates withMWK(Double mWK) {
        this.mWK = mWK;
        return this;
    }

    /**
     * The Mxn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MXN")
    public Double getMXN() {
        return mXN;
    }

    /**
     * The Mxn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MXN")
    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    public Rates withMXN(Double mXN) {
        this.mXN = mXN;
        return this;
    }

    /**
     * The Myr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MYR")
    public Double getMYR() {
        return mYR;
    }

    /**
     * The Myr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MYR")
    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    public Rates withMYR(Double mYR) {
        this.mYR = mYR;
        return this;
    }

    /**
     * The Mzn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MZN")
    public Double getMZN() {
        return mZN;
    }

    /**
     * The Mzn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MZN")
    public void setMZN(Double mZN) {
        this.mZN = mZN;
    }

    public Rates withMZN(Double mZN) {
        this.mZN = mZN;
        return this;
    }

    /**
     * The Nad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NAD")
    public Double getNAD() {
        return nAD;
    }

    /**
     * The Nad Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NAD")
    public void setNAD(Double nAD) {
        this.nAD = nAD;
    }

    public Rates withNAD(Double nAD) {
        this.nAD = nAD;
        return this;
    }

    /**
     * The Ngn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NGN")
    public Double getNGN() {
        return nGN;
    }

    /**
     * The Ngn Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NGN")
    public void setNGN(Double nGN) {
        this.nGN = nGN;
    }

    public Rates withNGN(Double nGN) {
        this.nGN = nGN;
        return this;
    }

    /**
     * The Nio Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NIO")
    public Double getNIO() {
        return nIO;
    }

    /**
     * The Nio Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NIO")
    public void setNIO(Double nIO) {
        this.nIO = nIO;
    }

    public Rates withNIO(Double nIO) {
        this.nIO = nIO;
        return this;
    }

    /**
     * The Nok Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NOK")
    public Double getNOK() {
        return nOK;
    }

    /**
     * The Nok Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NOK")
    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    public Rates withNOK(Double nOK) {
        this.nOK = nOK;
        return this;
    }

    /**
     * The Npr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NPR")
    public Double getNPR() {
        return nPR;
    }

    /**
     * The Npr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NPR")
    public void setNPR(Double nPR) {
        this.nPR = nPR;
    }

    public Rates withNPR(Double nPR) {
        this.nPR = nPR;
        return this;
    }

    /**
     * The Nzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NZD")
    public Double getNZD() {
        return nZD;
    }

    /**
     * The Nzd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NZD")
    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    public Rates withNZD(Double nZD) {
        this.nZD = nZD;
        return this;
    }

    /**
     * The Omr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("OMR")
    public Double getOMR() {
        return oMR;
    }

    /**
     * The Omr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("OMR")
    public void setOMR(Double oMR) {
        this.oMR = oMR;
    }

    public Rates withOMR(Double oMR) {
        this.oMR = oMR;
        return this;
    }

    /**
     * The Pab Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAB")
    public Double getPAB() {
        return pAB;
    }

    /**
     * The Pab Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAB")
    public void setPAB(Double pAB) {
        this.pAB = pAB;
    }

    public Rates withPAB(Double pAB) {
        this.pAB = pAB;
        return this;
    }

    /**
     * The Pen Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEN")
    public Double getPEN() {
        return pEN;
    }

    /**
     * The Pen Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEN")
    public void setPEN(Double pEN) {
        this.pEN = pEN;
    }

    public Rates withPEN(Double pEN) {
        this.pEN = pEN;
        return this;
    }

    /**
     * The Pgk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGK")
    public Double getPGK() {
        return pGK;
    }

    /**
     * The Pgk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGK")
    public void setPGK(Double pGK) {
        this.pGK = pGK;
    }

    public Rates withPGK(Double pGK) {
        this.pGK = pGK;
        return this;
    }

    /**
     * The Php Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PHP")
    public Double getPHP() {
        return pHP;
    }

    /**
     * The Php Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PHP")
    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    public Rates withPHP(Double pHP) {
        this.pHP = pHP;
        return this;
    }

    /**
     * The Pkr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PKR")
    public Double getPKR() {
        return pKR;
    }

    /**
     * The Pkr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PKR")
    public void setPKR(Double pKR) {
        this.pKR = pKR;
    }

    public Rates withPKR(Double pKR) {
        this.pKR = pKR;
        return this;
    }

    /**
     * The Pln Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PLN")
    public Double getPLN() {
        return pLN;
    }

    /**
     * The Pln Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PLN")
    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    public Rates withPLN(Double pLN) {
        this.pLN = pLN;
        return this;
    }

    /**
     * The Pyg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PYG")
    public Double getPYG() {
        return pYG;
    }

    /**
     * The Pyg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PYG")
    public void setPYG(Double pYG) {
        this.pYG = pYG;
    }

    public Rates withPYG(Double pYG) {
        this.pYG = pYG;
        return this;
    }

    /**
     * The Qar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("QAR")
    public Double getQAR() {
        return qAR;
    }

    /**
     * The Qar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("QAR")
    public void setQAR(Double qAR) {
        this.qAR = qAR;
    }

    public Rates withQAR(Double qAR) {
        this.qAR = qAR;
        return this;
    }

    /**
     * The Ron Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RON")
    public Double getRON() {
        return rON;
    }

    /**
     * The Ron Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RON")
    public void setRON(Double rON) {
        this.rON = rON;
    }

    public Rates withRON(Double rON) {
        this.rON = rON;
        return this;
    }

    /**
     * The Rsd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSD")
    public Double getRSD() {
        return rSD;
    }

    /**
     * The Rsd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSD")
    public void setRSD(Double rSD) {
        this.rSD = rSD;
    }

    public Rates withRSD(Double rSD) {
        this.rSD = rSD;
        return this;
    }

    /**
     * The Rub Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RUB")
    public Double getRUB() {
        return rUB;
    }

    /**
     * The Rub Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RUB")
    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Rates withRUB(Double rUB) {
        this.rUB = rUB;
        return this;
    }

    /**
     * The Rwf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RWF")
    public Double getRWF() {
        return rWF;
    }

    /**
     * The Rwf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RWF")
    public void setRWF(Double rWF) {
        this.rWF = rWF;
    }

    public Rates withRWF(Double rWF) {
        this.rWF = rWF;
        return this;
    }

    /**
     * The Sar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAR")
    public Double getSAR() {
        return sAR;
    }

    /**
     * The Sar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAR")
    public void setSAR(Double sAR) {
        this.sAR = sAR;
    }

    public Rates withSAR(Double sAR) {
        this.sAR = sAR;
        return this;
    }

    /**
     * The Sbd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SBD")
    public Double getSBD() {
        return sBD;
    }

    /**
     * The Sbd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SBD")
    public void setSBD(Double sBD) {
        this.sBD = sBD;
    }

    public Rates withSBD(Double sBD) {
        this.sBD = sBD;
        return this;
    }

    /**
     * The Scr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCR")
    public Double getSCR() {
        return sCR;
    }

    /**
     * The Scr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCR")
    public void setSCR(Double sCR) {
        this.sCR = sCR;
    }

    public Rates withSCR(Double sCR) {
        this.sCR = sCR;
        return this;
    }

    /**
     * The Sdg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SDG")
    public Double getSDG() {
        return sDG;
    }

    /**
     * The Sdg Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SDG")
    public void setSDG(Double sDG) {
        this.sDG = sDG;
    }

    public Rates withSDG(Double sDG) {
        this.sDG = sDG;
        return this;
    }

    /**
     * The Sek Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEK")
    public Double getSEK() {
        return sEK;
    }

    /**
     * The Sek Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEK")
    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    public Rates withSEK(Double sEK) {
        this.sEK = sEK;
        return this;
    }

    /**
     * The Sgd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SGD")
    public Double getSGD() {
        return sGD;
    }

    /**
     * The Sgd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SGD")
    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    public Rates withSGD(Double sGD) {
        this.sGD = sGD;
        return this;
    }

    /**
     * The Shp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SHP")
    public Double getSHP() {
        return sHP;
    }

    /**
     * The Shp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SHP")
    public void setSHP(Double sHP) {
        this.sHP = sHP;
    }

    public Rates withSHP(Double sHP) {
        this.sHP = sHP;
        return this;
    }

    /**
     * The Sll Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SLL")
    public Double getSLL() {
        return sLL;
    }

    /**
     * The Sll Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SLL")
    public void setSLL(Double sLL) {
        this.sLL = sLL;
    }

    public Rates withSLL(Double sLL) {
        this.sLL = sLL;
        return this;
    }

    /**
     * The Sos Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SOS")
    public Double getSOS() {
        return sOS;
    }

    /**
     * The Sos Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SOS")
    public void setSOS(Double sOS) {
        this.sOS = sOS;
    }

    public Rates withSOS(Double sOS) {
        this.sOS = sOS;
        return this;
    }

    /**
     * The Srd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SRD")
    public Double getSRD() {
        return sRD;
    }

    /**
     * The Srd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SRD")
    public void setSRD(Double sRD) {
        this.sRD = sRD;
    }

    public Rates withSRD(Double sRD) {
        this.sRD = sRD;
        return this;
    }

    /**
     * The Std Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STD")
    public Double getSTD() {
        return sTD;
    }

    /**
     * The Std Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STD")
    public void setSTD(Double sTD) {
        this.sTD = sTD;
    }

    public Rates withSTD(Double sTD) {
        this.sTD = sTD;
        return this;
    }

    /**
     * The Svc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SVC")
    public Double getSVC() {
        return sVC;
    }

    /**
     * The Svc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SVC")
    public void setSVC(Double sVC) {
        this.sVC = sVC;
    }

    public Rates withSVC(Double sVC) {
        this.sVC = sVC;
        return this;
    }

    /**
     * The Syp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SYP")
    public Double getSYP() {
        return sYP;
    }

    /**
     * The Syp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SYP")
    public void setSYP(Double sYP) {
        this.sYP = sYP;
    }

    public Rates withSYP(Double sYP) {
        this.sYP = sYP;
        return this;
    }

    /**
     * The Szl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SZL")
    public Double getSZL() {
        return sZL;
    }

    /**
     * The Szl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SZL")
    public void setSZL(Double sZL) {
        this.sZL = sZL;
    }

    public Rates withSZL(Double sZL) {
        this.sZL = sZL;
        return this;
    }

    /**
     * The Thb Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("THB")
    public Double getTHB() {
        return tHB;
    }

    /**
     * The Thb Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("THB")
    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    public Rates withTHB(Double tHB) {
        this.tHB = tHB;
        return this;
    }

    /**
     * The Tjs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TJS")
    public Double getTJS() {
        return tJS;
    }

    /**
     * The Tjs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TJS")
    public void setTJS(Double tJS) {
        this.tJS = tJS;
    }

    public Rates withTJS(Double tJS) {
        this.tJS = tJS;
        return this;
    }

    /**
     * The Tmt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TMT")
    public Double getTMT() {
        return tMT;
    }

    /**
     * The Tmt Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TMT")
    public void setTMT(Double tMT) {
        this.tMT = tMT;
    }

    public Rates withTMT(Double tMT) {
        this.tMT = tMT;
        return this;
    }

    /**
     * The Tnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TND")
    public Double getTND() {
        return tND;
    }

    /**
     * The Tnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TND")
    public void setTND(Double tND) {
        this.tND = tND;
    }

    public Rates withTND(Double tND) {
        this.tND = tND;
        return this;
    }

    /**
     * The Top Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TOP")
    public Double getTOP() {
        return tOP;
    }

    /**
     * The Top Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TOP")
    public void setTOP(Double tOP) {
        this.tOP = tOP;
    }

    public Rates withTOP(Double tOP) {
        this.tOP = tOP;
        return this;
    }

    /**
     * The Try Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRY")
    public Double getTRY() {
        return tRY;
    }

    /**
     * The Try Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRY")
    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    public Rates withTRY(Double tRY) {
        this.tRY = tRY;
        return this;
    }

    /**
     * The Ttd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TTD")
    public Double getTTD() {
        return tTD;
    }

    /**
     * The Ttd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TTD")
    public void setTTD(Double tTD) {
        this.tTD = tTD;
    }

    public Rates withTTD(Double tTD) {
        this.tTD = tTD;
        return this;
    }

    /**
     * The Twd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TWD")
    public Double getTWD() {
        return tWD;
    }

    /**
     * The Twd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TWD")
    public void setTWD(Double tWD) {
        this.tWD = tWD;
    }

    public Rates withTWD(Double tWD) {
        this.tWD = tWD;
        return this;
    }

    /**
     * The Tzs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TZS")
    public Double getTZS() {
        return tZS;
    }

    /**
     * The Tzs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TZS")
    public void setTZS(Double tZS) {
        this.tZS = tZS;
    }

    public Rates withTZS(Double tZS) {
        this.tZS = tZS;
        return this;
    }

    /**
     * The Uah Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAH")
    public Double getUAH() {
        return uAH;
    }

    /**
     * The Uah Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAH")
    public void setUAH(Double uAH) {
        this.uAH = uAH;
    }

    public Rates withUAH(Double uAH) {
        this.uAH = uAH;
        return this;
    }

    /**
     * The Ugx Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UGX")
    public Double getUGX() {
        return uGX;
    }

    /**
     * The Ugx Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UGX")
    public void setUGX(Double uGX) {
        this.uGX = uGX;
    }

    public Rates withUGX(Double uGX) {
        this.uGX = uGX;
        return this;
    }

    /**
     * The Usd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USD")
    public Double getUSD() {
        return uSD;
    }

    /**
     * The Usd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USD")
    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Rates withUSD(Double uSD) {
        this.uSD = uSD;
        return this;
    }

    /**
     * The Uyu Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UYU")
    public Double getUYU() {
        return uYU;
    }

    /**
     * The Uyu Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UYU")
    public void setUYU(Double uYU) {
        this.uYU = uYU;
    }

    public Rates withUYU(Double uYU) {
        this.uYU = uYU;
        return this;
    }

    /**
     * The Uzs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UZS")
    public Double getUZS() {
        return uZS;
    }

    /**
     * The Uzs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UZS")
    public void setUZS(Double uZS) {
        this.uZS = uZS;
    }

    public Rates withUZS(Double uZS) {
        this.uZS = uZS;
        return this;
    }

    /**
     * The Vef Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VEF")
    public Double getVEF() {
        return vEF;
    }

    /**
     * The Vef Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VEF")
    public void setVEF(Double vEF) {
        this.vEF = vEF;
    }

    public Rates withVEF(Double vEF) {
        this.vEF = vEF;
        return this;
    }

    /**
     * The Vnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VND")
    public Double getVND() {
        return vND;
    }

    /**
     * The Vnd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VND")
    public void setVND(Double vND) {
        this.vND = vND;
    }

    public Rates withVND(Double vND) {
        this.vND = vND;
        return this;
    }

    /**
     * The Vuv Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VUV")
    public Double getVUV() {
        return vUV;
    }

    /**
     * The Vuv Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VUV")
    public void setVUV(Double vUV) {
        this.vUV = vUV;
    }

    public Rates withVUV(Double vUV) {
        this.vUV = vUV;
        return this;
    }

    /**
     * The Wst Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WST")
    public Double getWST() {
        return wST;
    }

    /**
     * The Wst Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WST")
    public void setWST(Double wST) {
        this.wST = wST;
    }

    public Rates withWST(Double wST) {
        this.wST = wST;
        return this;
    }

    /**
     * The Xaf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAF")
    public Double getXAF() {
        return xAF;
    }

    /**
     * The Xaf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAF")
    public void setXAF(Double xAF) {
        this.xAF = xAF;
    }

    public Rates withXAF(Double xAF) {
        this.xAF = xAF;
        return this;
    }

    /**
     * The Xag Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAG")
    public Double getXAG() {
        return xAG;
    }

    /**
     * The Xag Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAG")
    public void setXAG(Double xAG) {
        this.xAG = xAG;
    }

    public Rates withXAG(Double xAG) {
        this.xAG = xAG;
        return this;
    }

    /**
     * The Xau Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAU")
    public Double getXAU() {
        return xAU;
    }

    /**
     * The Xau Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XAU")
    public void setXAU(Double xAU) {
        this.xAU = xAU;
    }

    public Rates withXAU(Double xAU) {
        this.xAU = xAU;
        return this;
    }

    /**
     * The Xcd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XCD")
    public Double getXCD() {
        return xCD;
    }

    /**
     * The Xcd Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XCD")
    public void setXCD(Double xCD) {
        this.xCD = xCD;
    }

    public Rates withXCD(Double xCD) {
        this.xCD = xCD;
        return this;
    }

    /**
     * The Xdr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XDR")
    public Double getXDR() {
        return xDR;
    }

    /**
     * The Xdr Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XDR")
    public void setXDR(Double xDR) {
        this.xDR = xDR;
    }

    public Rates withXDR(Double xDR) {
        this.xDR = xDR;
        return this;
    }

    /**
     * The Xof Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XOF")
    public Double getXOF() {
        return xOF;
    }

    /**
     * The Xof Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XOF")
    public void setXOF(Double xOF) {
        this.xOF = xOF;
    }

    public Rates withXOF(Double xOF) {
        this.xOF = xOF;
        return this;
    }

    /**
     * The Xpf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XPF")
    public Double getXPF() {
        return xPF;
    }

    /**
     * The Xpf Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("XPF")
    public void setXPF(Double xPF) {
        this.xPF = xPF;
    }

    public Rates withXPF(Double xPF) {
        this.xPF = xPF;
        return this;
    }

    /**
     * The Yer Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("YER")
    public Double getYER() {
        return yER;
    }

    /**
     * The Yer Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("YER")
    public void setYER(Double yER) {
        this.yER = yER;
    }

    public Rates withYER(Double yER) {
        this.yER = yER;
        return this;
    }

    /**
     * The Zar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZAR")
    public Double getZAR() {
        return zAR;
    }

    /**
     * The Zar Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZAR")
    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    public Rates withZAR(Double zAR) {
        this.zAR = zAR;
        return this;
    }

    /**
     * The Zmk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZMK")
    public Double getZMK() {
        return zMK;
    }

    /**
     * The Zmk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZMK")
    public void setZMK(Double zMK) {
        this.zMK = zMK;
    }

    public Rates withZMK(Double zMK) {
        this.zMK = zMK;
        return this;
    }

    /**
     * The Zmw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZMW")
    public Double getZMW() {
        return zMW;
    }

    /**
     * The Zmw Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZMW")
    public void setZMW(Double zMW) {
        this.zMW = zMW;
    }

    public Rates withZMW(Double zMW) {
        this.zMW = zMW;
        return this;
    }

    /**
     * The Zwl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZWL")
    public Double getZWL() {
        return zWL;
    }

    /**
     * The Zwl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ZWL")
    public void setZWL(Double zWL) {
        this.zWL = zWL;
    }

    public Rates withZWL(Double zWL) {
        this.zWL = zWL;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Rates withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aED).append(aFN).append(aLL).append(aMD).append(aNG).append(aOA).append(aRS).append(aUD).append(aWG).append(aZN).append(bAM).append(bBD).append(bDT).append(bGN).append(bHD).append(bIF).append(bMD).append(bND).append(bOB).append(bRL).append(bSD).append(bTC).append(bTN).append(bWP).append(bYN).append(bYR).append(bZD).append(cAD).append(cDF).append(cHF).append(cLF).append(cLP).append(cNY).append(cOP).append(cRC).append(cUC).append(cUP).append(cVE).append(cZK).append(dJF).append(dKK).append(dOP).append(dZD).append(eGP).append(eRN).append(eTB).append(eUR).append(fJD).append(fKP).append(gBP).append(gEL).append(gGP).append(gHS).append(gIP).append(gMD).append(gNF).append(gTQ).append(gYD).append(hKD).append(hNL).append(hRK).append(hTG).append(hUF).append(iDR).append(iLS).append(iMP).append(iNR).append(iQD).append(iRR).append(iSK).append(jEP).append(jMD).append(jOD).append(jPY).append(kES).append(kGS).append(kHR).append(kMF).append(kPW).append(kRW).append(kWD).append(kYD).append(kZT).append(lAK).append(lBP).append(lKR).append(lRD).append(lSL).append(lTL).append(lVL).append(lYD).append(mAD).append(mDL).append(mGA).append(mKD).append(mMK).append(mNT).append(mOP).append(mRO).append(mUR).append(mVR).append(mWK).append(mXN).append(mYR).append(mZN).append(nAD).append(nGN).append(nIO).append(nOK).append(nPR).append(nZD).append(oMR).append(pAB).append(pEN).append(pGK).append(pHP).append(pKR).append(pLN).append(pYG).append(qAR).append(rON).append(rSD).append(rUB).append(rWF).append(sAR).append(sBD).append(sCR).append(sDG).append(sEK).append(sGD).append(sHP).append(sLL).append(sOS).append(sRD).append(sTD).append(sVC).append(sYP).append(sZL).append(tHB).append(tJS).append(tMT).append(tND).append(tOP).append(tRY).append(tTD).append(tWD).append(tZS).append(uAH).append(uGX).append(uSD).append(uYU).append(uZS).append(vEF).append(vND).append(vUV).append(wST).append(xAF).append(xAG).append(xAU).append(xCD).append(xDR).append(xOF).append(xPF).append(yER).append(zAR).append(zMK).append(zMW).append(zWL).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rates) == false) {
            return false;
        }
        Rates rhs = ((Rates) other);
        return new EqualsBuilder().append(aED, rhs.aED).append(aFN, rhs.aFN).append(aLL, rhs.aLL).append(aMD, rhs.aMD).append(aNG, rhs.aNG).append(aOA, rhs.aOA).append(aRS, rhs.aRS).append(aUD, rhs.aUD).append(aWG, rhs.aWG).append(aZN, rhs.aZN).append(bAM, rhs.bAM).append(bBD, rhs.bBD).append(bDT, rhs.bDT).append(bGN, rhs.bGN).append(bHD, rhs.bHD).append(bIF, rhs.bIF).append(bMD, rhs.bMD).append(bND, rhs.bND).append(bOB, rhs.bOB).append(bRL, rhs.bRL).append(bSD, rhs.bSD).append(bTC, rhs.bTC).append(bTN, rhs.bTN).append(bWP, rhs.bWP).append(bYN, rhs.bYN).append(bYR, rhs.bYR).append(bZD, rhs.bZD).append(cAD, rhs.cAD).append(cDF, rhs.cDF).append(cHF, rhs.cHF).append(cLF, rhs.cLF).append(cLP, rhs.cLP).append(cNY, rhs.cNY).append(cOP, rhs.cOP).append(cRC, rhs.cRC).append(cUC, rhs.cUC).append(cUP, rhs.cUP).append(cVE, rhs.cVE).append(cZK, rhs.cZK).append(dJF, rhs.dJF).append(dKK, rhs.dKK).append(dOP, rhs.dOP).append(dZD, rhs.dZD).append(eGP, rhs.eGP).append(eRN, rhs.eRN).append(eTB, rhs.eTB).append(eUR, rhs.eUR).append(fJD, rhs.fJD).append(fKP, rhs.fKP).append(gBP, rhs.gBP).append(gEL, rhs.gEL).append(gGP, rhs.gGP).append(gHS, rhs.gHS).append(gIP, rhs.gIP).append(gMD, rhs.gMD).append(gNF, rhs.gNF).append(gTQ, rhs.gTQ).append(gYD, rhs.gYD).append(hKD, rhs.hKD).append(hNL, rhs.hNL).append(hRK, rhs.hRK).append(hTG, rhs.hTG).append(hUF, rhs.hUF).append(iDR, rhs.iDR).append(iLS, rhs.iLS).append(iMP, rhs.iMP).append(iNR, rhs.iNR).append(iQD, rhs.iQD).append(iRR, rhs.iRR).append(iSK, rhs.iSK).append(jEP, rhs.jEP).append(jMD, rhs.jMD).append(jOD, rhs.jOD).append(jPY, rhs.jPY).append(kES, rhs.kES).append(kGS, rhs.kGS).append(kHR, rhs.kHR).append(kMF, rhs.kMF).append(kPW, rhs.kPW).append(kRW, rhs.kRW).append(kWD, rhs.kWD).append(kYD, rhs.kYD).append(kZT, rhs.kZT).append(lAK, rhs.lAK).append(lBP, rhs.lBP).append(lKR, rhs.lKR).append(lRD, rhs.lRD).append(lSL, rhs.lSL).append(lTL, rhs.lTL).append(lVL, rhs.lVL).append(lYD, rhs.lYD).append(mAD, rhs.mAD).append(mDL, rhs.mDL).append(mGA, rhs.mGA).append(mKD, rhs.mKD).append(mMK, rhs.mMK).append(mNT, rhs.mNT).append(mOP, rhs.mOP).append(mRO, rhs.mRO).append(mUR, rhs.mUR).append(mVR, rhs.mVR).append(mWK, rhs.mWK).append(mXN, rhs.mXN).append(mYR, rhs.mYR).append(mZN, rhs.mZN).append(nAD, rhs.nAD).append(nGN, rhs.nGN).append(nIO, rhs.nIO).append(nOK, rhs.nOK).append(nPR, rhs.nPR).append(nZD, rhs.nZD).append(oMR, rhs.oMR).append(pAB, rhs.pAB).append(pEN, rhs.pEN).append(pGK, rhs.pGK).append(pHP, rhs.pHP).append(pKR, rhs.pKR).append(pLN, rhs.pLN).append(pYG, rhs.pYG).append(qAR, rhs.qAR).append(rON, rhs.rON).append(rSD, rhs.rSD).append(rUB, rhs.rUB).append(rWF, rhs.rWF).append(sAR, rhs.sAR).append(sBD, rhs.sBD).append(sCR, rhs.sCR).append(sDG, rhs.sDG).append(sEK, rhs.sEK).append(sGD, rhs.sGD).append(sHP, rhs.sHP).append(sLL, rhs.sLL).append(sOS, rhs.sOS).append(sRD, rhs.sRD).append(sTD, rhs.sTD).append(sVC, rhs.sVC).append(sYP, rhs.sYP).append(sZL, rhs.sZL).append(tHB, rhs.tHB).append(tJS, rhs.tJS).append(tMT, rhs.tMT).append(tND, rhs.tND).append(tOP, rhs.tOP).append(tRY, rhs.tRY).append(tTD, rhs.tTD).append(tWD, rhs.tWD).append(tZS, rhs.tZS).append(uAH, rhs.uAH).append(uGX, rhs.uGX).append(uSD, rhs.uSD).append(uYU, rhs.uYU).append(uZS, rhs.uZS).append(vEF, rhs.vEF).append(vND, rhs.vND).append(vUV, rhs.vUV).append(wST, rhs.wST).append(xAF, rhs.xAF).append(xAG, rhs.xAG).append(xAU, rhs.xAU).append(xCD, rhs.xCD).append(xDR, rhs.xDR).append(xOF, rhs.xOF).append(xPF, rhs.xPF).append(yER, rhs.yER).append(zAR, rhs.zAR).append(zMK, rhs.zMK).append(zMW, rhs.zMW).append(zWL, rhs.zWL).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
