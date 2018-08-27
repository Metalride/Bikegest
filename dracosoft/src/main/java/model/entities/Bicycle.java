/**
 * 
 */
package model.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author dracosoft
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Bicycle extends Product {
	
	private String kind;
	private Wheel frontWheel;
	private Wheel rearWheel;
	private Fork fork;
	private Frame chassis;
	private SeatPost seatpost;
	private Seat seat;
	private SeatpostClosure spClosure;
	private RearDerailleur rearDerailleur;
	private FrontDerailleur frontDerailleur;
	private Chain chain;
	private Tyre frontTyre;
	private Tyre rearTyre;
	private Tube frontTube;
	private Tube rearTube;
	private BrakeWire frontBrakeWire;
	private BrakeWire rearBrakeWire;
	private BrakeGuide frontBrakeGuide;
	private BrakeGuide rearBrakeGuide;
	private ShiftWire frontShiftWire;
	private ShiftWire rearShiftWire;
	private ShiftGuide frontShiftGuide;
	private ShiftGuide rearShiftGuide;
	private Brake frontBrake;
	private Brake rearBrake;
	
	public Bicycle(int id, String brand, String model, float price, String barcode, String bidi, String kind,
			Wheel frontWheel, Wheel rearWheel, Fork fork, Frame chassis, SeatPost seatpost, Seat seat,
			SeatpostClosure spClosure, RearDerailleur rearDerailleur, FrontDerailleur frontDerailleur, Chain chain,
			Tyre frontTyre, Tyre rearTyre, Tube frontTube, Tube rearTube, BrakeWire frontBrakeWire,
			BrakeWire rearBrakeWire, BrakeGuide frontBrakeGuide, BrakeGuide rearBrakeGuide, ShiftWire frontShiftWire,
			ShiftWire rearShiftWire, ShiftGuide frontShiftGuide, ShiftGuide rearShiftGuide, Brake frontBrake,
			Brake rearBrake) {
		super(id, brand, model, price, barcode, bidi);
		this.kind = kind;
		this.frontWheel = frontWheel;
		this.rearWheel = rearWheel;
		this.fork = fork;
		this.chassis = chassis;
		this.seatpost = seatpost;
		this.seat = seat;
		this.spClosure = spClosure;
		this.rearDerailleur = rearDerailleur;
		this.frontDerailleur = frontDerailleur;
		this.chain = chain;
		this.frontTyre = frontTyre;
		this.rearTyre = rearTyre;
		this.frontTube = frontTube;
		this.rearTube = rearTube;
		this.frontBrakeWire = frontBrakeWire;
		this.rearBrakeWire = rearBrakeWire;
		this.frontBrakeGuide = frontBrakeGuide;
		this.rearBrakeGuide = rearBrakeGuide;
		this.frontShiftWire = frontShiftWire;
		this.rearShiftWire = rearShiftWire;
		this.frontShiftGuide = frontShiftGuide;
		this.rearShiftGuide = rearShiftGuide;
		this.frontBrake = frontBrake;
		this.rearBrake = rearBrake;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Wheel getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}

	public Wheel getRearWheel() {
		return rearWheel;
	}

	public void setRearWheel(Wheel rearWheel) {
		this.rearWheel = rearWheel;
	}

	public Fork getFork() {
		return fork;
	}

	public void setFork(Fork fork) {
		this.fork = fork;
	}

	public Frame getChassis() {
		return chassis;
	}

	public void setChassis(Frame chassis) {
		this.chassis = chassis;
	}

	public SeatPost getSeatpost() {
		return seatpost;
	}

	public void setSeatpost(SeatPost seatpost) {
		this.seatpost = seatpost;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public SeatpostClosure getSpClosure() {
		return spClosure;
	}

	public void setSpClosure(SeatpostClosure spClosure) {
		this.spClosure = spClosure;
	}

	public RearDerailleur getRearDerailleur() {
		return rearDerailleur;
	}

	public void setRearDerailleur(RearDerailleur rearDerailleur) {
		this.rearDerailleur = rearDerailleur;
	}

	public FrontDerailleur getFrontDerailleur() {
		return frontDerailleur;
	}

	public void setFrontDerailleur(FrontDerailleur frontDerailleur) {
		this.frontDerailleur = frontDerailleur;
	}

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	public Tyre getFrontTyre() {
		return frontTyre;
	}

	public void setFrontTyre(Tyre frontTyre) {
		this.frontTyre = frontTyre;
	}

	public Tyre getRearTyre() {
		return rearTyre;
	}

	public void setRearTyre(Tyre rearTyre) {
		this.rearTyre = rearTyre;
	}

	public Tube getFrontTube() {
		return frontTube;
	}

	public void setFrontTube(Tube frontTube) {
		this.frontTube = frontTube;
	}

	public Tube getRearTube() {
		return rearTube;
	}

	public void setRearTube(Tube rearTube) {
		this.rearTube = rearTube;
	}

	public BrakeWire getFrontBrakeWire() {
		return frontBrakeWire;
	}

	public void setFrontBrakeWire(BrakeWire frontBrakeWire) {
		this.frontBrakeWire = frontBrakeWire;
	}

	public BrakeWire getRearBrakeWire() {
		return rearBrakeWire;
	}

	public void setRearBrakeWire(BrakeWire rearBrakeWire) {
		this.rearBrakeWire = rearBrakeWire;
	}

	public BrakeGuide getFrontBrakeGuide() {
		return frontBrakeGuide;
	}

	public void setFrontBrakeGuide(BrakeGuide frontBrakeGuide) {
		this.frontBrakeGuide = frontBrakeGuide;
	}

	public BrakeGuide getRearBrakeGuide() {
		return rearBrakeGuide;
	}

	public void setRearBrakeGuide(BrakeGuide rearBrakeGuide) {
		this.rearBrakeGuide = rearBrakeGuide;
	}

	public ShiftWire getFrontShiftWire() {
		return frontShiftWire;
	}

	public void setFrontShiftWire(ShiftWire frontShiftWire) {
		this.frontShiftWire = frontShiftWire;
	}

	public ShiftWire getRearShiftWire() {
		return rearShiftWire;
	}

	public void setRearShiftWire(ShiftWire rearShiftWire) {
		this.rearShiftWire = rearShiftWire;
	}

	public ShiftGuide getFrontShiftGuide() {
		return frontShiftGuide;
	}

	public void setFrontShiftGuide(ShiftGuide frontShiftGuide) {
		this.frontShiftGuide = frontShiftGuide;
	}

	public ShiftGuide getRearShiftGuide() {
		return rearShiftGuide;
	}

	public void setRearShiftGuide(ShiftGuide rearShiftGuide) {
		this.rearShiftGuide = rearShiftGuide;
	}

	public Brake getFrontBrake() {
		return frontBrake;
	}

	public void setFrontBrake(Brake frontBrake) {
		this.frontBrake = frontBrake;
	}

	public Brake getRearBrake() {
		return rearBrake;
	}

	public void setRearBrake(Brake rearBrake) {
		this.rearBrake = rearBrake;
	}
	
}
