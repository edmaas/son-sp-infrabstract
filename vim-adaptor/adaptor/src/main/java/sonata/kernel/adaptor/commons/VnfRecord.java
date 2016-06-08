/**
 * @author Dario Valocchi (Ph.D.)
 * @mail d.valocchi@ucl.ac.uk
 * 
 *       Copyright 2016 [Dario Valocchi]
 * 
 *       Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *       except in compliance with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *       Unless required by applicable law or agreed to in writing, software distributed under the
 *       License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *       either express or implied. See the License for the specific language governing permissions
 *       and limitations under the License.
 * 
 */

package sonata.kernel.adaptor.commons;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class VnfRecord {

  @JsonProperty("descriptor_version")
  private String descriptorVersion;
  private String uuid;
  private Status status;
  @JsonProperty("instance_uuid")
  private String instanceUuid;
  @JsonProperty("vnf_address")
  private String vnfAddress;

  @JsonProperty("descriptor_reference_vendor")
  private String descriptorReferenceVendor;
  @JsonProperty("descriptor_reference_name")
  private String descriptorReferenceName;
  @JsonProperty("descriptor_reference_version")
  private String descriptorReferenceVersion;

  @JsonProperty("virtual_deployment_units")
  private ArrayList<VduRecord> virtualDeploymentUnits;


  public VnfRecord() {
    this.virtualDeploymentUnits = new ArrayList<VduRecord>();
  }

  public void addVdu(VduRecord unit) {
    this.virtualDeploymentUnits.add(unit);
  }

  public String getUuid() {
    return uuid;
  }

  public Status getStatus() {
    return status;
  }

  public String getVnfAddress() {
    return vnfAddress;
  }

  public String getDescriptorVersion() {
    return descriptorVersion;
  }

  public void setDescriptorVersion(String descriptorVersion) {
    this.descriptorVersion = descriptorVersion;
  }

  public void setUuid(String id) {
    this.uuid = id;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public void setVnfAddress(String address) {
    this.vnfAddress = address;
  }

  public ArrayList<VduRecord> getVirtualDeploymentUnits() {
    return virtualDeploymentUnits;
  }

  public String getInstanceUuid() {
    return instanceUuid;
  }

  public void setInstanceUuid(String instanceUuid) {
    this.instanceUuid = instanceUuid;
  }

  public void setVirtualDeploymentUnits(ArrayList<VduRecord> virtualDeploymentUnits) {
    this.virtualDeploymentUnits = virtualDeploymentUnits;
  }

  public String getDescriptorReferenceVendor() {
    return descriptorReferenceVendor;
  }

  public String getDescriptorReferenceName() {
    return descriptorReferenceName;
  }

  public String getDescriptorReferenceVersion() {
    return descriptorReferenceVersion;
  }

  public void setDescriptorReferenceVendor(String descriptorReferenceVendor) {
    this.descriptorReferenceVendor = descriptorReferenceVendor;
  }

  public void setDescriptorReferenceName(String descriptorReferenceName) {
    this.descriptorReferenceName = descriptorReferenceName;
  }

  public void setDescriptorReferenceVersion(String descriptorReferenceVersion) {
    this.descriptorReferenceVersion = descriptorReferenceVersion;
  }



}