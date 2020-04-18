package in.housebuddy.jamshedpurguide;

/**
 * {@link Attraction} represents a place, that users wants to visit
 * It contains resource IDs for the title of the place, description and
 * optional image file for that attraction.
 */

public class Attraction {
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the title of the attraction
     */
    private int mTitleId;
    /**
     * String resource ID for the description of the attraction
     */
    private int mDescriptionId;
    /**
     * Image resource ID for the attraction
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * create new Attraction object
     *
     * @param titleId         is the title of the attraction
     * @param descriptionId   is the description of the attraction
     * @param imageResourceId is the image of the attraction
     */
    public Attraction(int titleId, int descriptionId, int imageResourceId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * create new Attraction object
     *
     * @param titleId       is the title of the attraction
     * @param descriptionId is the description of the attraction
     */

    public Attraction(int titleId, int descriptionId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;

    }


    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the string resource ID for the title of the attraction
     */

    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for the description of the attraction
     */

    public int getDescriptionIdId() {
        return mDescriptionId;
    }


    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
