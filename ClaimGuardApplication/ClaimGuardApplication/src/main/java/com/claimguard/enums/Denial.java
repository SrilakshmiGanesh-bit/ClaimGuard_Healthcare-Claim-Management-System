package com.claimguard.enums;

import com.claimguard.Claim;
import jakarta.persistence.*;

@Entity
@Table(name = "denials")
public class Denial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="claim_id")
    private Claim claim;

    @Column(nullable = false, length = 10)
    private String reasonCode;

    @Column(length = 500)
    private String notes;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private DenialStatus status=DenialStatus.OPEN;

    public Denial(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public DenialStatus getStatus() {
        return status;
    }

    public void setStatus(DenialStatus status) {
        this.status = status;
    }
}
