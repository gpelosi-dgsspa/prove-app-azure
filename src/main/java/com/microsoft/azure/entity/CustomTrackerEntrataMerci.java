package com.microsoft.azure.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table(name = "Custom_Tracker_Entrata_Merci")
public class CustomTrackerEntrataMerci {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "document_number")
        private String documentNumber;

        @Column(name = "document_date")
        private LocalDate documentDate;

        @Column(name = "registration_date")
        private LocalDate registrationDate;

        @Column(name = "acquisition_date")
        private LocalDate acquisitionDate;

        @Column(name = "acquisition_time")
        private String acquisitionTime;

        @Column(name = "ddt")
        private String ddt;

        @Column(name = "document_position")
        private String documentPosition;

        @Column(name = "movement_type")
        private String movementType;

        @Column(name = "movement_case")
        private String movementCase;
        @Column(name = "material")
        private String material;
        @Column(name = "currency")
        private String currency;
        @Column(name = "value")
        private Double value;
        @Column(name = "quantity")
        private Integer quantity;
        @Column(name = "unit_of_measure")
        private String unitOfMeasure;
        @Column(name = "oda")
        private String oda;
        @Column(name = "oda_position")
        private String odaPosition;
        @Column(name="nr_doc_ref")
        private String nrDocRef;
        @Column(name="last_update")
        private Timestamp lastUpdate;

        @Column(name="anno_doc_materiale")
        private String annoDocMateriale;

        public String getAnnoDocMateriale() {
            return annoDocMateriale;
        }

        public void setAnnoDocMateriale(String annoDocMateriale) {
            this.annoDocMateriale = annoDocMateriale;
        }

        public Timestamp getLastUpdate() {
            return lastUpdate;
        }

        public void setLastUpdate(Timestamp lastUpdate) {
            this.lastUpdate = lastUpdate;
        }

        public String getNrDocRef() {
            return nrDocRef;
        }

        public void setNrDocRef(String nrDocRef) {
            this.nrDocRef = nrDocRef;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDocumentNumber() {
            return documentNumber;
        }

        public void setDocumentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
        }

        public LocalDate getDocumentDate() {
            return documentDate;
        }

        public void setDocumentDate(LocalDate documentDate) {
            this.documentDate = documentDate;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
        }

        public LocalDate getAcquisitionDate() {
            return acquisitionDate;
        }

        public void setAcquisitionDate(LocalDate acquisitionDate) {
            this.acquisitionDate = acquisitionDate;
        }

        public String getAcquisitionTime() {
            return acquisitionTime;
        }

        public void setAcquisitionTime(String acquisitionTime) {
            this.acquisitionTime = acquisitionTime;
        }

        public String getDdt() {
            return ddt;
        }

        public void setDdt(String ddt) {
            this.ddt = ddt;
        }

        public String getDocumentPosition() {
            return documentPosition;
        }

        public void setDocumentPosition(String documentPosition) {
            this.documentPosition = documentPosition;
        }

        public String getMovementType() {
            return movementType;
        }

        public void setMovementType(String movementType) {
            this.movementType = movementType;
        }

        public String getMovementCase() {
            return movementCase;
        }

        public void setMovementCase(String movementCase) {
            this.movementCase = movementCase;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        public void setUnitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
        }

        public String getOda() {
            return oda;
        }

        public void setOda(String oda) {
            this.oda = oda;
        }

        public String getOdaPosition() {
            return odaPosition;
        }

        public void setOdaPosition(String odaPosition) {
            this.odaPosition = odaPosition;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CustomTrackerEntrataMerci that = (CustomTrackerEntrataMerci) o;
            return Objects.equals(id, that.id) && Objects.equals(documentNumber, that.documentNumber) && Objects.equals(documentDate, that.documentDate) && Objects.equals(registrationDate, that.registrationDate) && Objects.equals(acquisitionDate, that.acquisitionDate) && Objects.equals(acquisitionTime, that.acquisitionTime) && Objects.equals(ddt, that.ddt) && Objects.equals(documentPosition, that.documentPosition) && Objects.equals(movementType, that.movementType) && Objects.equals(movementCase, that.movementCase) && Objects.equals(material, that.material) && Objects.equals(currency, that.currency) && Objects.equals(value, that.value) && Objects.equals(quantity, that.quantity) && Objects.equals(unitOfMeasure, that.unitOfMeasure) && Objects.equals(oda, that.oda) && Objects.equals(odaPosition, that.odaPosition) && Objects.equals(nrDocRef, that.nrDocRef) && Objects.equals(lastUpdate, that.lastUpdate) && Objects.equals(annoDocMateriale, that.annoDocMateriale);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, documentNumber, documentDate, registrationDate, acquisitionDate, acquisitionTime, ddt, documentPosition, movementType, movementCase, material, currency, value, quantity, unitOfMeasure, oda, odaPosition, nrDocRef, lastUpdate, annoDocMateriale);
        }

        @Override
        public String toString() {
            return "CustomTrackerEntrataMerci{" +
                    "id=" + id +
                    ", documentNumber='" + documentNumber + '\'' +
                    ", documentDate=" + documentDate +
                    ", registrationDate=" + registrationDate +
                    ", acquisitionDate=" + acquisitionDate +
                    ", acquisitionTime='" + acquisitionTime + '\'' +
                    ", ddt='" + ddt + '\'' +
                    ", documentPosition='" + documentPosition + '\'' +
                    ", movementType='" + movementType + '\'' +
                    ", movementCase='" + movementCase + '\'' +
                    ", material='" + material + '\'' +
                    ", currency='" + currency + '\'' +
                    ", value=" + value +
                    ", quantity=" + quantity +
                    ", unitOfMeasure='" + unitOfMeasure + '\'' +
                    ", oda='" + oda + '\'' +
                    ", odaPosition='" + odaPosition + '\'' +
                    ", nrDocRef='" + nrDocRef + '\'' +
                    ", lastUpdate=" + lastUpdate +
                    ", annoDocMateriale='" + annoDocMateriale + '\'' +
                    '}';
        }

}
