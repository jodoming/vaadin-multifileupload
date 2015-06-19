/*
 * Copyright 2013 gergo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wcs.wcslib.vaadin.widget.multifileupload.component;

import com.vaadin.ui.Component;
import java.util.List;

/**
 *
 * @author gergo
 */
public interface UploadComponent extends Component {

    public void setMaxFileSize(long maxFileSize);

    public void setSizeErrorMsgPattern(String pattern);

    public void setAcceptFilter(String acceptFilter);

    public void setAcceptedMimeTypes(List<String> acceptedMimeTypes);

    public void setMimeTypeErrorMsgPattern(String pattern);

    public void setButtonCaption(String buttonCaption);
    
    public void focus();

    public void interruptUpload(long fileId);
}
