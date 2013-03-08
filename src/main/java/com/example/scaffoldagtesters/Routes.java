/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.scaffoldagtesters;

import com.example.scaffoldagtesters.model.Customer;
import com.example.scaffoldagtesters.rest.CustomerEndpoint;
import com.example.scaffoldagtesters.model.DiscountVoucher;
import com.example.scaffoldagtesters.rest.DiscountVoucherEndpoint;
import com.example.scaffoldagtesters.model.StoreOrder;
import com.example.scaffoldagtesters.rest.StoreOrderEndpoint;

import org.jboss.aerogear.controller.router.AbstractRoutingModule;
import org.jboss.aerogear.controller.router.MediaType;
import org.jboss.aerogear.controller.router.RequestMethod;

public class Routes extends AbstractRoutingModule
{

   @Override
   public void configuration() throws Exception
   {

      route().from("/customers").on(RequestMethod.GET).consumes(JSON).produces(JSON).to(CustomerEndpoint.class).create(param(Customer.class));
      route().from("/discountvouchers").on(RequestMethod.POST).consumes(JSON).produces(JSON).to(DiscountVoucherEndpoint.class).create(param(DiscountVoucher.class));
      route().from("/storeorders").on(RequestMethod.POST).consumes(JSON).produces(JSON).to(StoreOrderEndpoint.class).create(param(StoreOrder.class));
      /**
      route()
              .from("/projects/{id}")
              .roles("admin")
              .on(RequestMethod.DELETE)
              .consumes(JSON)
              .produces(JSON)
              .to(ProjectEndpoint.class).deleteById(param("id"));
      route()
              .from("/projects/{id}")
              .roles("admin", "simple")
              .on(RequestMethod.GET)
              .consumes(JSON)
              .produces(JSON)
              .to(ProjectEndpoint.class).findById(param("id"));
      route()
              .from("/projects")
              .roles("admin", "simple")
              .on(RequestMethod.GET)
              .consumes(JSON)
              .produces(JSON)
              .to(ProjectEndpoint.class).listAll();
      route()
              .from("/projects/{id}")
              .roles("admin")
              .on(RequestMethod.PUT)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(ProjectEndpoint.class).update(param("id"), param(Project.class));
      route()
              .from("/tasks")
              .roles("admin", "simple")
              .on(RequestMethod.POST)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TaskEndpoint.class).create(param(Task.class));
      route()
              .from("/tasks/{id}")
              .roles("admin", "simple")
              .on(RequestMethod.DELETE)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TaskEndpoint.class).deleteById(param("id"));
      route()
              .from("/tasks/{id}")
              .roles("admin", "simple")
              .on(RequestMethod.GET)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TaskEndpoint.class).findById(param("id"));
      route()
              .from("/tasks")
              .roles("admin", "simple")
              .on(RequestMethod.GET)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TaskEndpoint.class).listAll();
      route()
              .from("/tasks/{id}")
              .roles("admin", "simple")
              .on(RequestMethod.PUT)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TaskEndpoint.class).update(param("id"), param(Task.class));
      route()
              .from("/tags")
              .roles("admin")
              .on(RequestMethod.POST)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TagEndpoint.class).create(param(Tag.class));
      route()
              .from("/tags/{id}")
              .roles("admin")
              .on(RequestMethod.DELETE)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TagEndpoint.class).deleteById(param("id"));
      route()
              .from("/tags/{id}")
              .roles("admin", "simple")
              .on(RequestMethod.GET)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TagEndpoint.class).findById(param("id"));
      route()
              .from("/tags")
              .roles("admin", "simple")
              .on(RequestMethod.GET)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TagEndpoint.class).listAll();
      route()
              .from("/tags/{id}")
              .roles("admin")
              .on(RequestMethod.PUT)
              .consumes(JSON)
              .produces(MediaType.JSON)
              .to(TagEndpoint.class).update(param("id"), param(Tag.class));

      route()
              .from("/auth/login")
              .on(RequestMethod.POST)
              .consumes(JSON)
              .produces(CustomMediaTypeResponder.CUSTOM_MEDIA_TYPE)
              .to(AuthenticationService.class).login(param(AeroGearUser.class));
      route()
              .from("/auth/logout")
              .on(RequestMethod.POST)
              .consumes(JSON)
              .produces(JSON)
              .to(AuthenticationService.class).logout();
      route()
              .from("/auth/enroll")
              .on(RequestMethod.POST)
              .consumes(JSON)
              .produces(CustomMediaTypeResponder.CUSTOM_MEDIA_TYPE)
              .to(AuthenticationService.class).register(param(AeroGearUser.class));
       **/
   }

}
