package com.lj.crewpnr.vo.availability;

public class AvailabilitySearchVO {

	private Long oldSegmentId;

	private String origin;

	private String destination;

	private String departureDate;

	private String startDepartureDate;

	private String endDepartureDate;

	private String flightNumber;

	private String fareClass;

	private boolean ignoreResult;

	public Long getOldSegmentId() {
		return oldSegmentId;
	}

	public void setOldSegmentId(Long oldSegmentId) {
		this.oldSegmentId = oldSegmentId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getStartDepartureDate() {
		return startDepartureDate;
	}

	public void setStartDepartureDate(String startDepartureDate) {
		this.startDepartureDate = startDepartureDate;
	}

	public String getEndDepartureDate() {
		return endDepartureDate;
	}

	public void setEndDepartureDate(String endDepartureDate) {
		this.endDepartureDate = endDepartureDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFareClass() {
		return fareClass;
	}

	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}

	public boolean isIgnoreResult() {
		return ignoreResult;
	}

	public void setIgnoreResult(boolean ignoreResult) {
		this.ignoreResult = ignoreResult;
	}
}