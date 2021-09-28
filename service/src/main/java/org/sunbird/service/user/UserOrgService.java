package org.sunbird.service.user;

import java.util.List;
import java.util.Map;
import org.sunbird.request.RequestContext;

public interface UserOrgService {
  public void registerUserToOrg(Map<String, Object> userMap, RequestContext context);

  List<Map<String, Object>> getUserOrgListByUserId(String userId, RequestContext context);
  void deleteUserOrgMapping(
          List<Map<String, Object>> userOrgList, RequestContext context);
}