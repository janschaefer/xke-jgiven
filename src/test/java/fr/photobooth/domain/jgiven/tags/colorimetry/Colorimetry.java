package fr.photobooth.domain.jgiven.tags.colorimetry;

import com.tngtech.jgiven.annotation.IsTag;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static fr.photobooth.domain.jgiven.tags.TagColor.COLORIMETRY_COLOR;

@IsTag(type = "Feature", value = "Colorimetry", color = COLORIMETRY_COLOR)
@Retention( RetentionPolicy.RUNTIME )
public @interface Colorimetry {

}
